/**
 * Reads reference data from json files, generated scala libraries
 *
 * Run using:
 * 	go run generate.go
 **/

package main

import (
	"bufio"
	"fmt"
	"github.com/flowcommerce/json-reference/common"
	"github.com/flowcommerce/tools/util"
	"os"
	"regexp"
	"strings"
	"unicode"
)

const Directory = "src/main/scala/io/flow/reference/data"

type Instance struct {
	Name string
	Value string
}

func writeFile(objectName string, imports string, instances []Instance) {
	path := fmt.Sprintf("%s/%s.scala", Directory, objectName)
	fo, err := os.Create(path)
	util.ExitIfError(err, fmt.Sprintf("Error creating file %s: %s", path, err))
	defer fo.Close()

	writer := bufio.NewWriter(fo)

	writer.WriteString("package io.flow.reference.data\n\n")
	writer.WriteString(fmt.Sprintf("import io.flow.reference.v0.models.%s\n\n", imports))
	writer.WriteString(fmt.Sprintf("object %s {\n\n", objectName))

	for _, instance := range(instances) {
		writer.WriteString(fmt.Sprintf("  val %s = %s\n", scalaName(instance.Name), instance.Value))
	}
	writer.WriteString("\n")

	writer.WriteString("  val all = Seq(\n    ")
	for i, instance := range(instances) {
		if i > 0 {
			writer.WriteString(",\n    ")
		}
		writer.WriteString(scalaName(instance.Name))
	}
	writer.WriteString("\n  )\n\n}\n")

	err = writer.Flush()
	util.ExitIfError(err, fmt.Sprintf("Failed to flush file %s: %s", path, err))
	fmt.Printf("  ==> %s\n", path)
}

func main() {
	processLocales()
	processCountries()
	processCurrencies()
	processLanguages()
	processRegions()
	processTimezones()
}

func processCountries() {
	instances := []Instance{}
	for _, c := range common.Countries() {
		measurementSystem := c.MeasurementSystem

		var defaultCurrency string
		if c.DefaultCurrency == "" {
			defaultCurrency = "None"
		} else {
			defaultCurrency = fmt.Sprintf("Some(\"%s\")", c.DefaultCurrency)
		}

		instances = append(instances, Instance{
			Name: c.Iso_3166_3,
			Value: fmt.Sprintf("Country(iso31662 = \"%s\", iso31663 = \"%s\", defaultCurrency = %s, measurementSystem = \"%s\", name = \"%s\", languages = %s, timezones = %s)", c.Iso_3166_2, c.Iso_3166_3, defaultCurrency, measurementSystem, c.Name, scalaArrayQuoted(c.Languages), scalaArrayQuoted(c.Timezones)),
		})
	}

	writeFile("Countries", "Country", instances)
}


func processRegions() {
	instances := []Instance{}
	for _, r := range common.Regions() {
		measurementSystems := []string{}
		for _, system := range(r.MeasurementSystems) {
			measurementSystems = append(measurementSystems, system)
		}

		instances = append(instances, Instance{
			Name: r.Name,
			Value: fmt.Sprintf("Region(id = \"%s\", name = \"%s\", countries = %s, languages = %s, currencies = %s, measurementSystems = %s, timezones = %s)", r.Id, r.Name, scalaArrayQuoted(r.Countries), scalaArrayQuoted(r.Languages), scalaArrayQuoted(r.Currencies), scalaArrayQuoted(measurementSystems), scalaArrayQuoted(r.Timezones)),
		})
	}

	writeFile("Regions", "Region", instances)
}

func processCurrencies() {
	instances := []Instance{}
	for _, c := range common.Currencies() {
		symbols := "None"
		if c.Symbols != nil {
			narrow := "None"
			if c.Symbols.Narrow != "" {
				narrow = fmt.Sprintf("Some(\"%s\")", c.Symbols.Narrow)
			}
			symbols = fmt.Sprintf("Some(CurrencySymbols(primary = \"%s\", narrow = %s))", c.Symbols.Primary, narrow)
		}

		defaultLocale := "None"
		if c.DefaultLocale != "" {
			defaultLocale = fmt.Sprintf("Some(\"%s\")", c.DefaultLocale)
		}

		instances = append(instances, Instance{
			Name: c.Iso_4217_3,
			Value: fmt.Sprintf("Currency(iso42173 = \"%s\", name = \"%s\", numberDecimals = %v, defaultLocale = %s, symbols = %s)", c.Iso_4217_3, c.Name, c.NumberDecimals, defaultLocale, symbols),
		})
	}

	writeFile("Currencies", "{Currency, CurrencySymbols}", instances)
}

func processLanguages() {
	instances := []Instance{}
	for _, l := range common.Languages() {
		instances = append(instances, Instance{
			Name: l.Iso_639_2,
			Value: fmt.Sprintf("Language(iso6392 = \"%s\", name = \"%s\")", l.Iso_639_2, l.Name),
		})
	}

	writeFile("Languages", "Language", instances)
}

func processLocales() {
	instances := []Instance{}
	for _, l := range common.Locales() {
		instances = append(instances, Instance{
			Name: formatLocaleIdForName(l.Id),
			Value: fmt.Sprintf("Locale(id = \"%s\", name = \"%s\", country = \"%s\", language = \"%s\", numbers = LocaleNumbers(decimal = \"%s\", group = \"%s\"))", l.Id, l.Name, l.Country, l.Language, l.Numbers.Decimal, l.Numbers.Group),
		})
	}

	writeFile("Locales", "{Locale, LocaleNumbers}", instances)
}

func processTimezones() {
	instances := []Instance{}
	for _, t := range common.Timezones() {
		instances = append(instances, Instance{
			Name: t.Name,
			Value: fmt.Sprintf("Timezone(name = \"%s\", offset = %d, description = \"%s\")", t.Name, t.Offset, t.Description),
		})
	}

	writeFile("Timezones", "Timezone", instances)
}


func scalaArrayQuoted(values []string) string {
	value := ""
	for i, v := range(values) {
		if i > 0 {
			value = value + ", ";
		}
		value = value + fmt.Sprintf("\"%s\"", v)
	}
	if value == "" {
		return "Nil"
	} else {
		return "Seq(" + value + ")";
	}
}

func scalaArrayUnquoted(values []string) string {
	value := ""
	for i, v := range(values) {
		if i > 0 {
			value = value + ", ";
		}
		value = value + v
	}
	if value == "" {
		return "Nil"
	} else {
		return "Seq(" + value + ")";
	}
}

/**
 * Turns a string name into a scala constant. We do this by:
 *  - replacing '+' with Plus
 *  - replacing '-' with Minus
 *  - replacing any other non alphanumerics into underscores, splitting
 *    on underscore, and init capping
 */
func scalaName(name string) string {
	// +, - handling for timezones
	safe := strings.Replace(name, "+", "_plus_", -1)
	safe = strings.Replace(safe, "-", "_minus_", -1)
	safe = strings.Replace(safe, "&", "and", -1)
	safe = regexp.MustCompile("[^A-Za-z0-9Åçôãéí]+").ReplaceAllString(safe, "_")

	s := ""
	for _, el := range(strings.Split(safe, "_")) {
		s = s + UpcaseInitial(strings.ToLower(el))
	}
	return s
}

func formatLocaleIdForName(id string) string {
	return strings.Replace(id, "-", "_", -1)
}

func UpcaseInitial(str string) string {
    for pos, char := range str {
        return string(unicode.ToUpper(char)) + string([]rune(str)[pos+1:])
    }
    return ""
}

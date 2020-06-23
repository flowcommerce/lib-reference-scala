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
	"strconv"
	"strings"
	"unicode"
)

const Directory = "src/main/scala/io/flow/reference/data"

type Instance struct {
	Name  string
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

	for _, instance := range instances {
		writer.WriteString(fmt.Sprintf("  val %s = %s\n", scalaName(instance.Name), instance.Value))
	}
	writer.WriteString("\n")

	writer.WriteString("  val all = Seq(\n    ")
	for i, instance := range instances {
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
	processPaymentMethods()
	processProvinces()
	processCarriers()
	processCarrierServices()
}

func processCarriers() {
	instances := []Instance{}
	for _, c := range common.Carriers() {
		instances = append(instances, Instance{
			Name:  strings.Replace(c.Id, "-", "_", -1),
			Value: fmt.Sprintf("Carrier(id = \"%s\", name = \"%s\", trackingUrl = \"%s\")", c.Id, c.Name, c.TrackingUrl),
		})
	}

	writeFile("Carriers", "Carrier", instances)
}

func processCarrierServices() {
	instances := []Instance{}
	for _, cs := range common.CarrierServices() {
		instances = append(instances, Instance{
			Name:  strings.Replace(cs.Id, "-", "_", -1),
			Value: fmt.Sprintf("CarrierService(id = \"%s\", name = \"%s\", carrier = io.flow.reference.v0.models.Carrier(id = \"%s\", name = \"%s\", trackingUrl = \"%s\"))", cs.Id, cs.Name, cs.Carrier.Id, cs.Carrier.Name, cs.Carrier.TrackingUrl),
		})
	}

	writeFile("CarrierServices", "CarrierService", instances)
}

func processProvinces() {
	instances := []Instance{}
	for _, p := range common.Provinces() {
		// translations is a list of locales with their translated names
		var localizedTranslations []string
		for _, t := range p.Translations {
			l := t.Locale
			localizedTranslations = append(
				localizedTranslations,
				fmt.Sprintf("io.flow.reference.v0.models.LocalizedTranslation(locale = io.flow.reference.v0.models.Locale(id = \"%s\", name = \"%s\", country = \"%s\", language = \"%s\", numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = \"%s\", group = \"%s\")), name = \"%s\")", l.Id, l.Name, l.Country, l.Language, l.Numbers.Decimal, l.Numbers.Group, t.Name),
			)
		}
		translations := strings.Join(localizedTranslations, ", ")

		// now create the province and simply add the locale translations
		instances = append(instances, Instance{
			Name:  strings.Replace(p.Id, "-", "_", -1),
			Value: fmt.Sprintf("Province(id = \"%s\", iso31662 = \"%s\", name = \"%s\", country = \"%s\", provinceType = io.flow.reference.v0.models.ProvinceType(\"%s\"), translations = Some(Seq(%s)))", p.Id, p.Iso_3166_2, p.Name, p.Country, p.ProvinceType, translations),
		})
	}

	writeFile("Provinces", "Province", instances)
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

		var defaultLanguage string
		if c.DefaultLanguage == "" {
			defaultLanguage = "None"
		} else {
			defaultLanguage = fmt.Sprintf("Some(\"%s\")", c.DefaultLanguage)
		}

		instances = append(instances, Instance{
			Name:  c.Iso_3166_3,
			Value: fmt.Sprintf("Country(iso31662 = \"%s\", iso31663 = \"%s\", defaultCurrency = %s, defaultLanguage = %s, measurementSystem = \"%s\", name = \"%s\", languages = %s, timezones = %s)", c.Iso_3166_2, c.Iso_3166_3, defaultCurrency, defaultLanguage, measurementSystem, c.Name, scalaArrayQuoted(c.Languages), scalaArrayQuoted(c.Timezones)),
		})
	}

	writeFile("Countries", "Country", instances)
}

func processRegions() {
	instances := []Instance{}
	for _, r := range common.Regions() {
		measurementSystems := []string{}
		for _, system := range r.MeasurementSystems {
			measurementSystems = append(measurementSystems, system)
		}

		instances = append(instances, Instance{
			Name:  r.Name,
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
			Name:  c.Iso_4217_3,
			Value: fmt.Sprintf("Currency(iso42173 = \"%s\", name = \"%s\", numberDecimals = %v, defaultLocale = %s, symbols = %s)", c.Iso_4217_3, c.Name, c.NumberDecimals, defaultLocale, symbols),
		})
	}

	writeFile("Currencies", "{Currency, CurrencySymbols}", instances)
}

func processLanguages() {
	instances := []Instance{}
	for _, l := range common.Languages() {
		instances = append(instances, Instance{
			Name:  l.Iso_639_2,
			Value: fmt.Sprintf("Language(iso6392 = \"%s\", name = \"%s\")", l.Iso_639_2, l.Name),
		})
	}

	writeFile("Languages", "Language", instances)
}

func processLocales() {
	instances := []Instance{}
	for _, l := range common.Locales() {
		instances = append(instances, Instance{
			Name:  formatLocaleIdForName(l.Id),
			Value: fmt.Sprintf("Locale(id = \"%s\", name = \"%s\", country = \"%s\", language = \"%s\", numbers = LocaleNumbers(decimal = \"%s\", group = \"%s\"))", l.Id, l.Name, l.Country, l.Language, l.Numbers.Decimal, l.Numbers.Group),
		})
	}

	writeFile("Locales", "{Locale, LocaleNumbers}", instances)
}

func processTimezones() {
	instances := []Instance{}
	for _, t := range common.Timezones() {
		instances = append(instances, Instance{
			Name:  t.Name,
			Value: fmt.Sprintf("Timezone(name = \"%s\", offset = %d, description = \"%s\")", t.Name, t.Offset, t.Description),
		})
	}

	writeFile("Timezones", "Timezone", instances)
}

func processPaymentMethods() {
	instances := []Instance{}
	for _, pm := range common.PaymentMethods() {
		var typ string
		if pm.Type == "card" {
			typ = "PaymentMethodType.Card"
		} else if pm.Type == "online" {
			typ = "PaymentMethodType.Online"
		} else if pm.Type == "offline" {
			typ = "PaymentMethodType.Offline"
		} else {
			fmt.Printf("ERROR: Unknown PaymentMethodType[%s]\n", pm.Type)
			os.Exit(1)
		}

		divider := "\n                                    "
		images := fmt.Sprintf("PaymentMethodImages(%s  small = %s,%s  medium = %s,%s  large = %s%s)", divider, toImage(pm.Images.Small), divider, toImage(pm.Images.Medium), divider, toImage(pm.Images.Large), divider)

		instances = append(instances, Instance{
			Name:  pm.Id,
			Value: fmt.Sprintf("PaymentMethod(id = \"%s\", `type` = %s, name = \"%s\", images = %s, regions = %s, capabilities = Some(%s))", pm.Id, typ, pm.Name, images, scalaArrayQuoted(pm.Regions), scalaArrayQuoted(pm.Capabilities)),
		})
	}

	writeFile("PaymentMethods", "{PaymentMethod, PaymentMethodImage, PaymentMethodImages, PaymentMethodType}", instances)
}

func toImage(i common.PaymentMethodImage) string {
	return fmt.Sprintf("PaymentMethodImage(url = \"%s\", width = %s, height = %s)", i.Url, strconv.Itoa(i.Width), strconv.Itoa(i.Height))
}

func scalaArrayQuoted(values []string) string {
	value := ""
	for i, v := range values {
		if i > 0 {
			value = value + ", "
		}
		value = value + fmt.Sprintf("\"%s\"", v)
	}
	if value == "" {
		return "Nil"
	} else {
		return "Seq(" + value + ")"
	}
}

func scalaArrayUnquoted(values []string) string {
	value := ""
	for i, v := range values {
		if i > 0 {
			value = value + ", "
		}
		value = value + v
	}
	if value == "" {
		return "Nil"
	} else {
		return "Seq(" + value + ")"
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
	for _, el := range strings.Split(safe, "_") {
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

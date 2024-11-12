/*
TO run from project root:
cat script/countries.sc | sbt console
 */
import io.flow.reference.data.Countries
import java.io.{FileOutputStream, PrintWriter}
def cleanStr(str: String) = str.replace("'", "''")
val writer = new PrintWriter(new FileOutputStream("./countries.sql"))
val definition =
  """
    |create schema reference;
    |CREATE TABLE reference.countries (
    |    id numeric not null primary key,
    |    iso31663 character varying(3) NOT NULL,
    |    iso31662 character varying(2) NOT NULL,
    |    languages JSON[],
    |    name text NOT NULL,
    |    measurement_system text,
    |    default_currency text,
    |    default_language text
    |);
    |""".stripMargin
writer.println(definition)
writer.flush()
val lines = Countries.all.zipWithIndex.map {
  case (country, ndx) => {
    val line =
      s"""
         |insert into reference.countries (id,iso31663,iso31662,languages,name,measurement_system,default_currency,default_language) values (${ndx + 1},'${country.iso31663}','${country.iso31662}',array[${country.languages.map(l => s"""'"${l}"'""").mkString(",")}]::json[],'${cleanStr(country.name)}','${country.measurementSystem}','${
        country.defaultCurrency
          .getOrElse("")
      }',${country.defaultLanguage.map(dl => s"'${dl}'").getOrElse(null)});""".stripMargin
    line
  }
}

lines.foreach(l => writer.println(l))
writer.flush()
writer.close()


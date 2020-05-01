package io.flow.reference

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CountriesSpec extends AnyFunSpec with Matchers {

  private[this] lazy val chn = Countries.find("CHN").getOrElse {
    sys.error("CHN Missing")
  }
  private[this] lazy val aus = Countries.find("AUS").getOrElse {
    sys.error("AUS Missing")
  }

  it("be unique") {
    data.Countries.all.groupBy(_.name).filter { _._2.size > 1 }.keys should be(Set())
    data.Countries.all.groupBy(_.iso31662).filter { _._2.size > 1 }.keys should be(Set())
    data.Countries.all.groupBy(_.iso31663).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("be sorted") {
    val all = data.Countries.all.map(_.name)
    val sorted = all.sortBy { _.toLowerCase }

    all.zipWithIndex.foreach { case (value, i) =>
      if (value != sorted(i)) {
        sys.error(s"Countries not sorted starting with[$value] - expected[${sorted(i)}]")
      }
    }
  }

  it("have codes in upper case") {
    data.Countries.all.map(_.iso31662) should be(data.Countries.all.map(_.iso31662.toUpperCase))
    data.Countries.all.map(_.iso31663) should be(data.Countries.all.map(_.iso31663.toUpperCase))
    data.Countries.all.map(_.defaultCurrency.getOrElse("")) should be(data.Countries.all.map(_.defaultCurrency.getOrElse("").toUpperCase))
  }

  it("have measurement systems in lower case") {
    data.Countries.all.map(_.measurementSystem.toString) should be(data.Countries.all.map(_.measurementSystem.toString.toLowerCase))
  }

  it("have no blanks (except for default_currency)") {
    data.Countries.all.find(_.name.trim.isEmpty) should be(None)
    data.Countries.all.find(_.iso31662.trim.isEmpty) should be(None)
    data.Countries.all.find(_.iso31663.trim.isEmpty) should be(None)
  }

  it("codes in use are defined") {
    val all = Seq(
      "ALB", "AND", "ARE", "ARG", "ATG", "AUS", "AUT", "BEL", "BFA", "BGR", "BHS", "CAN", "CHE",
      "CHL", "CHN", "CIV", "CMR", "CRI", "DEU", "DNK", "DOM", "ESP", "EST", "FIN", "FJI", "FRA",
      "GBR", "HKG", "HTI", "IND", "IRL", "ISR", "ITA", "JPN", "KOR", "KWT", "MEX", "MLT", "NLD", "NOR",
      "NZL", "PHL", "POL", "RUS", "SAU", "SGP", "SWE", "THA", "TWN", "USA", "ZAF"
    )

    all.filter { code =>
      Countries.find(code).isEmpty
    } should be(Nil)
  }

  it("have common countries are defined") {
    val usa = Countries.find("usa").getOrElse {
      sys.error("USA missing")
    }
    usa.iso31662 should be("US")
    usa.name should be("United States of America")
    usa.defaultCurrency should be(Some("USD"))
    usa.measurementSystem should be("imperial")
    usa.languages should be(Seq("en"))

    val canada = Countries.find("CAN").getOrElse {
      sys.error("CAN missing")
    }
    canada.iso31662 should be("CA")
    canada.name should be("Canada")
    canada.defaultCurrency should be(Some("CAD"))
    canada.measurementSystem should be("metric")
    canada.languages should be(Seq("en", "fr"))
  }

  it("find") {
    Seq("usa", "USA", " usa ", "us", "US", "united states of america").foreach { name =>
      Countries.find(name).getOrElse {
        sys.error(s"$name missing")
      }
    }

    Countries.find("other") should be(None)
  }

  it("mustFind") {
    Seq("usa", "USA", " usa ", "us", "US", "united states of america").foreach { name =>
      Countries.mustFind(name).iso31663 should be("USA")
    }

    intercept[Throwable] {
      Countries.mustFind("other")
    }.getMessage should be(
      "The following country is invalid: [other]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    )
  }

  it("validate2") {
    Countries.validate2("country of origin", "CHN", "destination", "AUS") should be(Right((chn, aus)))
  }

  it("validate2 with invalid countries") {
    Countries.validate2("origin", "c", "dest", "AUS") should be(
      Left(List(
        "Invalid origin 'c'. Must be a valid ISO 3166-2 or 3166-3 digit code. See https://api.flow.io/reference/countries"
      ))
    )

    Countries.validate2("origin", "chn", "dest", "A") should be(
      Left(List(
        "Invalid dest 'A'. Must be a valid ISO 3166-2 or 3166-3 digit code. See https://api.flow.io/reference/countries"
      ))
    )

    Countries.validate2("origin", "c", "origin", "A") should be(
      Left(List(
        "Invalid origin 'c', 'A'. Must be valid ISO 3166-2 or 3166-3 digit codes. See https://api.flow.io/reference/countries"
      ))
    )
    
    Countries.validate2("origin", "c", "dest", "A") should be(
      Left(
        List(
          "Invalid origin 'c'. Must be a valid ISO 3166-2 or 3166-3 digit code. See https://api.flow.io/reference/countries",
          "Invalid dest 'A'. Must be a valid ISO 3166-2 or 3166-3 digit code. See https://api.flow.io/reference/countries"
        )
      )
    )
  }

  it("validateN with valid countries") {
    Countries.validateN(Nil) should be(Right(Nil))
    Countries.validateN(Seq(("origin", "AUS"))) should be(Right(Seq(aus)))
    Countries.validateN(Seq(("origin", "AUS"), ("dest", "CHN"))) should be(Right(Seq(aus, chn)))
    Countries.validateN(Seq(("origin", "AUS"), ("dest", "CHN"), ("origin", "AUS"), ("dest", "CHN"))) should be(
      Right(Seq(aus, chn, aus, chn))
    )
  }

  it("validateN with invalid countries") {
    Countries.validateN(Seq(("origin", "A"), ("dest", "B"))) should be(
      Left(
        List(
          "Invalid origin 'A'. Must be a valid ISO 3166-2 or 3166-3 digit code. See https://api.flow.io/reference/countries",
          "Invalid dest 'B'. Must be a valid ISO 3166-2 or 3166-3 digit code. See https://api.flow.io/reference/countries"
        )
      )
    )
  }

  it("validate all countries by ISO31662 and ISO31663") {
    Countries.validate(data.Countries.all.map(_.iso31662)) should be (Right(data.Countries.all))
    Countries.validate(data.Countries.all.map(_.iso31663)) should be (Right(data.Countries.all))
  }

  it("return an error for invalid countries for both ISO 3166 2- and 3-character codes") {
    Countries.validate(Seq("Fra", "Mars")) should be(Left(Seq(
      "The following country is invalid: [Mars]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    )))
    Countries.validate(Seq("Fra", "Mars", "Venus", "Jupiter")) should be(Left(Seq(
      "The following countries are invalid: [Mars], [Venus], [Jupiter]. The provided country codes must be valid ISO 3166-2 or 3166-3 codes. See https://api.flow.io/reference/countries for a list of all valid countries."
    )))
  }

  it("return a list of two errors with prefixes for mixed invalid countries for both 3166 2- and 3-character codes") {
    // Test ISO3166-2
    val Left(res0) = Countries.validate(
      ids = Seq(
        "Flowville"
      ),
      prefix = "destination"
    )

    res0 should be(Seq(
      "The following destination country is invalid: [Flowville]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))

    // Test ISO3166-3
    val Left(res1) = Countries.validate(
      ids = Seq(
        "Flowville"
      ),
      prefix = "destination"
    )

    res1 should be(Seq(
      "The following destination country is invalid: [Flowville]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))

    // Test both and verify that duplicates (i.e. the ISO 31662 and ISO 31663 for the same country) are ignored
    val Left(res2) = Countries.validate(
      ids = Seq(
        "Flowville",
        "  Flowville  "
      ),
      prefix = "destination"
    )

    res2 should be(Seq(
      "The following destination country is invalid: [Flowville]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))


    val Left(res3) = Countries.validate(
      ids = Seq(
        data.Countries.Usa.iso31663,
        "Flowville"
      ),
      prefix = "destination"
    )

    res3 should be(Seq(
      "The following destination country is invalid: [Flowville]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))

    val Left(res4) = Countries.validate(
      ids = Seq(
        "Flowville ",
        "Flowville",
        "Flobistan",
        "Flobistan "
      ),
      prefix = "destination"
    )

    res4 should be(Seq(
      "The following destination countries are invalid: [Flowville], [Flobistan]. The provided country codes must be valid ISO 3166-2 or 3166-3 codes. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))
  }

  it("return a list of two errors with suffixes for mixed invalid countries for both 3166 2- and 3-character codes") {
    // Test ISO3166-2
    val Left(res0) = Countries.validate(
      ids = Seq(
        "Flowville"
      ),
      suffix = "of origin"
    )

    res0 should be(Seq(
      "The following country of origin is invalid: [Flowville]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))

    // Test both and verify that duplicates (i.e. the ISO 31662 and ISO 31663 for the same country) are ignored
    val Left(res2) = Countries.validate(
      ids = Seq(
        "Flowville",
        "Flowville"
      ),
      suffix = "of origin"
    )

    res2 should be(Seq(
      "The following country of origin is invalid: [Flowville]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))


    // Test with a valid country included
    val Left(res3) = Countries.validate(
      ids = Seq(
        data.Countries.Usa.iso31663,
        "Flowville"
      ),
      suffix = "of origin"
    )

    res3 should be(Seq(
      "The following country of origin is invalid: [Flowville]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))

    // Test with multiple invalid countries
    val Left(res4) = Countries.validate(
      ids = Seq(
        "Flowville",
        "Flowville",
        "Flobistan",
        "Flobistan"
      ),
      suffix = "of origin"
    )

    res4 should be(Seq(
      "The following countries of origin are invalid: [Flowville], [Flobistan]. The provided country codes must be valid ISO 3166-2 or 3166-3 codes. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))
  }

  it("trims strings and ignores duplicates") {
    val Left(res) = Countries.validate(
      ids = Seq(
        "Flowville   ",
        "   Flowville",
        "Flobistan   ",
        "   Flobistan"
      )
    )

    res should be(Seq(
      "The following countries are invalid: [Flowville], [Flobistan]. The provided country codes must be valid ISO 3166-2 or 3166-3 codes. See https://api.flow.io/reference/countries for a list of all valid countries."
    ))
  }

  it("successfully validate an empty list of ids") {
    Countries.validate(Nil) should be(Right(Nil))
  }

  it("validate a single country") {
    Countries.validateSingle("dom") should be(Right(data.Countries.Dom))
    Countries.validateSingle("do") should be(Right(data.Countries.Dom))
    Countries.validateSingle("DOM") should be(Right(data.Countries.Dom))
    Countries.validateSingle("DO") should be(Right(data.Countries.Dom))
  }

  it("validate a single country and trims provided country code") {
    Countries.validateSingle("dom       ") should be(Right(data.Countries.Dom))
    Countries.validateSingle("        do") should be(Right(data.Countries.Dom))
    Countries.validateSingle("DOM       ") should be(Right(data.Countries.Dom))
    Countries.validateSingle("        DO") should be(Right(data.Countries.Dom))
  }

  it("return an error for a single invalid country") {
    Countries.validateSingle("Mars") should be(Left("The following country is invalid: [Mars]. The provided country code must be a valid ISO 3166-2 or 3166-3 code. See https://api.flow.io/reference/countries for a list of all valid countries."))
  }

  it("proper default language") {
    import io.flow.reference.data.Countries._
    import io.flow.reference.data.Languages._

    Usa.defaultLanguage should equal(Some(En.iso6392))
    Gbr.defaultLanguage should equal(Some(En.iso6392))
    Ita.defaultLanguage should equal(Some(It.iso6392))
    Chn.defaultLanguage should equal(Some(Zh.iso6392))
  }

}

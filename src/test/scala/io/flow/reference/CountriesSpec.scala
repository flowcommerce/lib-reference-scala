package io.flow.reference

import org.scalatest.{FunSpec, Matchers}

class CountriesSpec extends FunSpec with Matchers {

  import scala.concurrent.ExecutionContext.Implicits.global

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
    }.getMessage should be("The following country is invalid: [other]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.")
  }

  it("validate2") {
    Countries.validate2("country of origin", "CHN", "destination", "AUS") should be(Right((chn, aus)))
  }

  it("validate2 with invalid countries") {
    Countries.validate2("origin", "c", "dest", "AUS") should be(
      Left(List("Invalid origin 'c'. Must be a valid ISO 3166 2 or 3 digit code. See https://api.flow.io/reference/countries"))
    )

    Countries.validate2("origin", "chn", "dest", "A") should be(
      Left(List("Invalid dest 'A'. Must be a valid ISO 3166 2 or 3 digit code. See https://api.flow.io/reference/countries"))
    )

    Countries.validate2("origin", "c", "origin", "A") should be(
      Left(
        List(
          "Invalid origin 'c', 'A'. Must be a valid ISO 3166 2 or 3 digit code. See https://api.flow.io/reference/countries"
        )
      )
    )
    
    Countries.validate2("origin", "c", "dest", "A") should be(
      Left(
        List(
          "Invalid origin 'c'. Must be a valid ISO 3166 2 or 3 digit code. See https://api.flow.io/reference/countries",
          "Invalid dest 'A'. Must be a valid ISO 3166 2 or 3 digit code. See https://api.flow.io/reference/countries"
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
          "Invalid origin 'A'. Must be a valid ISO 3166 2 or 3 digit code. See https://api.flow.io/reference/countries",
          "Invalid dest 'B'. Must be a valid ISO 3166 2 or 3 digit code. See https://api.flow.io/reference/countries"
        )
      )
    )
  }

  it("validate all supported countries by ISO31662 and ISO31663") {
    Countries.validate(data.Countries.supported.map(_.iso31662)) should be (Right(data.Countries.supported))
    Countries.validate(data.Countries.supported.map(_.iso31663)) should be (Right(data.Countries.supported))
  }

  it("return an error for invalid countries for both ISO 3166 2- and 3-character codes") {
    Countries.validate(Seq("Fra", "Mars")) should be(Left(Seq("The following country is invalid: [Mars]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.")))
    Countries.validate(Seq("Fra", "Mars", "Venus", "Jupiter")) should be(Left(Seq("The following countries are invalid: [Mars], [Venus], [Jupiter]. The provided ids must be valid ISO 3166 2- or 3-digit codes. See https://api.flow.io/reference/countries for a list of all valid countries.")))
  }

  it("return an error for unsupported countries") {
    // Test ISO3166-2
    Countries.validate(Seq(data.Countries.Afg.iso31662)) should be(
      Left(Seq("The following country is unsupported: [Afghanistan]."))
    )
    Countries.validate(data.Countries.all.map(_.iso31662)) should be(
      Left(
        List("The following countries are unsupported: [Afghanistan], [Angola], [Belarus], [Bouvet Island], [British Indian Ocean Territory], [Burundi], [Christmas Island], [Cocos (Keeling) Islands], [Congo - Kinshasa], [Cuba], [Eritrea], [Faroe Islands], [French Southern Territories], [Heard & McDonald Islands], [Iran], [Iraq], [Liberia], [Macedonia], [Madagascar], [Mozambique], [Myanmar], [Palestine], [South Georgia & South Sandwich Islands], [Sudan], [Suriname], [Syria], [Tajikistan], [Turkmenistan], [U.S. Outlying Islands], [Zimbabwe].")
      )
    )

    // Test ISO3166-3
    Countries.validate(Seq(data.Countries.Afg.iso31663)) should be(
      Left(Seq("The following country is unsupported: [Afghanistan]."))
    )
    Countries.validate(data.Countries.all.map(_.iso31663)) should be(
      Left(
        List("The following countries are unsupported: [Afghanistan], [Angola], [Belarus], [Bouvet Island], [British Indian Ocean Territory], [Burundi], [Christmas Island], [Cocos (Keeling) Islands], [Congo - Kinshasa], [Cuba], [Eritrea], [Faroe Islands], [French Southern Territories], [Heard & McDonald Islands], [Iran], [Iraq], [Liberia], [Macedonia], [Madagascar], [Mozambique], [Myanmar], [Palestine], [South Georgia & South Sandwich Islands], [Sudan], [Suriname], [Syria], [Tajikistan], [Turkmenistan], [U.S. Outlying Islands], [Zimbabwe].")
      )
    )

    // Test both and verify that duplicates (i.e. the ISO 31662 and ISO 31663 for the same country) are ignored
    Countries.validate(Seq(data.Countries.Afg.iso31662, data.Countries.Afg.iso31663)) should be(
      Left(Seq("The following country is unsupported: [Afghanistan]."))
    )
    Countries.validate(data.Countries.all.flatMap(country => Seq(country.iso31662, country.iso31663))) should be(
      Left(
        List("The following countries are unsupported: [Afghanistan], [Angola], [Belarus], [Bouvet Island], [British Indian Ocean Territory], [Burundi], [Christmas Island], [Cocos (Keeling) Islands], [Congo - Kinshasa], [Cuba], [Eritrea], [Faroe Islands], [French Southern Territories], [Heard & McDonald Islands], [Iran], [Iraq], [Liberia], [Macedonia], [Madagascar], [Mozambique], [Myanmar], [Palestine], [South Georgia & South Sandwich Islands], [Sudan], [Suriname], [Syria], [Tajikistan], [Turkmenistan], [U.S. Outlying Islands], [Zimbabwe].")
      )
    )
  }

  it("return a list of two errors for mixed unsupported/invalid countries for both 3166 2- and 3-character codes") {
    // Test ISO3166-2
    val Left(res0) = Countries.validate(Seq(
      data.Countries.Afg.iso31662,
      "Flowville"
    ))

    res0 should be(Seq(
      "The following country is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following country is unsupported: [Afghanistan]."
    ))

    // Test ISO3166-3
    val Left(res1) = Countries.validate(Seq(
      data.Countries.Afg.iso31663,
      "Flowville"
    ))

    res1 should be(Seq(
      "The following country is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following country is unsupported: [Afghanistan]."
    ))

    // Test both and verify that duplicates (i.e. the ISO 31662 and ISO 31663 for the same country) are ignored
    val Left(res2) = Countries.validate(Seq(
      data.Countries.Afg.iso31662,
      data.Countries.Afg.iso31662,
      data.Countries.Afg.iso31663,
      data.Countries.Afg.iso31663,
      "Flowville",
      "Flowville"
    ))

    res2 should be(Seq(
      "The following country is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following country is unsupported: [Afghanistan]."
    ))


    // Test with a supported country included
    val Left(res3) = Countries.validate(Seq(
      data.Countries.Afg.iso31663,
      data.Countries.Usa.iso31663,
      "Flowville"
    ))

    res3 should be(Seq(
      "The following country is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following country is unsupported: [Afghanistan]."
    ))

    // Test with multiple invalid and unsupported
    val Left(res4) = Countries.validate(Seq(
      data.Countries.Afg.iso31663,
      data.Countries.Ago.iso31663,
      "Flowville",
      "Flowville",
      "Flobistan",
      "Flobistan"
    ))

    res4 should be(Seq(
      "The following countries are invalid: [Flowville], [Flobistan]. The provided ids must be valid ISO 3166 2- or 3-digit codes. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following countries are unsupported: [Afghanistan], [Angola]."
    ))
  }

  it("return a list of two errors with prefixes for mixed unsupported/invalid countries for both 3166 2- and 3-character codes") {
    // Test ISO3166-2
    val Left(res0) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31662,
        "Flowville"
      ),
      prefix = "destination"
    )

    res0 should be(Seq(
      "The following destination country is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following destination country is unsupported: [Afghanistan]."
    ))

    // Test ISO3166-3
    val Left(res1) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31663,
        "Flowville"
      ),
      prefix = "destination"
    )

    res1 should be(Seq(
      "The following destination country is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following destination country is unsupported: [Afghanistan]."
    ))

    // Test both and verify that duplicates (i.e. the ISO 31662 and ISO 31663 for the same country) are ignored
    val Left(res2) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31662,
        data.Countries.Afg.iso31662,
        data.Countries.Afg.iso31663,
        data.Countries.Afg.iso31663,
        "Flowville",
        "Flowville"
      ),
      prefix = "destination"
    )

    res2 should be(Seq(
      "The following destination country is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following destination country is unsupported: [Afghanistan]."
    ))


    // Test with a supported country included
    val Left(res3) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31663,
        data.Countries.Usa.iso31663,
        "Flowville"
      ),
      prefix = "destination"
    )

    res3 should be(Seq(
      "The following destination country is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following destination country is unsupported: [Afghanistan]."
    ))

    // Test with multiple invalid and unsupported
    val Left(res4) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31663,
        data.Countries.Ago.iso31663,
        "Flowville",
        "Flowville",
        "Flobistan",
        "Flobistan"
      ),
      prefix = "destination"
    )

    res4 should be(Seq(
      "The following destination countries are invalid: [Flowville], [Flobistan]. The provided ids must be valid ISO 3166 2- or 3-digit codes. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following destination countries are unsupported: [Afghanistan], [Angola]."
    ))
  }

  it("return a list of two errors with suffixes for mixed unsupported/invalid countries for both 3166 2- and 3-character codes") {
    // Test ISO3166-2
    val Left(res0) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31662,
        "Flowville"
      ),
      suffix = "of origin"
    )

    res0 should be(Seq(
      "The following country of origin is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following country of origin is unsupported: [Afghanistan]."
    ))

    // Test ISO3166-3
    val Left(res1) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31663,
        "Flowville"
      ),
      suffix = "of origin"
    )

    res1 should be(Seq(
      "The following country of origin is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following country of origin is unsupported: [Afghanistan]."
    ))

    // Test both and verify that duplicates (i.e. the ISO 31662 and ISO 31663 for the same country) are ignored
    val Left(res2) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31662,
        data.Countries.Afg.iso31662,
        data.Countries.Afg.iso31663,
        data.Countries.Afg.iso31663,
        "Flowville",
        "Flowville"
      ),
      suffix = "of origin"
    )

    res2 should be(Seq(
      "The following country of origin is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following country of origin is unsupported: [Afghanistan]."
    ))


    // Test with a supported country included
    val Left(res3) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31663,
        data.Countries.Usa.iso31663,
        "Flowville"
      ),
      suffix = "of origin"
    )

    res3 should be(Seq(
      "The following country of origin is invalid: [Flowville]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following country of origin is unsupported: [Afghanistan]."
    ))

    // Test with multiple invalid and unsupported
    val Left(res4) = Countries.validate(
      ids = Seq(
        data.Countries.Afg.iso31663,
        data.Countries.Ago.iso31663,
        "Flowville",
        "Flowville",
        "Flobistan",
        "Flobistan"
      ),
      suffix = "of origin"
    )

    res4 should be(Seq(
      "The following countries of origin are invalid: [Flowville], [Flobistan]. The provided ids must be valid ISO 3166 2- or 3-digit codes. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following countries of origin are unsupported: [Afghanistan], [Angola]."
    ))
  }

  it("trims strings and ignores duplicates") {
    val Left(res) = Countries.validate(
      ids = Seq(
        "Afg         ",
        "         Afg",
        "Ago         ",
        "         Ago",
        "Flowville   ",
        "   Flowville",
        "Flobistan   ",
        "   Flobistan"
      )
    )

    res should be(Seq(
      "The following countries are invalid: [Flowville], [Flobistan]. The provided ids must be valid ISO 3166 2- or 3-digit codes. See https://api.flow.io/reference/countries for a list of all valid countries.",
      "The following countries are unsupported: [Afghanistan], [Angola]."
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

  it("validate a single country and trims provided id") {
    Countries.validateSingle("dom       ") should be(Right(data.Countries.Dom))
    Countries.validateSingle("        do") should be(Right(data.Countries.Dom))
    Countries.validateSingle("DOM       ") should be(Right(data.Countries.Dom))
    Countries.validateSingle("        DO") should be(Right(data.Countries.Dom))
  }

  it("return an error for a single invalid country") {
    Countries.validateSingle("Mars") should be(Left("The following country is invalid: [Mars]. The provided id must be a valid ISO 3166 2- or 3-digit code. See https://api.flow.io/reference/countries for a list of all valid countries."))
  }

  it("return an error for a single unsupported country for both ISO 3166 2- and 3-character codes, ignoring case.") {
    Countries.validateSingle("AF") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("Af") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("aF") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("af") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("AFG") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("AfG") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("aFG") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("afG") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("AFg") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("Afg") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("aFg") should be(Left("The following country is unsupported: [Afghanistan]."))
    Countries.validateSingle("afg") should be(Left("The following country is unsupported: [Afghanistan]."))
  }

  it("return an error with prefix for a single unsupported country for both ISO 3166 2- and 3-character codes, ignoring case.") {
    Countries.validateSingle(id = "AF", prefix = "destination") should be(Left("The following destination country is unsupported: [Afghanistan]."))
    Countries.validateSingle(id = "AFG", prefix = "destination") should be(Left("The following destination country is unsupported: [Afghanistan]."))
  }

  it("return an error with suffix for a single unsupported country for both ISO 3166 2- and 3-character codes, ignoring case.") {
    Countries.validateSingle(id = "AF", suffix = "of origin") should be(Left("The following country of origin is unsupported: [Afghanistan]."))
    Countries.validateSingle(id = "AFG", suffix = "of origin") should be(Left("The following country of origin is unsupported: [Afghanistan]."))
  }

}

package io.flow.reference

import org.scalatest.{FunSpec, Matchers}

class RegionsSpec extends FunSpec with Matchers {

  import scala.concurrent.ExecutionContext.Implicits.global

  it("be unique") {
    data.Regions.all.groupBy(_.name).filter { _._2.size > 1 }.keys should be(Set())
    data.Regions.all.groupBy(_.id).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("have ids in lower case") {
    data.Regions.all.map(_.id) should be(data.Regions.all.map(_.id.toLowerCase))
  }

  it("have no blanks") {
    data.Regions.all.find(_.name.trim.isEmpty) should be(None)
    data.Regions.all.find(_.id.trim.isEmpty) should be(None)
  }

  it("codes in use are defined") {
    val all = Seq(
      "africa", "alb", "and", "are", "arg", "atg", "aus", "aut", "bel", "bgr",
      "bhs", "bra", "can", "che", "chl", "chn", "civ", "cri", "deu", "dnk", "dom", "dza", "esp", "est",
      "europe", "eurozone", "fin", "fji", "fra", "gbr", "hkg", "hti", "ind", "irl", "isr", "ita", "jpn",
      "kor", "kwt", "mex", "mlt", "nld", "nor", "nzl", "phl", "pol", "rus", "sau", "sgp", "swe", "tha",
      "twn", "usa", "world", "zaf"
    )

    all.filter { id =>
      Regions.findById(id).isEmpty
    } should be(Nil)
  }

  it("have common regions are defined") {
    val eurozone = data.Regions.all.find(_.id == "eurozone").getOrElse {
      sys.error("eurozone missing")
    }
    eurozone.id should be("eurozone")
    eurozone.name should be("Eurozone")
    eurozone.currencies should be(Seq("EUR"))
    eurozone.countries.size > 10 should be(true)
    eurozone.languages.size > 10 should be(true)
    eurozone.measurementSystems should be(Seq("metric"))
  }

  it("find") {
    Seq("usa", " USA ").foreach { id =>
      Regions.find(id).get.id should be("usa")
      Regions.findById(id).get.id should be("usa")
    }

    Regions.find("other") should be(None)
    Regions.findById("other") should be(None)
  }

  it("mustFind") {
    Seq("usa", "fra").foreach { id =>
      Regions.mustFind(id).id should be(id)
      Regions.mustFindById(id).id should be(id)
    }

    intercept[Throwable] {
      Regions.mustFind("other")
    }.getMessage should be("The following region is invalid: [other]. See https://api.flow.io/reference/regions for a list of all valid regions.")

    intercept[Throwable] {
      Regions.mustFindById("other")
    }.getMessage should be("The following region is invalid: [other]. See https://api.flow.io/reference/regions for a list of all valid regions.")
  }

  it("findBySingleCountry") {
    Seq("usa", " fra ").foreach { name =>
      Regions.findBySingleCountry(name).getOrElse {
        sys.error(s"$name missing")
      }
    }

    val ca = Regions.findBySingleCountry("ca").getOrElse {
      sys.error("Could not find region by canada country code[ca]")
    }
    ca.id should be("can")
    ca.name should be("Canada")
    ca.countries should be(Seq("CAN"))
    ca.languages should be(Seq("en", "fr"))
    ca.measurementSystems should be(Seq("metric"))

    Seq("us", "usa", "fr", "fra", "CA", "CAN", " AU ", " AUS ", " france ", " FRANCE ").foreach { name =>
      Regions.findBySingleCountry(name).getOrElse {
        sys.error(s"$name missing")
      }
    }

    Regions.findBySingleCountry("other") should be(None)
  }

  it("filter") {
    Seq("europe", " EUROPE ", "eurozone", "EUROZONE", "africa", "asia").foreach { id =>
      Regions.filter(id).toList match {
        case one :: Nil => one.id should be(id.trim.toLowerCase)
        case other => sys.error(s"$id should have found one result but found $other")
      }
    }

    Seq("us", "usa", " FR ", " FRA ", "france", " FRANCE ").foreach { name =>
      Regions.filter(name).toList match {
        case Nil => sys.error(s"$name should have found at least one result but found none")
        case _ => {}
      }
    }

    val regions = Regions.filter("fra")
    regions.map(_.name).sorted should be(Seq("Europe", "Eurozone", "France", "World"))
    regions.foreach { r =>
      r.countries.contains("FRA") should be(true)
    }

    Regions.filter("other") should be(Nil)
  }

  it("validate all all regions") {
    Regions.validate(data.Regions.all.map(_.id)) should be(Right(data.Regions.all))
  }

  it("validate an empty list of region ids") {
    Regions.validate(Nil) should be(Right(Nil))
  }

  it("return an error for invalid regions") {
    Regions.validate(Seq("Fra", "Mars")) should be(Left(Seq("The following region is invalid: [Mars]. See https://api.flow.io/reference/regions for a list of all valid regions.")))
    Regions.validate(Seq("Fra", "Mars", "Venus", "Jupiter")) should be(Left(Seq("The following regions are invalid: [Mars], [Venus], [Jupiter]. See https://api.flow.io/reference/regions for a list of all valid regions.")))
  }

  it("ignore duplicates") {
    val Left(res) = Regions.validate(Seq(
      "Flowville",
      "Flowville"
    ))

    res should be(
      Seq(
        "The following region is invalid: [Flowville]. See https://api.flow.io/reference/regions for a list of all valid regions."
      )
    )
  }

  it("trims strings and removes duplicates") {
    val Left(res) = Regions.validate(Seq(
      "Flowville   ",
      "   Flowville"
    ))

    res should be(
      Seq(
        "The following region is invalid: [Flowville]. See https://api.flow.io/reference/regions for a list of all valid regions."
      )
    )
  }

  it("validate a single region") {
    Regions.validateSingle("dom") should be(Right(data.Regions.DominicanRepublic))
    Regions.validateSingle("DOM") should be(Right(data.Regions.DominicanRepublic))
    Regions.validateSingle("DOm") should be(Right(data.Regions.DominicanRepublic))
    Regions.validateSingle("dOm") should be(Right(data.Regions.DominicanRepublic))
    Regions.validateSingle("DoM") should be(Right(data.Regions.DominicanRepublic))
  }

  it("validate a single region and trims provided id") {
    Regions.validateSingle("dom       ") should be(Right(data.Regions.DominicanRepublic))
    Regions.validateSingle("       DOM") should be(Right(data.Regions.DominicanRepublic))
    Regions.validateSingle("   DOm    ") should be(Right(data.Regions.DominicanRepublic))
    Regions.validateSingle("     dOm  ") should be(Right(data.Regions.DominicanRepublic))
    Regions.validateSingle("  DoM     ") should be(Right(data.Regions.DominicanRepublic))
  }

  it("return an error for a single invalid region and trims provided id") {
    Regions.validateSingle("Mars") should be(Left("The following region is invalid: [Mars]. See https://api.flow.io/reference/regions for a list of all valid regions."))
    Regions.validateSingle("        Mars") should be(Left("The following region is invalid: [Mars]. See https://api.flow.io/reference/regions for a list of all valid regions."))
  }
}

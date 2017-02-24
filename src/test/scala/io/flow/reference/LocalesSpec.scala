package io.flow.reference

import org.scalatest.{FunSpec, Matchers}

class LocalesSpec extends FunSpec with Matchers {

  import scala.concurrent.ExecutionContext.Implicits.global

  it("be unique") {
    data.Locales.all.groupBy(_.id).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("be sorted") {
    data.Locales.all.map(_.name) should be(data.Locales.all.map(_.name).sortBy { _.toLowerCase })
  }

  it("have no blanks") {
    data.Locales.all.find(_.id.trim.isEmpty) should be(None)
    data.Locales.all.find(_.name.trim.isEmpty) should be(None)
  }

  it("codes in use are defined") {
    val all = Seq(
      "en-US"
    )

    all.filter { id =>
      Locales.find(id).isEmpty
    } should be(Nil)
  }

  it("have common locales are defined") {  
    val enUs = data.Locales.all.find(_.id == "en-US").getOrElse {
      sys.error("en-US missing")
    }
    enUs.name should be("English - United States")
    enUs.country should be("USA")
    enUs.language should be("en")
    enUs.numbers.decimal should be(".")
    enUs.numbers.group should be(",")

    val frBe = data.Locales.all.find(_.id == "fr-BE").getOrElse {
      sys.error("fr-BE missing")
    }
    frBe.name should be("French - Belgium")
    frBe.country should be("BEL")
    frBe.language should be("fr")
    frBe.numbers.decimal should be(",")
    frBe.numbers.group should be(" ")
  }

  it("find") {
    Seq("en-US", " en-US ", "en-US").foreach { id =>
      Locales.find(id).getOrElse {
        sys.error(s"$id missing")
      }
    }

    Locales.find("other") should be(None)
  }

  it("mustFind") {
    Seq("en-US", " en-US ", "en-US").foreach { id =>
      Locales.mustFind(id).id should be("en-US")
    }

    intercept[Throwable] {
      Locales.mustFind("other")
    }.getMessage should be("The following locale is invalid: [other]. See https://api.flow.io/reference/locales for a list of all valid locales.")
  }

  it("filter by id") {
    Seq("en-US", "fr-BE").foreach { id =>
      Locales.filter(id).toList match {
        case one :: Nil => one.id should be(id)
        case other => sys.error(s"$id should have found one result but found $other")
      }
    }
  }

  it("filter by country") {
    Seq("usa", " FRA ", "france", " FRANCE ").foreach { name =>
      Locales.filter(name).toList match {
        case Nil => sys.error(s"$name should have found at least one result but found none")
        case results => results.foreach { l => l.country should be(Countries.mustFind(name).iso31663) }
      }
    }
  }

  it("filter by language") {
    val locales = Locales.filter("ka")
    locales.foreach { l =>
      l.language should be("ka")
    }
  }

  it("filter by other") {
    Locales.filter("other") should be(Nil)
  }
}

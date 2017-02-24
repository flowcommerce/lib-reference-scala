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
      "en_US"
    )

    all.filter { id =>
      Locales.find(id).isEmpty
    } should be(Nil)
  }

  it("have common locales are defined") {  
    val enUs = data.Locales.all.find(_.id == "en_US").getOrElse {
      sys.error("en_US missing")
    }
    enUs.name should be("English - United States")
    enUs.country should be("USA")
    enUs.language should be("en")
    enUs.numbers.decimal should be(".")
    enUs.numbers.group should be(",")

    val frBe = data.Locales.all.find(_.id == "fr_BE").getOrElse {
      sys.error("fr_BE missing")
    }
    frBe.name should be("French - Belgium")
    frBe.country should be("BEL")
    frBe.language should be("fr")
    frBe.numbers.decimal should be(",")
    frBe.numbers.group should be(" ")
  }

  it("find") {
    Seq("en_US", " en_us ", "EN_US").foreach { id =>
      Locales.find(id).getOrElse {
        sys.error(s"$id missing")
      }
    }

    Locales.find("other") should be(None)
  }

  it("mustFind") {
    Seq("en_US", " en_us ", "EN_US").foreach { id =>
      Locales.mustFind(id).id should be("en_US")
    }

    intercept[Throwable] {
      Locales.mustFind("other")
    }.getMessage should be("The following locale is invalid: [other]. See https://api.flow.io/reference/locales for a list of all valid locales.")
  }
  
}

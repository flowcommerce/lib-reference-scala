package io.flow.reference

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class LanguagesSpec extends AnyFunSpec with Matchers {

  it("be unique") {
    data.Languages.all.groupBy(_.name).filter { _._2.size > 1 }.keys should be(Set())
    data.Languages.all.groupBy(_.iso6392).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("be sorted") {
    data.Languages.all.map(_.name) should be(data.Languages.all.map(_.name).sortBy { _.toLowerCase })
  }

  it("have codes in lower case") {
    data.Languages.all.map(_.iso6392) should be(data.Languages.all.map(_.iso6392.toLowerCase))
  }

  it("have no blanks") {
    data.Languages.all.find(_.name.trim.isEmpty) should be(None)
    data.Languages.all.find(_.iso6392.trim.isEmpty) should be(None)
  }

  it("codes in use are defined") {
    val all = Seq(
      "aa", "af", "ar", "be", "bg", "ca", "cs", "cy", "da", "de", "en", "es", "et", "fa",
      "fi", "fr", "ja", "kg", "ko", "nb", "nl", "pl", "pt", "ru", "sq", "sv", "th", "zh"
    )

    all.filter { code =>
      Languages.find(code).isEmpty
    } should be(Nil)
  }

  it("have common languages are defined") {  
    val english = data.Languages.all.find(_.iso6392 == "en").getOrElse {
      sys.error("english missing")
    }
    english.iso6392 should be("en")
    english.name should be("English")

    val french = data.Languages.all.find(_.iso6392 == "fr").getOrElse {
      sys.error("french missing")
    }
    french.iso6392 should be("fr")
    french.name should be("French")
  }

  it("find") {
    Seq("en", "EN", " en ", " english ").foreach { name =>
      Languages.find(name).getOrElse {
        sys.error(s"$name missing")
      }
    }

    Languages.find("other") should be(None)
  }

  it("mustFind") {
    Seq("en", "EN", " en ", " english ").foreach { name =>
      Languages.mustFind(name).iso6392 should be("en")
    }

    intercept[Throwable] {
      Languages.mustFind("other")
    }.getMessage should be("The following language is invalid: [other]. See https://api.flow.io/reference/languages for a list of all valid languages.")
  }
  
}

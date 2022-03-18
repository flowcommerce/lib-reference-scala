package io.flow.reference

import io.flow.reference.data.Currencies.{Eek, Ltl, Lvl}
import io.flow.reference.v0.models.CurrencySymbols
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CurrenciesSpec extends AnyFunSpec with Matchers {

  it("unsupported") {
    data.Currencies.unsupported.map(_.iso42173).toSeq.sorted should be(Seq(Ltl, Lvl, Eek).map(_.iso42173).sorted)
  }

  it("supported") {
    data.Currencies.supported.nonEmpty should be(true)
    data.Currencies.supported.intersect(data.Currencies.unsupported.toSeq) should be(Nil)
  }

  it("have unique fields") {
    data.Currencies.all.map(_.name) should be(data.Currencies.all.map(_.name).distinct)
    data.Currencies.all.map(_.iso42173) should be(data.Currencies.all.map(_.iso42173).distinct)
  }

  it("be sorted") {
    data.Currencies.all.map(_.name) should be(data.Currencies.all.map(_.name).sortBy { _.toLowerCase })
  }

  it("have codes be in upper case") {
    data.Currencies.all.map(_.iso42173) should be(data.Currencies.all.map(_.iso42173.toUpperCase))
  }

  it("have no blanks") {
    data.Currencies.all.find(_.name.trim.isEmpty) should be(None)
    data.Currencies.all.find(_.iso42173.trim.isEmpty) should be(None)
  }

  it("codes in use are defined") {
    val all = Seq(
      "AED", "AMD", "ARS", "AUD", "BAM", "BGN", "BRL", "BSD", "CAD", "CHF", "CLP", "CNY", "CRC",
      "DKK", "DOP", "DZD", "EUR", "FJD", "GBP", "HKD", "ILS", "INR", "JPY", "KRW", "KWD", "MXN", "NOK",
      "NZD", "PHP", "PLN", "RUB", "SAR", "SEK", "SGD", "THB", "TND", "TWD", "USD", "XCD", "XOF", "ZAR"
    )

    all.filter { code =>
      Currencies.find(code).isEmpty
    } should be(Nil)
  }

  it("have common currencies defined") {
    val usd = data.Currencies.all.find(_.iso42173 == "USD").getOrElse {
      sys.error("USD missing")
    }
    usd.name should be("US Dollars")
    usd.numberDecimals should be(2)

    val canada = data.Currencies.all.find(_.iso42173 == "CAD").getOrElse {
      sys.error("CAD missing")
    }
    canada.name should be("Canadian Dollar")
    canada.numberDecimals should be(2)

    val japan = data.Currencies.all.find(_.iso42173 == "JPY").getOrElse {
      sys.error("JPY missing")
    }
    japan.name should be("Japanese Yen")
    japan.numberDecimals should be(0)
  }
  
  it("find") {
    Seq("usd", "USD", " usd ", "us dollars").foreach { name =>
      Currencies.find(name).getOrElse {
        sys.error(s"$name missing")
      }
    }

    Currencies.find("other") should be(None)
  }
  
  it("mustFind") {
    Seq("usd", "USD", " usd ", "us dollars").foreach { name =>
      Currencies.mustFind(name).iso42173 should be("USD")
    }

    intercept[Throwable] {
      Currencies.mustFind("other")
    }.getMessage should be("The following currency is invalid: [other]. See https://api.flow.io/reference/currencies for a list of all valid currencies.")
  }

  it("should successfully validate an empty list of currencies") {
    Currencies.validate(Nil) should be(Right(Nil))
  }

  it("should successfully validate all valid currencies") {
    Currencies.validate(data.Currencies.all.map(_.iso42173)) should be(Right(data.Currencies.all))
  }

  it("should return a grammatically correct error for a single invalid currency") {
    Currencies.validate(Seq("invalid")) should be(Left(List("The following currency is invalid: [invalid]. See https://api.flow.io/reference/currencies for a list of all valid currencies.")))
    Currencies.validateSingle("invalid") should be(Left("The following currency is invalid: [invalid]. See https://api.flow.io/reference/currencies for a list of all valid currencies."))
    Currencies.validateSingle("invalid", "currency") should be(Left("The following currency is invalid: [invalid]. See https://api.flow.io/reference/currencies for a list of all valid currencies."))
    Currencies.validateSingle("invalid", "foreign") should be(Left("The following foreign currency is invalid: [invalid]. See https://api.flow.io/reference/currencies for a list of all valid currencies."))
  }

  it("should return a grammatically correct error for multiple invalid currencies") {
    Currencies.validate(Seq("totally invalid", "seriously bad", "not a currency")) should be(Left(List(
      "The following currencies are invalid: [totally invalid], [seriously bad], [not a currency]. See https://api.flow.io/reference/currencies for a list of all valid currencies."
    )))
    Currencies.validate(Seq("invalid", "invalid2"), "currency") should be(Left(List(
      "The following currencies are invalid: [invalid], [invalid2]. See https://api.flow.io/reference/currencies for a list of all valid currencies."
    )))
    Currencies.validate(Seq("invalid", "invalid2"), "foreign") should be(Left(List(
      "The following foreign currencies are invalid: [invalid], [invalid2]. See https://api.flow.io/reference/currencies for a list of all valid currencies."
    )))
  }

  it("should return an error validating a list containing both valid and invalid currencies") {
    Currencies.validate(Seq("USD", "invalid")) should be(Left(List("The following currency is invalid: [invalid]. See https://api.flow.io/reference/currencies for a list of all valid currencies.")))
  }

  it("numbers") {
    data.Currencies.Usd.symbols should be(
      Some(CurrencySymbols(primary = "US$", narrow = Some("$")))
    )

    data.Currencies.Aud.symbols should be(
      Some(CurrencySymbols(primary = "A$", narrow = Some("$")))
    )

    data.Currencies.Eur.symbols should be(
      Some(CurrencySymbols(primary = "€", narrow = Some("€")))
    )

    data.Currencies.Gbp.symbols should be(
      Some(CurrencySymbols(primary = "£", narrow = Some("£")))
    )

    data.Currencies.Jpy.symbols should be(
      Some(CurrencySymbols(primary = "¥", narrow = Some("¥")))
    )
  }

  it("defaultLocale") {
    data.Currencies.Usd.defaultLocale should be(Some("en-US"))
    data.Currencies.Aud.defaultLocale should be(Some("en-AU"))
    data.Currencies.Eur.defaultLocale should be(Some("de"))
    data.Currencies.Gbp.defaultLocale should be(Some("en-GB"))
    data.Currencies.Jpy.defaultLocale should be(Some("ja-JP"))
  }  
}

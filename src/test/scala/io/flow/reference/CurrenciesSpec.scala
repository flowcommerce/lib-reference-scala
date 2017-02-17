package io.flow.reference

import org.scalatest.{FunSpec, Matchers}

class CurrenciesSpec extends FunSpec with Matchers {

  import scala.concurrent.ExecutionContext.Implicits.global

  it("have unique fields") {
    data.Currencies.all.map(_.name) should be(data.Currencies.all.map(_.name).distinct)
    data.Currencies.all.map(_.iso42173) should be(data.Currencies.all.map(_.iso42173).distinct)
  }

  it("be sorted") {
    // TODO: Sort
    // data.Currencies.all.map(_.name) should be(data.Currencies.all.map(_.name).sortBy { _.toLowerCase })
  }

  it("have codes be in upper case") {
    data.Currencies.all.map(_.iso42173) should be(data.Currencies.all.map(_.iso42173.toUpperCase))
  }

  it("have no blanks") {
    data.Currencies.all.find(_.name.trim.isEmpty) should be(None)
    data.Currencies.all.find(_.iso42173.trim.isEmpty) should be(None)
  }

  it("have common currencies defined") {
    val usd = data.Currencies.all.find(_.iso42173 == "USD").getOrElse {
      sys.error("USD missing")
    }
    usd.name should be("US Dollar")
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
    Seq("usd", "USD", " usd ", "us dollar").foreach { name =>
      Currencies.find(name).getOrElse {
        sys.error(s"$name missing")
      }
    }

    Currencies.find("other") should be(None)
  }
  
  it("mustFind") {
    Seq("usd", "USD", " usd ", "us dollar").foreach { name =>
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
  }

  it("should return a grammatically correct error for multiple invalid currencies") {
    Currencies.validate(Seq("totally invalid", "seriously bad", "not a currency")) should be(Left(List("The following currencies are invalid: [totally invalid], [seriously bad], [not a currency]. See https://api.flow.io/reference/currencies for a list of all valid currencies.")))
  }

  it("should return an error validating a list containing both valid and invalid currencies") {
    Currencies.validate(Seq("USD", "invalid")) should be(Left(List("The following currency is invalid: [invalid]. See https://api.flow.io/reference/currencies for a list of all valid currencies.")))
  }
}

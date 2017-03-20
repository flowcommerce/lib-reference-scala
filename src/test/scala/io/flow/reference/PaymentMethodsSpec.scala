package io.flow.reference

import io.flow.reference.v0.models.PaymentMethodType
import org.scalatest.{FunSpec, Matchers}

class PaymentMethodsSpec extends FunSpec with Matchers {

  it("be unique") {
    data.PaymentMethods.all.groupBy(_.name).filter { _._2.size > 1 }.keys should be(Set())
    data.PaymentMethods.all.groupBy(_.id).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("be sorted") {
    data.PaymentMethods.all.map(_.name) should be(data.PaymentMethods.all.map(_.name).sortBy { _.toLowerCase })
  }

  it("have ids in lower case") {
    data.PaymentMethods.all.map(_.id) should be(data.PaymentMethods.all.map(_.id.toLowerCase))
  }

  it("have no blanks") {
    data.PaymentMethods.all.find(_.name.trim.isEmpty) should be(None)
    data.PaymentMethods.all.find(_.id.trim.isEmpty) should be(None)
  }

  it("codes in use are defined") {
    val all = Seq(
      "visa", "mastercard", "american_express", "paypal"
    )

    all.filter { id =>
      PaymentMethods.find(id).isEmpty
    } should be(Nil)
  }

  it("have common PaymentMethods are defined") {
    val visa = data.PaymentMethods.all.find(_.id == "visa").getOrElse {
      sys.error("visa missing")
    }
    visa.id should be("visa")
    visa.name should be("VISA")
    visa.`type` should be(PaymentMethodType.Card)

    val paypal = data.PaymentMethods.all.find(_.id == "paypal").getOrElse {
      sys.error("paypal missing")
    }
    paypal.id should be("paypal")
    paypal.name should be("Paypal")
    paypal.`type` should be(PaymentMethodType.Online)
  }

  it("find") {
    Seq("visa", "VISA", " visa ").foreach { name =>
      PaymentMethods.find(name).getOrElse {
        sys.error(s"$name missing")
      }
    }

    PaymentMethods.find("other") should be(None)
  }

  it("mustFind") {
    Seq("visa", "VISA", " visa ").foreach { name =>
      PaymentMethods.mustFind(name).id should be("visa")
    }

    intercept[Throwable] {
      PaymentMethods.mustFind("other")
    }.getMessage should be("The following payment method is invalid: [other]. See https://api.flow.io/reference/payment-methods for a list of all valid payment methods.")
  }
  
}

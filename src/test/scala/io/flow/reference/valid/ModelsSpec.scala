package io.flow.reference.valid

import io.flow.reference.data
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class ModelsSpec extends AnyFunSpec with Matchers {

  it("Carriers") {
    Carriers.validate(data.Carriers.Dhl.id).isValid shouldBe true
    Carriers.validate("foo").isValid shouldBe false
    Carriers.validate(Seq(data.Carriers.Dhl.id)).isValid shouldBe true
    Carriers.validate(Seq("foo")).isValid shouldBe false
  }

  it("CarrierServices") {
    CarrierServices.validate(data.CarrierServices.DhlEcommerceStandard.id).isValid shouldBe true
    CarrierServices.validate("foo").isValid shouldBe false
    CarrierServices.validate(Seq(data.CarrierServices.DhlEcommerceStandard.id)).isValid shouldBe true
    CarrierServices.validate(Seq("foo")).isValid shouldBe false
  }

  it("Countries") {
    Countries.validate(data.Countries.Uga.iso31662).isValid shouldBe true
    Countries.validate("foo").isValid shouldBe false
    Countries.validate(Seq(data.Countries.Uga.iso31662)).isValid shouldBe true
    Countries.validate(Seq("foo")).isValid shouldBe false
  }

  it("Currencies") {
    Currencies.validate(data.Currencies.Uah.iso42173).isValid shouldBe true
    Currencies.validate("foo").isValid shouldBe false
    Currencies.validate(Seq(data.Currencies.Uah.iso42173)).isValid shouldBe true
    Currencies.validate(Seq("foo")).isValid shouldBe false
  }

  it("Languages") {
    Languages.validate(data.Languages.En.iso6392).isValid shouldBe true
    Languages.validate("foo").isValid shouldBe false
    Languages.validate(Seq(data.Languages.En.iso6392)).isValid shouldBe true
    Languages.validate(Seq("foo")).isValid shouldBe false
  }

  it("Locales") {
    Locales.validate(data.Locales.EnAi.id).isValid shouldBe true
    Locales.validate("foo").isValid shouldBe false
    Locales.validate(Seq(data.Locales.EnAi.id)).isValid shouldBe true
    Locales.validate(Seq("foo")).isValid shouldBe false
  }

  it("PaymentMethods") {
    PaymentMethods.validate(data.PaymentMethods.Paypal.id).isValid shouldBe true
    PaymentMethods.validate("foo").isValid shouldBe false
    PaymentMethods.validate(Seq(data.PaymentMethods.Paypal.id)).isValid shouldBe true
    PaymentMethods.validate(Seq("foo")).isValid shouldBe false
  }

  it("Provinces") {
    Provinces.validate(data.Provinces.CanAb.id).isValid shouldBe true
    Provinces.validate("foo").isValid shouldBe false
    Provinces.validate(Seq(data.Provinces.CanAb.id)).isValid shouldBe true
    Provinces.validate(Seq("foo")).isValid shouldBe false
  }

  it("Regions") {
    Regions.validate(data.Regions.Europe.id).isValid shouldBe true
    Regions.validate("foo").isValid shouldBe false
    Regions.validate(Seq(data.Regions.Europe.id)).isValid shouldBe true
    Regions.validate(Seq("foo")).isValid shouldBe false
  }

  it("Timezones") {
    Timezones.validate(data.Timezones.Est.name).isValid shouldBe true
    Timezones.validate("foo").isValid shouldBe false
    Timezones.validate(Seq(data.Timezones.Est.name)).isValid shouldBe true
    Timezones.validate(Seq("foo")).isValid shouldBe false
  }

}

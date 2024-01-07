package io.flow.reference.valid

import io.flow.reference.data
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class ModelsSpec extends AnyFunSpec with Matchers {

  it("Carriers") {
    Carriers.validateSingle(data.Carriers.Dhl.id).isValid shouldBe true
    Carriers.validateSingle("foo").isValid shouldBe false
  }

  it("CarrierServices") {
    CarrierServices.validateSingle(data.CarrierServices.DhlEcommerceStandard.id).isValid shouldBe true
    CarrierServices.validateSingle("foo").isValid shouldBe false
  }

  it("Countries") {
    Countries.validateSingle(data.Countries.Uga.iso31662).isValid shouldBe true
    Countries.validateSingle("foo").isValid shouldBe false
  }

  it("Currencies") {
    Currencies.validateSingle(data.Currencies.Uah.iso42173).isValid shouldBe true
    Currencies.validateSingle("foo").isValid shouldBe false
  }

  it("Languages") {
    Languages.validateSingle(data.Languages.En.iso6392).isValid shouldBe true
    Languages.validateSingle("foo").isValid shouldBe false
  }

  it("Locales") {
    Locales.validateSingle(data.Locales.EnAi.id).isValid shouldBe true
    Locales.validateSingle("foo").isValid shouldBe false
  }

  it("PaymentMethods") {
    PaymentMethods.validateSingle(data.PaymentMethods.Paypal.id).isValid shouldBe true
    PaymentMethods.validateSingle("foo").isValid shouldBe false
  }

  it("Provinces") {
    Provinces.validateSingle(data.Provinces.CanAb.id).isValid shouldBe true
    Provinces.validateSingle("foo").isValid shouldBe false
  }

  it("Regions") {
    Regions.validateSingle(data.Regions.Europe.id).isValid shouldBe true
    Regions.validateSingle("foo").isValid shouldBe false
  }

  it("Timezones") {
    Timezones.validateSingle(data.Timezones.Est.name).isValid shouldBe true
    Timezones.validateSingle("foo").isValid shouldBe false
  }

}

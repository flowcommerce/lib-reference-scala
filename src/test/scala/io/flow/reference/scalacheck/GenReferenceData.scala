package io.flow.reference

import io.flow.reference.v0.models._
import org.scalacheck.{Arbitrary, Gen}

package object scalacheck {

  implicit val arbitraryCarrier: Arbitrary[Carrier] = Arbitrary(genCarrier)
  lazy val genCarrier: Gen[Carrier] = Gen.oneOf(data.Carriers.all)

  implicit val arbitraryCarrierService: Arbitrary[CarrierService] = Arbitrary(genCarrierService)
  lazy val genCarrierService: Gen[CarrierService] = Gen.oneOf(data.CarrierServices.all)

  implicit val arbitraryCountry: Arbitrary[Country] = Arbitrary(genCountry)
  lazy val genCountry: Gen[Country] = Gen.oneOf(data.Countries.all)

  implicit val arbitraryCurrency: Arbitrary[Currency] = Arbitrary(genCurrency)
  lazy val genCurrency: Gen[Currency] = Gen.oneOf(data.Currencies.all)

  implicit val arbitraryLanguage: Arbitrary[Language] = Arbitrary(genLanguage)
  lazy val genLanguage: Gen[Language] = Gen.oneOf(data.Languages.all)

  implicit val arbitraryLocale: Arbitrary[Locale] = Arbitrary(genLocale)
  lazy val genLocale: Gen[Locale] = Gen.oneOf(data.Locales.all)

  implicit val arbitraryPaymentMethod: Arbitrary[PaymentMethod] = Arbitrary(genPaymentMethod)
  lazy val genPaymentMethod: Gen[PaymentMethod] = Gen.oneOf(data.PaymentMethods.all)

  implicit val arbitraryProvince: Arbitrary[Province] = Arbitrary(genProvince)
  lazy val genProvince: Gen[Province] = Gen.oneOf(data.Provinces.all)

  implicit val arbitraryRegion: Arbitrary[Region] = Arbitrary(genRegion)
  lazy val genRegion: Gen[Region] = Gen.oneOf(data.Regions.all)

  implicit val arbitraryTimezone: Arbitrary[Timezone] = Arbitrary(genTimezone)
  lazy val genTimezone: Gen[Timezone] = Gen.oneOf(data.Timezones.all)

}

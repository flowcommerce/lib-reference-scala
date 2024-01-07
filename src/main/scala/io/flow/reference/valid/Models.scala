package io.flow.reference.valid

import io.flow.reference._
import io.flow.reference.v0.models._

object Carriers extends BaseCarriers with Validation[Carrier]
object CarrierServices extends BaseCarrierServices with Validation[CarrierService]
object Countries extends BaseCountries with Validation[Country]
object Currencies extends BaseCurrencies with Validation[Currency]
object Languages extends BaseLanguages with Validation[Language]
object Locales extends BaseLocales with Validation[Locale]
object PaymentMethods extends BasePaymentMethods with Validation[PaymentMethod]
object Provinces extends BaseProvinces with Validation[Province]
object Regions extends BaseRegions with Validation[Region]
object Timezones extends BaseTimezones with Validation[Timezone]

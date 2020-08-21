/**
 * Generated by API Builder - https://www.apibuilder.io
 * Service version: 0.9.38
 * apibuilder 0.15.9 app.apibuilder.io/flow/reference/latest/scala_models
 */
package io.flow.reference.v0.models {

  /**
   * Partner that actually takes a shipment between places (ex: FedEx, DHL, SF
   * Express)
   */
  final case class Carrier(
    id: String,
    name: String,
    trackingUrl: String
  )

  /**
   * Specific service rendered by the carrier (fedex ground saturday, ups overnight
   * weekend, etc)
   */
  final case class CarrierService(
    id: String,
    carrier: io.flow.reference.v0.models.Carrier,
    name: String
  )

  /**
   * ISO 3166 country codes. Note Flow APIs will accept either the 2 or 3 character
   * country code, but internally we normalize data and store as the 3 character,
   * upper case ISO code. See https://api.flow.io/reference/countries
   *
   * @param iso31662 ISO 3166 2-character country code. See https://api.flow.io/reference/countries
   * @param iso31663 ISO 3166 3-character country code. See https://api.flow.io/reference/countries
   * @param languages A list of the languages spoken in this country
   * @param defaultCurrency ISO 4217 3-character currency code. See https://api.flow.io/reference/currencies
   * @param defaultLanguage ISO 639 2-character language code. See https://api.flow.io/reference/languages
   * @param timezones A list of canonical timezone IDs for the country. See
   *        http://joda-time.sourceforge.net/timezones.html
   * @param defaultDeliveredDuty Default delivered duty value. See https://en.wikipedia.org/wiki/Incoterms for
   *        more information
   */
  final case class Country(
    name: String,
    iso31662: String,
    iso31663: String,
    languages: Seq[String],
    measurementSystem: String,
    defaultCurrency: _root_.scala.Option[String] = None,
    defaultLanguage: _root_.scala.Option[String] = None,
    timezones: Seq[String],
    defaultDeliveredDuty: _root_.scala.Option[String] = None
  )

  /**
   * ISO 4217 3-character currency code. See https://api.flow.io/reference/currencies
   *
   * @param numberDecimals The number of decimal places used by the given currency. For example, USD has 2
   *        decimals while JPY has 0.
   * @param defaultLocale The locale id of the default locale to use when rendering this currency
   */
  final case class Currency(
    name: String,
    iso42173: String,
    numberDecimals: Int,
    symbols: _root_.scala.Option[io.flow.reference.v0.models.CurrencySymbols] = None,
    defaultLocale: _root_.scala.Option[String] = None
  )

  /**
   * Defines one or more symbols representing this currency
   */
  final case class CurrencySymbols(
    primary: String,
    narrow: _root_.scala.Option[String] = None
  )

  /**
   * ISO 639 2-character language code. See https://api.flow.io/reference/languages
   */
  final case class Language(
    name: String,
    iso6392: String
  )

  /**
   * Locales defines standard conventions for presentation of content. See
   * https://api.flow.io/reference/locales
   *
   * @param country ISO 3166 3 country code
   * @param language ISO 639 2 language code
   */
  final case class Locale(
    id: String,
    name: String,
    country: String,
    language: String,
    numbers: io.flow.reference.v0.models.LocaleNumbers
  )

  /**
   * Number formats defined for a given locale
   *
   * @param decimal Decimal separator
   * @param group Group separator (e.g. 1,000 have a group separator of ',')
   */
  final case class LocaleNumbers(
    decimal: String,
    group: String
  )

  /**
   * Localized translation of a given province/region/country
   *
   * @param name Text translated to the appropriate locale
   */
  final case class LocalizedTranslation(
    locale: io.flow.reference.v0.models.Locale,
    name: String
  )

  /**
   * Represents a single payment method - e.g VISA or Paypal - and any associated
   * metadata required for processing
   *
   * @param regions List of region ids in which this payment method is available
   * @param capabilities List of capabilities available for this payment method
   */
  final case class PaymentMethod(
    id: String,
    `type`: io.flow.reference.v0.models.PaymentMethodType,
    name: String,
    images: io.flow.reference.v0.models.PaymentMethodImages,
    regions: Seq[String],
    capabilities: _root_.scala.Option[Seq[io.flow.reference.v0.models.PaymentMethodCapability]] = None
  )

  final case class PaymentMethodImage(
    url: String,
    width: Int,
    height: Int
  )

  final case class PaymentMethodImages(
    small: io.flow.reference.v0.models.PaymentMethodImage,
    medium: io.flow.reference.v0.models.PaymentMethodImage,
    large: io.flow.reference.v0.models.PaymentMethodImage
  )

  /**
   * A subdivision/province/state within a country. These conform to the ISO 3166-2
   * standard for country subdivisions. See https://api.flow.io/reference/provinces
   *
   * @param country ISO 3166 3 code of the country for this subdivision
   */
  final case class Province(
    id: String,
    iso31662: String,
    name: String,
    country: String,
    provinceType: io.flow.reference.v0.models.ProvinceType,
    translations: _root_.scala.Option[Seq[io.flow.reference.v0.models.LocalizedTranslation]] = None
  )

  /**
   * A region represents a geographic area of the world. Regions can be countries,
   * continents or other political areas (like the Eurozone). See
   * https://api.flow.io/reference/regions
   *
   * @param countries A list of the countries as ISO 3166 3 codes in this region
   * @param currencies A list of the currencies as ISO 4217 3 codes in this region
   * @param languages A list of the languages as ISO 639 2 codes spoken in this region
   * @param measurementSystems A list of the measurement systems in use in this region (metric or imperial)
   * @param timezones A list of canonical timezone IDs for the region. See
   *        http://joda-time.sourceforge.net/timezones.html
   */
  final case class Region(
    id: String,
    name: String,
    countries: Seq[String],
    currencies: Seq[String],
    languages: Seq[String],
    measurementSystems: Seq[String],
    timezones: Seq[String]
  )

  /**
   * Time zone data is provided by the public IANA time zone database. See
   * http://www.iana.org/time-zones
   *
   * @param offset Minutes offset from GMT
   */
  final case class Timezone(
    name: String,
    description: String,
    offset: Int
  )

  /**
   * The payment method capabilities.
   */
  sealed trait PaymentMethodCapability extends _root_.scala.Product with _root_.scala.Serializable

  object PaymentMethodCapability {

    /**
     * Credit cards provide access to a line of debt issued by a bank.
     */
    case object Credit extends PaymentMethodCapability { override def toString = "credit" }
    /**
     * Debit cards deduct money directly from a bank account.
     */
    case object Debit extends PaymentMethodCapability { override def toString = "debit" }

    /**
     * UNDEFINED captures values that are sent either in error or
     * that were added by the server after this library was
     * generated. We want to make it easy and obvious for users of
     * this library to handle this case gracefully.
     *
     * We use all CAPS for the variable name to avoid collisions
     * with the camel cased values above.
     */
    final case class UNDEFINED(override val toString: String) extends PaymentMethodCapability

    /**
     * all returns a list of all the valid, known values. We use
     * lower case to avoid collisions with the camel cased values
     * above.
     */
    val all: scala.List[PaymentMethodCapability] = scala.List(Credit, Debit)

    private[this]
    val byName: Map[String, PaymentMethodCapability] = all.map(x => x.toString.toLowerCase -> x).toMap

    def apply(value: String): PaymentMethodCapability = fromString(value).getOrElse(UNDEFINED(value))

    def fromString(value: String): _root_.scala.Option[PaymentMethodCapability] = byName.get(value.toLowerCase)

  }

  /**
   * The payment method type defines at a high level different user experiences that
   * are required to accept payment of this type. By enabling a payment method type,
   * you are specifying that you have completed the integration and all payment
   * methods of this type become available for offer to your users.
   */
  sealed trait PaymentMethodType extends _root_.scala.Product with _root_.scala.Serializable

  object PaymentMethodType {

    /**
     * Represents all form of card payment (e.g. credit, debit, etc.)
     */
    case object Card extends PaymentMethodType { override def toString = "card" }
    /**
     * Represents the most common form of alternative payment methods which require
     * some degree of integration online (e.g. a redirect) to complete payment.
     */
    case object Online extends PaymentMethodType { override def toString = "online" }
    /**
     * Offline payment method types represent payments like Cash On Delivery which
     * require offline collection
     */
    case object Offline extends PaymentMethodType { override def toString = "offline" }

    /**
     * UNDEFINED captures values that are sent either in error or
     * that were added by the server after this library was
     * generated. We want to make it easy and obvious for users of
     * this library to handle this case gracefully.
     *
     * We use all CAPS for the variable name to avoid collisions
     * with the camel cased values above.
     */
    final case class UNDEFINED(override val toString: String) extends PaymentMethodType

    /**
     * all returns a list of all the valid, known values. We use
     * lower case to avoid collisions with the camel cased values
     * above.
     */
    val all: scala.List[PaymentMethodType] = scala.List(Card, Online, Offline)

    private[this]
    val byName: Map[String, PaymentMethodType] = all.map(x => x.toString.toLowerCase -> x).toMap

    def apply(value: String): PaymentMethodType = fromString(value).getOrElse(UNDEFINED(value))

    def fromString(value: String): _root_.scala.Option[PaymentMethodType] = byName.get(value.toLowerCase)

  }

  /**
   * Local terminology for province
   */
  sealed trait ProvinceType extends _root_.scala.Product with _root_.scala.Serializable

  object ProvinceType {

    case object City extends ProvinceType { override def toString = "city" }
    case object Dependency extends ProvinceType { override def toString = "dependency" }
    case object District extends ProvinceType { override def toString = "district" }
    case object Emirate extends ProvinceType { override def toString = "emirate" }
    case object Entity extends ProvinceType { override def toString = "entity" }
    case object Municipality extends ProvinceType { override def toString = "municipality" }
    case object OutlyingArea extends ProvinceType { override def toString = "outlying_area" }
    case object Parish extends ProvinceType { override def toString = "parish" }
    case object Province extends ProvinceType { override def toString = "province" }
    case object State extends ProvinceType { override def toString = "state" }
    case object Territory extends ProvinceType { override def toString = "territory" }
    case object Other extends ProvinceType { override def toString = "other" }

    /**
     * UNDEFINED captures values that are sent either in error or
     * that were added by the server after this library was
     * generated. We want to make it easy and obvious for users of
     * this library to handle this case gracefully.
     *
     * We use all CAPS for the variable name to avoid collisions
     * with the camel cased values above.
     */
    final case class UNDEFINED(override val toString: String) extends ProvinceType

    /**
     * all returns a list of all the valid, known values. We use
     * lower case to avoid collisions with the camel cased values
     * above.
     */
    val all: scala.List[ProvinceType] = scala.List(City, Dependency, District, Emirate, Entity, Municipality, OutlyingArea, Parish, Province, State, Territory, Other)

    private[this]
    val byName: Map[String, ProvinceType] = all.map(x => x.toString.toLowerCase -> x).toMap

    def apply(value: String): ProvinceType = fromString(value).getOrElse(UNDEFINED(value))

    def fromString(value: String): _root_.scala.Option[ProvinceType] = byName.get(value.toLowerCase)

  }

}
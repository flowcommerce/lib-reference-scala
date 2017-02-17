/**
 * Generated by apidoc - http://www.apidoc.me
 * Service version: 0.1.73
 * apidoc:0.11.49 http://www.apidoc.me/flow/reference/0.1.73/scala_models
 */
package io.flow.reference.v0.models {

  /**
   * ISO 3166 country codes. Note Flow APIs will accept either the 2 or 3 character
   * country code, but internally we normalize data and store as the 3 character,
   * upper case ISO code. See https://api.flow.io/reference/countries
   */
  case class Country(
    name: String,
    iso31662: String,
    iso31663: String,
    languages: Seq[String],
    measurementSystem: String,
    defaultCurrency: _root_.scala.Option[String] = None,
    timezones: Seq[String]
  )

  /**
   * ISO 4217 3-character currency code. See https://api.flow.io/reference/currencies
   */
  case class Currency(
    name: String,
    iso42173: String,
    numberDecimals: Int
  )

  /**
   * ISO 639 2-character language code. See https://api.flow.io/reference/languages
   */
  case class Language(
    name: String,
    iso6392: String
  )

  /**
   * A region represents a geographic area of the world. Regions can be countries,
   * continents or other political areas (like the Eurozone). See
   * https://api.flow.io/reference/regions
   */
  case class Region(
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
   */
  case class Timezone(
    name: String,
    description: String,
    offset: Int
  )

}
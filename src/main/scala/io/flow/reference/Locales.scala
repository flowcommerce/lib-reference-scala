package io.flow.reference

import io.flow.reference.v0.models.Locale

object Locales extends Validation[Locale] {
  override val cache: Map[String, Locale] = Map(
    data.Locales.all.map { l =>
      (l.id.toLowerCase -> l)
    }: _*
  )

  override def singular = "locale"
  override def plural = "locales"
  override def name(l: Locale) = l.id

  /**
    * Filters locales based on the query parameter by:
    * 
    *  - if the query string maps to a country, we find all locales that contain that country
    *  - if the query string maps to a language, we find all locales that match that language
    *  - otherwise we check if there is a locale with id = q
    */
  def filter(q: String): Seq[Locale] = {  
    val byId = Seq(find(q)).flatten

    val byCountry = Countries.find(q).map { c =>
      data.Locales.all.filter { _.country == c.iso31663 }
    }.getOrElse(Nil)

    val byLanguage = Languages.find(q).map { l =>
      data.Locales.all.filter { _.language == l.iso6392 }
    }.getOrElse(Nil)

    (byId ++ byCountry ++ byLanguage).distinct
  }  
}

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
}

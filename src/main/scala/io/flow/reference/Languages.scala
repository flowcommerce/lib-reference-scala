package io.flow.reference

import io.flow.reference.v0.models.Language

object Languages extends Validation[Language] {
  val cache: Map[String, Language] = Map(
    data.Languages.all.flatMap { l =>
      Seq(
        (l.iso6392.toLowerCase -> l),
        (l.name.toLowerCase -> l)
      )
    }: _*
  )

  val supportedCache = cache

  def singular = "language"
  def plural = "languages"
  def name(l: Language) = l.name
}

package io.flow.reference

import io.flow.reference.v0.models.Language

object Languages extends Validation[Language] {
  override val cache: Map[String, Language] = Map(
    data.Languages.all.flatMap { l =>
      Seq(
        (l.iso6392.toLowerCase -> l),
        (l.name.toLowerCase -> l)
      )
    }: _*
  )

  override def singular = "language"
  override def plural = "languages"
  override def name(l: Language): String = l.name
}

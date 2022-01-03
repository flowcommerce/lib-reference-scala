package io.flow.reference

import io.flow.reference.v0.models.Carrier

object Carriers extends Validation[Carrier] {
  override val cache: Map[String, Carrier] = Map(
    data.Carriers.all.flatMap { t =>
      Seq(
        t.id.toLowerCase -> t,
        t.name.toLowerCase -> t,
        t.name.replaceAll("[/_]", " ").toLowerCase -> t
      )
    }: _*
  )

  override def singular = "carrier"
  override def plural = "carriers"
  override def name(c: Carrier): String = c.name
}

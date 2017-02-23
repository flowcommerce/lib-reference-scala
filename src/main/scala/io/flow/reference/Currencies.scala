package io.flow.reference

import io.flow.reference.v0.models.Currency

object Currencies extends Validation[Currency] {
  override val cache: Map[String, Currency] = Map(
    data.Currencies.all.flatMap { c =>
      Seq(
        (c.iso42173.toLowerCase -> c),
        (c.name.toLowerCase -> c)
      )
    }: _*
  )

  override def singular = "currency"
  override def plural = "currencies"
  override def name(c: Currency) = c.iso42173
}

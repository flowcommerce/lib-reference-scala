package io.flow.reference

import io.flow.reference.v0.models.Timezone

class BaseTimezones extends Reference[Timezone] {
  override val cache: Map[String, Timezone] = Map(
    data.Timezones.all.flatMap { t =>
      Seq(
        t.name.toLowerCase -> t,
        t.name.replaceAll("[/_]", " ").toLowerCase -> t,
      )
    }: _*,
  )

  override def singular = "timezone"
  override def plural = "timezones"
  override def name(tz: Timezone): String = tz.name
}

object Timezones extends BaseTimezones with EitherValidation[Timezone]

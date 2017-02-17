package io.flow.reference

import io.flow.reference.v0.models.Timezone

object Timezones extends Validation[Timezone] {
  val cache: Map[String, Timezone] = Map(
    data.Timezones.all.flatMap { t =>
      Seq(
        t.name.toLowerCase -> t,
        t.name.replaceAll("[/_]", " ").toLowerCase -> t
      )
    }: _*
  )
  
  val supportedCache = cache

  def singular = "timezone"
  def plural = "timezones"
  def name(tz: Timezone) = tz.name
}

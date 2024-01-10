package io.flow.reference

import io.flow.reference.v0.models.CarrierService

class BaseCarrierServices extends Reference[CarrierService] {
  override val cache: Map[String, CarrierService] = Map(
    data.CarrierServices.all.flatMap { t =>
      Seq(
        t.id.toLowerCase -> t,
        t.name.toLowerCase -> t,
        t.name.replaceAll("[/_]", " ").toLowerCase -> t,
      )
    }: _*,
  )

  override def singular = "carrier service"
  override def plural = "carrier-services"
  override def name(c: CarrierService): String = c.name
}

object CarrierServices extends BaseCarrierServices with EitherValidation[CarrierService]

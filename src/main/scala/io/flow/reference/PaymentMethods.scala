package io.flow.reference

import io.flow.reference.v0.models.PaymentMethod
class BasePaymentMethods extends Reference[PaymentMethod] {

  override val cache: Map[String, PaymentMethod] = Map(
    data.PaymentMethods.all.map { r =>
      r.id.toLowerCase -> r
    }: _*,
  )

  override def singular = "payment method"

  override def plural = "payment methods"

  override def name(r: PaymentMethod): String = r.name

  override def urlKey = "payment-methods"

}

object PaymentMethods extends BasePaymentMethods with EitherValidation[PaymentMethod]

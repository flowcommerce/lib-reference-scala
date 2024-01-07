package io.flow.reference.valid

import io.flow.reference._
import io.flow.reference.v0.models._

object Carriers extends BaseCarriers with Validation[Carrier]
object CarrierServices extends BaseCarrierServices with Validation[CarrierService]

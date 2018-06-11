package io.flow.reference.data

import io.flow.reference.v0.models.Carrier

object Carriers {

  val Asendia = Carrier(id = "asendia", name = "Asendia", trackingUrl = "https://track.aftership.com/asendia/")
  val CanadaPost = Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/")
  val Dhl = Carrier(id = "dhl", name = "DHL Express", trackingUrl = "http://www.dhl.com/en/express/tracking.html?AWB=")
  val DhlEcommerce = Carrier(id = "dhl-ecommerce", name = "DHL Ecommerce", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val DhlGlobalMail = Carrier(id = "dhl-global-mail", name = "DHL Global Mail", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val DhlParcel = Carrier(id = "dhl-parcel", name = "DHL Parcel", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val Landmark = Carrier(id = "landmark", name = "Landmark", trackingUrl = "https://mercury.landmarkglobal.com/tracking/track.php?trck=")
  val SfExpress = Carrier(id = "sf-express", name = "SF Express", trackingUrl = "http://www.sf-express.com/us/en/dynamic_function/waybill/#search/bill-number/")
  val Ups = Carrier(id = "ups", name = "UPS", trackingUrl = "https://track.aftership.com/ups/")
  val Usps = Carrier(id = "usps", name = "USPS", trackingUrl = "https://track.aftership.com/usps/")

  val all = Seq(
    Asendia,
    CanadaPost,
    Dhl,
    DhlEcommerce,
    DhlGlobalMail,
    DhlParcel,
    Landmark,
    SfExpress,
    Ups,
    Usps
  )

}

package io.flow.reference.data

import io.flow.reference.v0.models.Carrier

object Carriers {

  val Asendia = Carrier(id = "asendia", name = "Asendia", trackingUrl = "https://track.aftership.com/asendia/")
  val CanadaPost = Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/")
  val Chronopost = Carrier(id = "chronopost", name = "Chronopost", trackingUrl = "https://www.chronopost.fr/en/chrono_suivi_search?listeNumerosLT=")
  val DeutschePost = Carrier(id = "deutsche-post", name = "Deutsche Post", trackingUrl = "https://track.aftership.com/deutsch-post/")
  val Dhl = Carrier(id = "dhl", name = "DHL Express", trackingUrl = "http://www.dhl.com/en/express/tracking.html?AWB=")
  val DhlEcommerce = Carrier(id = "dhl-ecommerce", name = "DHL Ecommerce", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val DhlGlobalMail = Carrier(id = "dhl-global-mail", name = "DHL Global Mail", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val DhlParcel = Carrier(id = "dhl-parcel", name = "DHL Parcel", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val Fedex = Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers=")
  val FedexCrossborder = Carrier(id = "fedex-crossborder", name = "FedEx Crossborder", trackingUrl = "https://www.trackmytrakpak.com/?MyTrakPakNumber=")
  val Ilg = Carrier(id = "ilg", name = "ILG", trackingUrl = "https://www.ilguk.com/track-trace/")
  val LaPoste = Carrier(id = "la-poste", name = "La Poste", trackingUrl = "https://www.laposte.fr/particulier/outils/en/track-a-parcel?code=")
  val Landmark = Carrier(id = "landmark", name = "Landmark", trackingUrl = "https://track.landmarkglobal.com/?trck=")
  val OcsWorldwide = Carrier(id = "ocs-worldwide", name = "OCS Worldwide", trackingUrl = "https://www.ocsworldwide.co.uk/Tracking.aspx?cwb=")
  val Other = Carrier(id = "other", name = "Other", trackingUrl = "https://track.flow.io/")
  val Rrdonnelley = Carrier(id = "rrdonnelley", name = "RR Donnelley", trackingUrl = "https://track.aftership.com/rrdonnelley/")
  val SfExpress = Carrier(id = "sf-express", name = "SF Express", trackingUrl = "http://www.sf-express.com/us/en/dynamic_function/waybill/#search/bill-number/")
  val Ups = Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum=")
  val Usps = Carrier(id = "usps", name = "USPS", trackingUrl = "https://track.aftership.com/usps/")
  val WnDirect = Carrier(id = "wn-direct", name = "WN Direct", trackingUrl = "http://wndirect.com/tracking.php?type=TR&ref=")

  val all = Seq(
    Asendia,
    CanadaPost,
    Chronopost,
    DeutschePost,
    Dhl,
    DhlEcommerce,
    DhlGlobalMail,
    DhlParcel,
    Fedex,
    FedexCrossborder,
    Ilg,
    LaPoste,
    Landmark,
    OcsWorldwide,
    Other,
    Rrdonnelley,
    SfExpress,
    Ups,
    Usps,
    WnDirect
  )

}

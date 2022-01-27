package io.flow.reference.data

import io.flow.reference.v0.models.Carrier

object Carriers {

  val Asendia: Carrier = Carrier(id = "asendia", name = "Asendia", trackingUrl = "https://track.aftership.com/asendia/")
  val CanadaPost: Carrier = Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/")
  val Chronopost: Carrier = Carrier(id = "chronopost", name = "Chronopost", trackingUrl = "https://www.chronopost.fr/en/chrono_suivi_search?listeNumerosLT=")
  val DeutschePost: Carrier = Carrier(id = "deutsche-post", name = "Deutsche Post", trackingUrl = "https://track.aftership.com/deutsch-post/")
  val Dhl: Carrier = Carrier(id = "dhl", name = "DHL Express", trackingUrl = "http://www.dhl.com/en/express/tracking.html?AWB=")
  val DhlEcommerce: Carrier = Carrier(id = "dhl-ecommerce", name = "DHL Ecommerce", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val DhlGlobalMail: Carrier = Carrier(id = "dhl-global-mail", name = "DHL Global Mail", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val DhlParcel: Carrier = Carrier(id = "dhl-parcel", name = "DHL Parcel", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber=")
  val Fedex: Carrier = Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers=")
  val FedexCrossborder: Carrier = Carrier(id = "fedex-crossborder", name = "FedEx Crossborder", trackingUrl = "https://www.trackmytrakpak.com/?MyTrakPakNumber=")
  val Ilg: Carrier = Carrier(id = "ilg", name = "ILG", trackingUrl = "https://www.ilguk.com/track-trace/")
  val LaPoste: Carrier = Carrier(id = "la-poste", name = "La Poste", trackingUrl = "https://www.laposte.fr/particulier/outils/en/track-a-parcel?code=")
  val Landmark: Carrier = Carrier(id = "landmark", name = "Landmark", trackingUrl = "https://track.landmarkglobal.com/?trck=")
  val MalcaAmit: Carrier = Carrier(id = "malca-amit", name = "Malca Amit", trackingUrl = "https://tracking.malca-amit.com/?t=")
  val OcsWorldwide: Carrier = Carrier(id = "ocs-worldwide", name = "OCS Worldwide", trackingUrl = "https://www.ocsworldwide.co.uk/Tracking.aspx?cwb=")
  val Other: Carrier = Carrier(id = "other", name = "Other", trackingUrl = "https://track.flow.io/")
  val Rrdonnelley: Carrier = Carrier(id = "rrdonnelley", name = "RR Donnelley", trackingUrl = "https://track.aftership.com/rrdonnelley/")
  val SfExpress: Carrier = Carrier(id = "sf-express", name = "SF Express", trackingUrl = "http://www.sf-express.com/us/en/dynamic_function/waybill/#search/bill-number/")
  val Ups: Carrier = Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum=")
  val Usps: Carrier = Carrier(id = "usps", name = "USPS", trackingUrl = "https://track.aftership.com/usps/")
  val WnDirect: Carrier = Carrier(id = "wn-direct", name = "WN Direct", trackingUrl = "http://wndirect.com/tracking.php?type=TR&ref=")

  val all: Seq[Carrier] = Seq(
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
    MalcaAmit,
    OcsWorldwide,
    Other,
    Rrdonnelley,
    SfExpress,
    Ups,
    Usps,
    WnDirect
  )

}

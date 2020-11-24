package io.flow.reference.data

import io.flow.reference.v0.models.CarrierService

object CarrierServices {

  val AsendiaExpress = CarrierService(id = "asendia-express", name = "Express", carrier = io.flow.reference.v0.models.Carrier(id = "asendia", name = "Asendia", trackingUrl = "https://track.aftership.com/asendia/"))
  val AsendiaStandard = CarrierService(id = "asendia-standard", name = "Standard", carrier = io.flow.reference.v0.models.Carrier(id = "asendia", name = "Asendia", trackingUrl = "https://track.aftership.com/asendia/"))
  val CanadaPostExpeditedParcel = CarrierService(id = "canada-post-expedited-parcel", name = "Expedited Parcel", carrier = io.flow.reference.v0.models.Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/"))
  val CanadaPostPriority = CarrierService(id = "canada-post-priority", name = "Priority", carrier = io.flow.reference.v0.models.Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/"))
  val CanadaPostRegularParcel = CarrierService(id = "canada-post-regular-parcel", name = "Regular Parcel", carrier = io.flow.reference.v0.models.Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/"))
  val CanadaPostXpresspost = CarrierService(id = "canada-post-xpresspost", name = "Xpresspost", carrier = io.flow.reference.v0.models.Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/"))
  val ChronopostChronoClassic = CarrierService(id = "chronopost-chrono-classic", name = "Classic", carrier = io.flow.reference.v0.models.Carrier(id = "chronopost", name = "Chronopost", trackingUrl = "https://www.chronopost.fr/en/chrono_suivi_search?listeNumerosLT="))
  val ChronopostChronoExpress = CarrierService(id = "chronopost-chrono-express", name = "Express", carrier = io.flow.reference.v0.models.Carrier(id = "chronopost", name = "Chronopost", trackingUrl = "https://www.chronopost.fr/en/chrono_suivi_search?listeNumerosLT="))
  val DhlEcommerceStandard = CarrierService(id = "dhl-ecommerce-standard", name = "Standard", carrier = io.flow.reference.v0.models.Carrier(id = "dhl-ecommerce", name = "DHL Ecommerce", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber="))
  val DhlEconomySelect = CarrierService(id = "dhl-economy-select", name = "Economy Select", carrier = io.flow.reference.v0.models.Carrier(id = "dhl", name = "DHL Express", trackingUrl = "http://www.dhl.com/en/express/tracking.html?AWB="))
  val DhlExpressDomestic1800 = CarrierService(id = "dhl-express-domestic-1800", name = "Express Domestic 18:00", carrier = io.flow.reference.v0.models.Carrier(id = "dhl", name = "DHL Express", trackingUrl = "http://www.dhl.com/en/express/tracking.html?AWB="))
  val DhlExpressExportEconomy = CarrierService(id = "dhl-express-export-economy", name = "Express Export Economy", carrier = io.flow.reference.v0.models.Carrier(id = "dhl", name = "DHL Express", trackingUrl = "http://www.dhl.com/en/express/tracking.html?AWB="))
  val DhlExpressWorldwide = CarrierService(id = "dhl-express-worldwide", name = "Express Worldwide", carrier = io.flow.reference.v0.models.Carrier(id = "dhl", name = "DHL Express", trackingUrl = "http://www.dhl.com/en/express/tracking.html?AWB="))
  val DhlGlobalMailPacketPlus = CarrierService(id = "dhl-global-mail-packet-plus", name = "Packet Plus", carrier = io.flow.reference.v0.models.Carrier(id = "dhl-global-mail", name = "DHL Global Mail", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber="))
  val DhlParcelInternationalDirect = CarrierService(id = "dhl-parcel-international-direct", name = "International Direct", carrier = io.flow.reference.v0.models.Carrier(id = "dhl-parcel", name = "DHL Parcel", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber="))
  val DhlParcelInternationalStandard = CarrierService(id = "dhl-parcel-international-standard", name = "International Standard", carrier = io.flow.reference.v0.models.Carrier(id = "dhl-parcel", name = "DHL Parcel", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber="))
  val FedexCrossborderEcommerce = CarrierService(id = "fedex-crossborder-ecommerce", name = "E-commerce", carrier = io.flow.reference.v0.models.Carrier(id = "fedex-crossborder", name = "FedEx Crossborder", trackingUrl = "https://www.trackmytrakpak.com/?MyTrakPakNumber="))
  val FedexCrossborderEcommerceLite = CarrierService(id = "fedex-crossborder-ecommerce-lite", name = "E-commerce Lite", carrier = io.flow.reference.v0.models.Carrier(id = "fedex-crossborder", name = "FedEx Crossborder", trackingUrl = "https://www.trackmytrakpak.com/?MyTrakPakNumber="))
  val FedexGround = CarrierService(id = "fedex-ground", name = "Ground", carrier = io.flow.reference.v0.models.Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers="))
  val FedexInternationalEconomy = CarrierService(id = "fedex-international-economy", name = "International Economy", carrier = io.flow.reference.v0.models.Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers="))
  val FedexInternationalPriority = CarrierService(id = "fedex-international-priority", name = "International Priority", carrier = io.flow.reference.v0.models.Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers="))
  val FedexInternationalStandard = CarrierService(id = "fedex-international-standard", name = "International Standard", carrier = io.flow.reference.v0.models.Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers="))
  val FedexOvernight = CarrierService(id = "fedex-overnight", name = "Overnight", carrier = io.flow.reference.v0.models.Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers="))
  val IlgEconomyUntracked = CarrierService(id = "ilg-economy-untracked", name = "Economy Untracked", carrier = io.flow.reference.v0.models.Carrier(id = "ilg", name = "ILG", trackingUrl = "https://www.ilguk.com/track-trace/"))
  val IlgEuropeanSinglePack = CarrierService(id = "ilg-european-single-pack", name = "European Single Pack", carrier = io.flow.reference.v0.models.Carrier(id = "ilg", name = "ILG", trackingUrl = "https://www.ilguk.com/track-trace/"))
  val IlgExpressTracked = CarrierService(id = "ilg-express-tracked", name = "Express Tracked", carrier = io.flow.reference.v0.models.Carrier(id = "ilg", name = "ILG", trackingUrl = "https://www.ilguk.com/track-trace/"))
  val IlgGlobalCourier = CarrierService(id = "ilg-global-courier", name = "Global Courier", carrier = io.flow.reference.v0.models.Carrier(id = "ilg", name = "ILG", trackingUrl = "https://www.ilguk.com/track-trace/"))
  val IlgInternationalCourier = CarrierService(id = "ilg-international-courier", name = "International Courier", carrier = io.flow.reference.v0.models.Carrier(id = "ilg", name = "ILG", trackingUrl = "https://www.ilguk.com/track-trace/"))
  val IlgStandardTracked = CarrierService(id = "ilg-standard-tracked", name = "Standard Tracked", carrier = io.flow.reference.v0.models.Carrier(id = "ilg", name = "ILG", trackingUrl = "https://www.ilguk.com/track-trace/"))
  val LaPosteColissimo = CarrierService(id = "la-poste-colissimo", name = "Colissimo", carrier = io.flow.reference.v0.models.Carrier(id = "la-poste", name = "La Poste", trackingUrl = "https://www.laposte.fr/particulier/outils/en/track-a-parcel?code="))
  val LandmarkGlobal = CarrierService(id = "landmark-global", name = "Global", carrier = io.flow.reference.v0.models.Carrier(id = "landmark", name = "Landmark", trackingUrl = "https://track.landmarkglobal.com/?trck="))
  val OtherFreight = CarrierService(id = "other-freight", name = "Freight", carrier = io.flow.reference.v0.models.Carrier(id = "other", name = "Other", trackingUrl = "https://track.flow.io/"))
  val OtherLtl = CarrierService(id = "other-ltl", name = "Less Than Truckload", carrier = io.flow.reference.v0.models.Carrier(id = "other", name = "Other", trackingUrl = "https://track.flow.io/"))
  val OtherPostal = CarrierService(id = "other-postal", name = "Postal", carrier = io.flow.reference.v0.models.Carrier(id = "other", name = "Other", trackingUrl = "https://track.flow.io/"))
  val RrdonnelleyInternationalIpa = CarrierService(id = "rrdonnelley-international-ipa", name = "International IPA", carrier = io.flow.reference.v0.models.Carrier(id = "rrdonnelley", name = "RR Donnelley", trackingUrl = "https://track.aftership.com/rrdonnelley/"))
  val RrdonnelleyInternationalPpdc = CarrierService(id = "rrdonnelley-international-ppdc", name = "International PPDC", carrier = io.flow.reference.v0.models.Carrier(id = "rrdonnelley", name = "RR Donnelley", trackingUrl = "https://track.aftership.com/rrdonnelley/"))
  val SfExpressEconomyExpressParcel = CarrierService(id = "sf-express-economy-express-parcel", name = "Economy Express Parcel", carrier = io.flow.reference.v0.models.Carrier(id = "sf-express", name = "SF Express", trackingUrl = "http://www.sf-express.com/us/en/dynamic_function/waybill/#search/bill-number/"))
  val Ups2ndDayAir = CarrierService(id = "ups-2nd-day-air", name = "2nd Day Air", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val Ups2ndDayAirAm = CarrierService(id = "ups-2nd-day-air-am", name = "2nd Day Air AM", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val Ups3DaySelect = CarrierService(id = "ups-3-day-select", name = "3 Day Select", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsAccessPointEconomy = CarrierService(id = "ups-access-point-economy", name = "Access Point Economy", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsEconomyMailInnovations = CarrierService(id = "ups-economy-mail-innovations", name = "Economy Mail Innovations", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsExpedited = CarrierService(id = "ups-expedited", name = "Expedited", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsExpeditedMaiiInnovations = CarrierService(id = "ups-expedited-maii-innovations", name = "Expedited MaiI Innovations", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsExpress = CarrierService(id = "ups-express", name = "Express", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsExpress1200 = CarrierService(id = "ups-express-1200", name = "Express 1200", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsExpressInternational = CarrierService(id = "ups-express-international", name = "Express International", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsExpressPlus = CarrierService(id = "ups-express-plus", name = "Express Plus", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsExpressSaver = CarrierService(id = "ups-express-saver", name = "Express Saver", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsFirstClassMail = CarrierService(id = "ups-first-class-mail", name = "First Class Mail", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsGround = CarrierService(id = "ups-ground", name = "Ground", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsInternationalImport = CarrierService(id = "ups-international-import", name = "International Import", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsMaiiInnovationsReturns = CarrierService(id = "ups-maii-innovations-returns", name = "MaiI Innovations Returns", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsNextDayAir = CarrierService(id = "ups-next-day-air", name = "Next Day Air", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsNextDayAirEarly = CarrierService(id = "ups-next-day-air-early", name = "Next Day Air Early", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsNextDayAirSaver = CarrierService(id = "ups-next-day-air-saver", name = "Next Day Air Saver", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsPriorityMail = CarrierService(id = "ups-priority-mail", name = "Priority Mail", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsPriorityMailInnovations = CarrierService(id = "ups-priority-mail-innovations", name = "Priority Mail Innovations", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsStandard = CarrierService(id = "ups-standard", name = "Standard", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsStandardInternational = CarrierService(id = "ups-standard-international", name = "Standard International", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsTodayDedicatedCourier = CarrierService(id = "ups-today-dedicated-courier", name = "Today Dedicated Courier", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsTodayExpress = CarrierService(id = "ups-today-express", name = "Today Express", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsTodayExpressSaver = CarrierService(id = "ups-today-express-saver", name = "Today Express Saver", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsTodayIntercity = CarrierService(id = "ups-today-intercity", name = "Today Intercity", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsTodayStandard = CarrierService(id = "ups-today-standard", name = "Today Standard", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsWorldwideEconomy = CarrierService(id = "ups-worldwide-economy", name = "Worldwide Economy", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsWorldwideEconomyDdu = CarrierService(id = "ups-worldwide-economy-ddu", name = "Worldwide Economy DDU", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsWorldwideExpressFreightMidday = CarrierService(id = "ups-worldwide-express-freight-midday", name = "Worldwide Express Freight Midday", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UpsWorldwideExpressFreight = CarrierService(id = "ups-worldwide-express-freight.", name = "Worldwide Express Freight", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://www.ups.com/track?loc=en_US&tracknum="))
  val UspsPriorityMailInternational = CarrierService(id = "usps-priority-mail-international", name = "Priority Mail International", carrier = io.flow.reference.v0.models.Carrier(id = "usps", name = "USPS", trackingUrl = "https://track.aftership.com/usps/"))
  val WnDirectStandard = CarrierService(id = "wn-direct-standard", name = "Standard", carrier = io.flow.reference.v0.models.Carrier(id = "wn-direct", name = "WN Direct", trackingUrl = "http://wndirect.com/tracking.php?type=TR&ref="))

  val all = Seq(
    AsendiaExpress,
    AsendiaStandard,
    CanadaPostExpeditedParcel,
    CanadaPostPriority,
    CanadaPostRegularParcel,
    CanadaPostXpresspost,
    ChronopostChronoClassic,
    ChronopostChronoExpress,
    DhlEcommerceStandard,
    DhlEconomySelect,
    DhlExpressDomestic1800,
    DhlExpressExportEconomy,
    DhlExpressWorldwide,
    DhlGlobalMailPacketPlus,
    DhlParcelInternationalDirect,
    DhlParcelInternationalStandard,
    FedexCrossborderEcommerce,
    FedexCrossborderEcommerceLite,
    FedexGround,
    FedexInternationalEconomy,
    FedexInternationalPriority,
    FedexInternationalStandard,
    FedexOvernight,
    IlgEconomyUntracked,
    IlgEuropeanSinglePack,
    IlgExpressTracked,
    IlgGlobalCourier,
    IlgInternationalCourier,
    IlgStandardTracked,
    LaPosteColissimo,
    LandmarkGlobal,
    OtherFreight,
    OtherLtl,
    OtherPostal,
    RrdonnelleyInternationalIpa,
    RrdonnelleyInternationalPpdc,
    SfExpressEconomyExpressParcel,
    Ups2ndDayAir,
    Ups2ndDayAirAm,
    Ups3DaySelect,
    UpsAccessPointEconomy,
    UpsEconomyMailInnovations,
    UpsExpedited,
    UpsExpeditedMaiiInnovations,
    UpsExpress,
    UpsExpress1200,
    UpsExpressInternational,
    UpsExpressPlus,
    UpsExpressSaver,
    UpsFirstClassMail,
    UpsGround,
    UpsInternationalImport,
    UpsMaiiInnovationsReturns,
    UpsNextDayAir,
    UpsNextDayAirEarly,
    UpsNextDayAirSaver,
    UpsPriorityMail,
    UpsPriorityMailInnovations,
    UpsStandard,
    UpsStandardInternational,
    UpsTodayDedicatedCourier,
    UpsTodayExpress,
    UpsTodayExpressSaver,
    UpsTodayIntercity,
    UpsTodayStandard,
    UpsWorldwideEconomy,
    UpsWorldwideEconomyDdu,
    UpsWorldwideExpressFreightMidday,
    UpsWorldwideExpressFreight,
    UspsPriorityMailInternational,
    WnDirectStandard
  )

}

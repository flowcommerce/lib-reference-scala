package io.flow.reference.data

import io.flow.reference.v0.models.{PaymentMethod, PaymentMethodImage, PaymentMethodImages, PaymentMethodType}

object PaymentMethods {

  val AmericanExpress = PaymentMethod(id = "american_express", `type` = PaymentMethodType.Card, name = "American Express", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/american_express/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/american_express/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/american_express/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val CartesBancaires = PaymentMethod(id = "cartes_bancaires", `type` = PaymentMethodType.Card, name = "Cartes Bancaires", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/cartes_bancaires/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/cartes_bancaires/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/cartes_bancaires/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("fra"))
  val ChinaUnionPay = PaymentMethod(id = "china_union_pay", `type` = PaymentMethodType.Card, name = "China Union Pay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/china_union_pay/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/china_union_pay/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/china_union_pay/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("chn"))
  val Dankort = PaymentMethod(id = "dankort", `type` = PaymentMethodType.Card, name = "Dankort", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/dankort/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/dankort/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/dankort/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("europe"))
  val DinersClub = PaymentMethod(id = "diners_club", `type` = PaymentMethodType.Card, name = "Diners Club", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/diners_club/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/diners_club/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/diners_club/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Discover = PaymentMethod(id = "discover", `type` = PaymentMethodType.Card, name = "Discover", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/discover/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/discover/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/discover/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Jcb = PaymentMethod(id = "jcb", `type` = PaymentMethodType.Card, name = "Jcb", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/jcb/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/jcb/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/jcb/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("jpn"))
  val Maestro = PaymentMethod(id = "maestro", `type` = PaymentMethodType.Card, name = "Maestro", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/maestro/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/maestro/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/maestro/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Mastercard = PaymentMethod(id = "mastercard", `type` = PaymentMethodType.Card, name = "Mastercard", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/mastercard/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/mastercard/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/mastercard/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Paypal = PaymentMethod(id = "paypal", `type` = PaymentMethodType.Online, name = "Paypal", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/paypal/76x48.png", width = 76, height = 48),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/paypal/150x94.png", width = 150, height = 94),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/paypal/266x142.png", width = 266, height = 142)
                                    ), regions = Seq("world"))
  val Visa = PaymentMethod(id = "visa", `type` = PaymentMethodType.Card, name = "VISA", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/visa/64x64.png", width = 64, height = 64),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/visa/128x128.png", width = 128, height = 128),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/visa/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("world"))

  val all = Seq(
    AmericanExpress,
    CartesBancaires,
    ChinaUnionPay,
    Dankort,
    DinersClub,
    Discover,
    Jcb,
    Maestro,
    Mastercard,
    Paypal,
    Visa
  )

}

package io.flow.reference.data

import io.flow.reference.v0.models.{PaymentMethod, PaymentMethodImage, PaymentMethodImages, PaymentMethodType}

object PaymentMethods {

  val Alipay = PaymentMethod(id = "alipay", `type` = PaymentMethodType.Online, name = "Alipay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/alipay/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/alipay/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/alipay/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val AmericanExpress = PaymentMethod(id = "american_express", `type` = PaymentMethodType.Card, name = "American Express", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/american_express/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/american_express/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/american_express/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val CartesBancaires = PaymentMethod(id = "cartes_bancaires", `type` = PaymentMethodType.Card, name = "Cartes Bancaires", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/cartes_bancaires/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/cartes_bancaires/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/cartes_bancaires/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("fra"))
  val ChinaUnionPay = PaymentMethod(id = "china_union_pay", `type` = PaymentMethodType.Card, name = "China Union Pay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/china_union_pay/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/china_union_pay/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/china_union_pay/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("chn"))
  val Dankort = PaymentMethod(id = "dankort", `type` = PaymentMethodType.Card, name = "Dankort", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/dankort/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/dankort/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/dankort/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("europe"))
  val DinersClub = PaymentMethod(id = "diners_club", `type` = PaymentMethodType.Card, name = "Diners Club", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/diners_club/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/diners_club/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/diners_club/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Discover = PaymentMethod(id = "discover", `type` = PaymentMethodType.Card, name = "Discover", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/discover/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/discover/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/discover/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Jcb = PaymentMethod(id = "jcb", `type` = PaymentMethodType.Card, name = "Jcb", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/jcb/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/jcb/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/jcb/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("jpn"))
  val Maestro = PaymentMethod(id = "maestro", `type` = PaymentMethodType.Card, name = "Maestro", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/maestro/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/maestro/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/maestro/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Mastercard = PaymentMethod(id = "mastercard", `type` = PaymentMethodType.Card, name = "Mastercard", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/mastercard/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/mastercard/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/mastercard/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Paypal = PaymentMethod(id = "paypal", `type` = PaymentMethodType.Online, name = "PayPal", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/paypal/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/paypal/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/paypal/180x60.png", width = 180, height = 60)
                                    ), regions = Seq("world"))
  val Unionpay = PaymentMethod(id = "unionpay", `type` = PaymentMethodType.Online, name = "UnionPay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/unionpay/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/unionpay/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/unionpay/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Visa = PaymentMethod(id = "visa", `type` = PaymentMethodType.Card, name = "VISA", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/visa/65x41.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/visa/100x60.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/icons/payment-methods/visa/256x256.png", width = 256, height = 256)
                                    ), regions = Seq("world"))

  val all = Seq(
    Alipay,
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
    Unionpay,
    Visa
  )

}

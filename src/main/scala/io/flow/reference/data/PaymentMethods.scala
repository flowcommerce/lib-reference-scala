package io.flow.reference.data

import io.flow.reference.v0.models.{PaymentMethod, PaymentMethodImage, PaymentMethodImages, PaymentMethodType}

object PaymentMethods {

  val Alipay = PaymentMethod(id = "alipay", `type` = PaymentMethodType.Online, name = "Alipay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/alipay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/alipay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/alipay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val AmericanExpress = PaymentMethod(id = "american_express", `type` = PaymentMethodType.Card, name = "American Express", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/american_express/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/american_express/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/american_express/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val CartesBancaires = PaymentMethod(id = "cartes_bancaires", `type` = PaymentMethodType.Card, name = "Cartes Bancaires", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/cartes_bancaires/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/cartes_bancaires/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/cartes_bancaires/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("fra"))
  val ChinaUnionPay = PaymentMethod(id = "china_union_pay", `type` = PaymentMethodType.Card, name = "China Union Pay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/china_union_pay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/china_union_pay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/china_union_pay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("chn"))
  val Dankort = PaymentMethod(id = "dankort", `type` = PaymentMethodType.Card, name = "Dankort", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dankort/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dankort/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dankort/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("europe"))
  val DinersClub = PaymentMethod(id = "diners_club", `type` = PaymentMethodType.Card, name = "Diners Club", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/diners_club/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/diners_club/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/diners_club/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Directebanking = PaymentMethod(id = "directEbanking", `type` = PaymentMethodType.Online, name = "Sofortüberweisung", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/directEbanking/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/directEbanking/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/directEbanking/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Discover = PaymentMethod(id = "discover", `type` = PaymentMethodType.Card, name = "Discover", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/discover/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/discover/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/discover/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Giropay = PaymentMethod(id = "giropay", `type` = PaymentMethodType.Online, name = "GiroPay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/giropay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/giropay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/giropay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Ideal = PaymentMethod(id = "ideal", `type` = PaymentMethodType.Online, name = "iDEAL", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ideal/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ideal/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ideal/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Jcb = PaymentMethod(id = "jcb", `type` = PaymentMethodType.Card, name = "Jcb", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/jcb/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/jcb/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/jcb/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("jpn"))
  val Maestro = PaymentMethod(id = "maestro", `type` = PaymentMethodType.Card, name = "Maestro", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/maestro/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/maestro/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/maestro/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("europe", "north-america"))
  val Mastercard = PaymentMethod(id = "mastercard", `type` = PaymentMethodType.Card, name = "Mastercard", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/mastercard/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/mastercard/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/mastercard/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Paypal = PaymentMethod(id = "paypal", `type` = PaymentMethodType.Online, name = "PayPal", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/paypal/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/paypal/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/paypal/120/original.png", width = 180, height = 60)
                                    ), regions = Seq("world"))
  val Qiwiwallet = PaymentMethod(id = "qiwiwallet", `type` = PaymentMethodType.Online, name = "Qiwi Wallet", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/qiwiwallet/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/qiwiwallet/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/qiwiwallet/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Sepadirectdebit = PaymentMethod(id = "sepadirectdebit", `type` = PaymentMethodType.Online, name = "SEPA Direct Debit", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/sepadirectdebit/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/sepadirectdebit/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/sepadirectdebit/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Unionpay = PaymentMethod(id = "unionpay", `type` = PaymentMethodType.Online, name = "UnionPay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/unionpay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/unionpay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/unionpay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Visa = PaymentMethod(id = "visa", `type` = PaymentMethodType.Card, name = "VISA", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/visa/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/visa/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/visa/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Wechatpay = PaymentMethod(id = "wechatpay", `type` = PaymentMethodType.Online, name = "WeChat Pay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/wechatpay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/wechatpay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/wechatpay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))

  val all = Seq(
    Alipay,
    AmericanExpress,
    CartesBancaires,
    ChinaUnionPay,
    Dankort,
    DinersClub,
    Directebanking,
    Discover,
    Giropay,
    Ideal,
    Jcb,
    Maestro,
    Mastercard,
    Paypal,
    Qiwiwallet,
    Sepadirectdebit,
    Unionpay,
    Visa,
    Wechatpay
  )

}

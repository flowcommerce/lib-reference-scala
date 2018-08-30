package io.flow.reference.data

import io.flow.reference.v0.models.{PaymentMethod, PaymentMethodImage, PaymentMethodImages, PaymentMethodType}

object PaymentMethods {

  val Ach = PaymentMethod(id = "ach", `type` = PaymentMethodType.Online, name = "ACH", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ach/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ach/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ach/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
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
  val ApplePay = PaymentMethod(id = "apple_pay", `type` = PaymentMethodType.Online, name = "Apple Pay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/apple_pay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/apple_pay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/apple_pay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val BanktransferIban = PaymentMethod(id = "bankTransfer_IBAN", `type` = PaymentMethodType.Online, name = "International Bank Transfer (IBAN)", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bankTransfer_IBAN/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bankTransfer_IBAN/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bankTransfer_IBAN/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Bitcoin = PaymentMethod(id = "bitcoin", `type` = PaymentMethodType.Online, name = "Bitcoin", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bitcoin/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bitcoin/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bitcoin/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Bitpay = PaymentMethod(id = "bitpay", `type` = PaymentMethodType.Online, name = "BitPay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bitpay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bitpay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/bitpay/120/original.png", width = 256, height = 256)
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
  val Dotpay = PaymentMethod(id = "dotpay", `type` = PaymentMethodType.Online, name = "Dotpay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dotpay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dotpay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dotpay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val DragonpayEbanking = PaymentMethod(id = "dragonpay_ebanking", `type` = PaymentMethodType.Online, name = "Dragonpay eBanking", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_ebanking/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_ebanking/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_ebanking/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val DragonpayGcash = PaymentMethod(id = "dragonpay_gcash", `type` = PaymentMethodType.Online, name = "GCash via Dragonpay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_gcash/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_gcash/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_gcash/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val DragonpayOtcBanking = PaymentMethod(id = "dragonpay_otc_banking", `type` = PaymentMethodType.Online, name = "Dragonpay OTC", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_otc_banking/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_otc_banking/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/dragonpay_otc_banking/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val EbankingFi = PaymentMethod(id = "ebanking_FI", `type` = PaymentMethodType.Online, name = "Finnish E-Banking", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ebanking_FI/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ebanking_FI/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ebanking_FI/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Giropay = PaymentMethod(id = "giropay", `type` = PaymentMethodType.Online, name = "GiroPay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/giropay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/giropay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/giropay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val GooglePay = PaymentMethod(id = "google_pay", `type` = PaymentMethodType.Online, name = "Google Pay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/google_pay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/google_pay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/google_pay/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Ideal = PaymentMethod(id = "ideal", `type` = PaymentMethodType.Online, name = "iDEAL", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ideal/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ideal/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/ideal/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Interac = PaymentMethod(id = "interac", `type` = PaymentMethodType.Online, name = "Interac Online", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/interac/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/interac/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/interac/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Jcb = PaymentMethod(id = "jcb", `type` = PaymentMethodType.Card, name = "Jcb", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/jcb/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/jcb/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/jcb/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("jpn"))
  val KcpBanktransfer = PaymentMethod(id = "kcp_banktransfer", `type` = PaymentMethodType.Online, name = "Bank Transfer via KCP", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_banktransfer/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_banktransfer/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_banktransfer/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val KcpCreditcard = PaymentMethod(id = "kcp_creditcard", `type` = PaymentMethodType.Online, name = "Credit Card via KCP", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_creditcard/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_creditcard/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_creditcard/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val KcpPayco = PaymentMethod(id = "kcp_payco", `type` = PaymentMethodType.Online, name = "PayCo", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_payco/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_payco/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/kcp_payco/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Klarna = PaymentMethod(id = "klarna", `type` = PaymentMethodType.Online, name = "Klarna", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/klarna/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/klarna/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/klarna/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
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
  val MolpayPoints = PaymentMethod(id = "molpay_points", `type` = PaymentMethodType.Online, name = "MOLPoints via MOLPay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/molpay_points/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/molpay_points/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/molpay_points/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Multibanco = PaymentMethod(id = "multibanco", `type` = PaymentMethodType.Online, name = "Multibanco", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/multibanco/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/multibanco/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/multibanco/120/original.png", width = 256, height = 256)
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
  val Trustly = PaymentMethod(id = "trustly", `type` = PaymentMethodType.Online, name = "Trustly", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/trustly/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/trustly/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/trustly/120/original.png", width = 256, height = 256)
                                    ), regions = Seq("world"))
  val Trustpay = PaymentMethod(id = "trustpay", `type` = PaymentMethodType.Online, name = "TrustPay", images = PaymentMethodImages(
                                      small = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/trustpay/30/original.png", width = 65, height = 41),
                                      medium = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/trustpay/60/original.png", width = 100, height = 60),
                                      large = PaymentMethodImage(url = "https://flowcdn.io/util/logos/payment-methods/trustpay/120/original.png", width = 256, height = 256)
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
    Ach,
    Alipay,
    AmericanExpress,
    ApplePay,
    BanktransferIban,
    Bitcoin,
    Bitpay,
    CartesBancaires,
    ChinaUnionPay,
    Dankort,
    DinersClub,
    Directebanking,
    Discover,
    Dotpay,
    DragonpayEbanking,
    DragonpayGcash,
    DragonpayOtcBanking,
    EbankingFi,
    Giropay,
    GooglePay,
    Ideal,
    Interac,
    Jcb,
    KcpBanktransfer,
    KcpCreditcard,
    KcpPayco,
    Klarna,
    Maestro,
    Mastercard,
    MolpayPoints,
    Multibanco,
    Paypal,
    Qiwiwallet,
    Sepadirectdebit,
    Trustly,
    Trustpay,
    Unionpay,
    Visa,
    Wechatpay
  )

}

package io.flow.reference.data

import io.flow.reference.v0.models.{
  PaymentMethod,
  PaymentMethodImage,
  PaymentMethodImages,
  PaymentMethodType,
  PaymentMethodCapability,
}

object PaymentMethods {

  val Ach: PaymentMethod = PaymentMethod(
    id = "ach",
    `type` = PaymentMethodType.Online,
    name = "ACH",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ach/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ach/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ach/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Afterpay: PaymentMethod = PaymentMethod(
    id = "afterpay",
    `type` = PaymentMethodType.Online,
    name = "Afterpay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/afterpay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/afterpay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/afterpay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Alipay: PaymentMethod = PaymentMethod(
    id = "alipay",
    `type` = PaymentMethodType.Online,
    name = "Alipay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/alipay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/alipay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/alipay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val AmericanExpress: PaymentMethod = PaymentMethod(
    id = "american_express",
    `type` = PaymentMethodType.Card,
    name = "American Express",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/american_express/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/american_express/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/american_express/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Seq(PaymentMethodCapability.Credit)),
  )
  val ApplePay: PaymentMethod = PaymentMethod(
    id = "apple_pay",
    `type` = PaymentMethodType.Online,
    name = "Apple Pay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/apple_pay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/apple_pay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/apple_pay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Bancontact: PaymentMethod = PaymentMethod(
    id = "bancontact",
    `type` = PaymentMethodType.Online,
    name = "Bancontact",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bancontact/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bancontact/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bancontact/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val BanktransferIban: PaymentMethod = PaymentMethod(
    id = "bankTransfer_IBAN",
    `type` = PaymentMethodType.Online,
    name = "International Bank Transfer (IBAN)",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bankTransfer_IBAN/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bankTransfer_IBAN/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bankTransfer_IBAN/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Bitcoin: PaymentMethod = PaymentMethod(
    id = "bitcoin",
    `type` = PaymentMethodType.Online,
    name = "Bitcoin",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bitcoin/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bitcoin/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bitcoin/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Bitpay: PaymentMethod = PaymentMethod(
    id = "bitpay",
    `type` = PaymentMethodType.Online,
    name = "BitPay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bitpay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bitpay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/bitpay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val CartesBancaires: PaymentMethod = PaymentMethod(
    id = "cartes_bancaires",
    `type` = PaymentMethodType.Card,
    name = "Cartes Bancaires",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cartes_bancaires/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cartes_bancaires/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cartes_bancaires/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("fra"),
    capabilities = Some(Seq(PaymentMethodCapability.Credit)),
  )
  val CashOnDelivery: PaymentMethod = PaymentMethod(
    id = "cash_on_delivery",
    `type` = PaymentMethodType.Online,
    name = "Cash on Delivery",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cash_on_delivery/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cash_on_delivery/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cash_on_delivery/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val ChinaUnionPay: PaymentMethod = PaymentMethod(
    id = "china_union_pay",
    `type` = PaymentMethodType.Card,
    name = "China Union Pay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/china_union_pay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/china_union_pay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/china_union_pay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("chn"),
    capabilities = Some(Seq(PaymentMethodCapability.Credit, PaymentMethodCapability.Debit)),
  )
  val CryptocomPay: PaymentMethod = PaymentMethod(
    id = "cryptocom_pay",
    `type` = PaymentMethodType.Online,
    name = "Crypto.com Pay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cryptocom_pay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cryptocom_pay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/cryptocom_pay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Dankort: PaymentMethod = PaymentMethod(
    id = "dankort",
    `type` = PaymentMethodType.Card,
    name = "Dankort",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dankort/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dankort/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dankort/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("europe"),
    capabilities = Some(Seq(PaymentMethodCapability.Debit)),
  )
  val DinersClub: PaymentMethod = PaymentMethod(
    id = "diners_club",
    `type` = PaymentMethodType.Card,
    name = "Diners Club",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/diners_club/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/diners_club/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/diners_club/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("europe", "north-america"),
    capabilities = Some(Seq(PaymentMethodCapability.Credit)),
  )
  val Directebanking: PaymentMethod = PaymentMethod(
    id = "directEbanking",
    `type` = PaymentMethodType.Online,
    name = "Sofortüberweisung",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/directEbanking/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/directEbanking/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/directEbanking/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Discover: PaymentMethod = PaymentMethod(
    id = "discover",
    `type` = PaymentMethodType.Card,
    name = "Discover",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/discover/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/discover/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/discover/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("europe", "north-america"),
    capabilities = Some(Seq(PaymentMethodCapability.Credit)),
  )
  val Dotpay: PaymentMethod = PaymentMethod(
    id = "dotpay",
    `type` = PaymentMethodType.Online,
    name = "Dotpay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dotpay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dotpay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dotpay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val DragonpayEbanking: PaymentMethod = PaymentMethod(
    id = "dragonpay_ebanking",
    `type` = PaymentMethodType.Online,
    name = "Dragonpay eBanking",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_ebanking/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_ebanking/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_ebanking/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val DragonpayGcash: PaymentMethod = PaymentMethod(
    id = "dragonpay_gcash",
    `type` = PaymentMethodType.Online,
    name = "GCash via Dragonpay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_gcash/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_gcash/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_gcash/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val DragonpayOtcBanking: PaymentMethod = PaymentMethod(
    id = "dragonpay_otc_banking",
    `type` = PaymentMethodType.Online,
    name = "Dragonpay OTC",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_otc_banking/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_otc_banking/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/dragonpay_otc_banking/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val EbankingFi: PaymentMethod = PaymentMethod(
    id = "ebanking_FI",
    `type` = PaymentMethodType.Online,
    name = "Finnish E-Banking",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ebanking_FI/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ebanking_FI/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ebanking_FI/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Giropay: PaymentMethod = PaymentMethod(
    id = "giropay",
    `type` = PaymentMethodType.Online,
    name = "GiroPay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/giropay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/giropay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/giropay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val GooglePay: PaymentMethod = PaymentMethod(
    id = "google_pay",
    `type` = PaymentMethodType.Online,
    name = "Google Pay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/google_pay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/google_pay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/google_pay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Grabpay: PaymentMethod = PaymentMethod(
    id = "grabpay",
    `type` = PaymentMethodType.Online,
    name = "GrabPay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/grabpay/30/original.png",
        width = 40,
        height = 26,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/grabpay/60/original.png",
        width = 77,
        height = 50,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/grabpay/120/original.png",
        width = 154,
        height = 100,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Ideal: PaymentMethod = PaymentMethod(
    id = "ideal",
    `type` = PaymentMethodType.Online,
    name = "iDEAL",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ideal/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ideal/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/ideal/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Interac: PaymentMethod = PaymentMethod(
    id = "interac",
    `type` = PaymentMethodType.Online,
    name = "Interac Online",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/interac/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/interac/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/interac/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Jcb: PaymentMethod = PaymentMethod(
    id = "jcb",
    `type` = PaymentMethodType.Card,
    name = "Jcb",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/jcb/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/jcb/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/jcb/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("jpn"),
    capabilities = Some(Seq(PaymentMethodCapability.Credit, PaymentMethodCapability.Debit)),
  )
  val KcpBanktransfer: PaymentMethod = PaymentMethod(
    id = "kcp_banktransfer",
    `type` = PaymentMethodType.Online,
    name = "Bank Transfer via KCP",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_banktransfer/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_banktransfer/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_banktransfer/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val KcpCreditcard: PaymentMethod = PaymentMethod(
    id = "kcp_creditcard",
    `type` = PaymentMethodType.Online,
    name = "Credit Card via KCP",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_creditcard/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_creditcard/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_creditcard/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val KcpPayco: PaymentMethod = PaymentMethod(
    id = "kcp_payco",
    `type` = PaymentMethodType.Online,
    name = "PayCo",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_payco/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_payco/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/kcp_payco/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Klarna: PaymentMethod = PaymentMethod(
    id = "klarna",
    `type` = PaymentMethodType.Online,
    name = "Klarna",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/klarna/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/klarna/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/klarna/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Maestro: PaymentMethod = PaymentMethod(
    id = "maestro",
    `type` = PaymentMethodType.Card,
    name = "Maestro",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/maestro/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/maestro/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/maestro/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("europe", "north-america"),
    capabilities = Some(Seq(PaymentMethodCapability.Debit)),
  )
  val Mastercard: PaymentMethod = PaymentMethod(
    id = "mastercard",
    `type` = PaymentMethodType.Card,
    name = "Mastercard",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/mastercard/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/mastercard/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/mastercard/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Seq(PaymentMethodCapability.Credit, PaymentMethodCapability.Debit)),
  )
  val Mobilepay: PaymentMethod = PaymentMethod(
    id = "mobilepay",
    `type` = PaymentMethodType.Online,
    name = "MobilePay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/mobilepay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/mobilepay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/mobilepay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val MolpayPoints: PaymentMethod = PaymentMethod(
    id = "molpay_points",
    `type` = PaymentMethodType.Online,
    name = "MOLPoints via MOLPay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/molpay_points/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/molpay_points/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/molpay_points/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Multibanco: PaymentMethod = PaymentMethod(
    id = "multibanco",
    `type` = PaymentMethodType.Online,
    name = "Multibanco",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/multibanco/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/multibanco/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/multibanco/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Paypal: PaymentMethod = PaymentMethod(
    id = "paypal",
    `type` = PaymentMethodType.Online,
    name = "PayPal",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/paypal/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/paypal/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/paypal/120/original.png",
        width = 180,
        height = 60,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Przelewy24: PaymentMethod = PaymentMethod(
    id = "przelewy24",
    `type` = PaymentMethodType.Online,
    name = "Przelewy24",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/przelewy24/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/przelewy24/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/przelewy24/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Qiwiwallet: PaymentMethod = PaymentMethod(
    id = "qiwiwallet",
    `type` = PaymentMethodType.Online,
    name = "Qiwi Wallet",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/qiwiwallet/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/qiwiwallet/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/qiwiwallet/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Sepadirectdebit: PaymentMethod = PaymentMethod(
    id = "sepadirectdebit",
    `type` = PaymentMethodType.Online,
    name = "SEPA Direct Debit",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/sepadirectdebit/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/sepadirectdebit/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/sepadirectdebit/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Trustly: PaymentMethod = PaymentMethod(
    id = "trustly",
    `type` = PaymentMethodType.Online,
    name = "Trustly",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/trustly/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/trustly/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/trustly/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Trustpay: PaymentMethod = PaymentMethod(
    id = "trustpay",
    `type` = PaymentMethodType.Online,
    name = "TrustPay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/trustpay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/trustpay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/trustpay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Twint: PaymentMethod = PaymentMethod(
    id = "twint",
    `type` = PaymentMethodType.Online,
    name = "Twint",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/twint/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/twint/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/twint/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Unionpay: PaymentMethod = PaymentMethod(
    id = "unionpay",
    `type` = PaymentMethodType.Online,
    name = "UnionPay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/unionpay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/unionpay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/unionpay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Vipps: PaymentMethod = PaymentMethod(
    id = "vipps",
    `type` = PaymentMethodType.Online,
    name = "Vipps",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/vipps/30/original.png",
        width = 40,
        height = 26,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/vipps/60/original.png",
        width = 77,
        height = 50,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/vipps/120/original.png",
        width = 154,
        height = 100,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )
  val Visa: PaymentMethod = PaymentMethod(
    id = "visa",
    `type` = PaymentMethodType.Card,
    name = "VISA",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/visa/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/visa/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/visa/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Seq(PaymentMethodCapability.Credit, PaymentMethodCapability.Debit)),
  )
  val Wechatpay: PaymentMethod = PaymentMethod(
    id = "wechatpay",
    `type` = PaymentMethodType.Online,
    name = "WeChat Pay",
    images = PaymentMethodImages(
      small = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/wechatpay/30/original.png",
        width = 65,
        height = 41,
      ),
      medium = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/wechatpay/60/original.png",
        width = 100,
        height = 60,
      ),
      large = PaymentMethodImage(
        url = "https://cdn.flow.io/util/logos/payment-methods/wechatpay/120/original.png",
        width = 256,
        height = 256,
      ),
    ),
    regions = Seq("world"),
    capabilities = Some(Nil),
  )

  val all: Seq[PaymentMethod] = Seq(
    Ach,
    Afterpay,
    Alipay,
    AmericanExpress,
    ApplePay,
    Bancontact,
    BanktransferIban,
    Bitcoin,
    Bitpay,
    CartesBancaires,
    CashOnDelivery,
    ChinaUnionPay,
    CryptocomPay,
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
    Grabpay,
    Ideal,
    Interac,
    Jcb,
    KcpBanktransfer,
    KcpCreditcard,
    KcpPayco,
    Klarna,
    Maestro,
    Mastercard,
    Mobilepay,
    MolpayPoints,
    Multibanco,
    Paypal,
    Przelewy24,
    Qiwiwallet,
    Sepadirectdebit,
    Trustly,
    Trustpay,
    Twint,
    Unionpay,
    Vipps,
    Visa,
    Wechatpay,
  )

}

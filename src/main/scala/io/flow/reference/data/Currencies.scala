package io.flow.reference.data

import io.flow.reference.v0.models.{Currency, CurrencySymbols}

object Currencies {

  val All = Currency(iso42173 = "ALL", name = "Albanian Lek", numberDecimals = 2, defaultLocale = Some("sq-AL"), symbols = None)
  val Dzd = Currency(iso42173 = "DZD", name = "Algerian Dinar", numberDecimals = 2, defaultLocale = Some("ar-DZ"), symbols = None)
  val Ang = Currency(iso42173 = "ANG", name = "Antillian Guilder", numberDecimals = 2, defaultLocale = Some("nl-CW"), symbols = None)
  val Ars = Currency(iso42173 = "ARS", name = "Argentine Peso", numberDecimals = 2, defaultLocale = Some("es-AR"), symbols = None)
  val Amd = Currency(iso42173 = "AMD", name = "Armenian Dram", numberDecimals = 2, defaultLocale = Some("hy-AM"), symbols = None)
  val Awg = Currency(iso42173 = "AWG", name = "Aruban Guilder", numberDecimals = 2, defaultLocale = Some("nl-AW"), symbols = None)
  val Aud = Currency(iso42173 = "AUD", name = "Australian Dollar", numberDecimals = 2, defaultLocale = Some("en-AU"), symbols = Some(CurrencySymbols(primary = "A$", narrow = Some("$"))))
  val Azn = Currency(iso42173 = "AZN", name = "Azerbaijani manat", numberDecimals = 2, defaultLocale = Some("az"), symbols = None)
  val Bsd = Currency(iso42173 = "BSD", name = "Bahamian Dollar", numberDecimals = 2, defaultLocale = Some("en-BS"), symbols = None)
  val Bhd = Currency(iso42173 = "BHD", name = "Bahraini Dinar", numberDecimals = 3, defaultLocale = Some("ar-BH"), symbols = None)
  val Bdt = Currency(iso42173 = "BDT", name = "Bangladesh Taka", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Bbd = Currency(iso42173 = "BBD", name = "Barbados Dollar", numberDecimals = 2, defaultLocale = Some("en-BB"), symbols = None)
  val Bzd = Currency(iso42173 = "BZD", name = "Belize Dollar", numberDecimals = 2, defaultLocale = Some("en-BZ"), symbols = None)
  val Bmd = Currency(iso42173 = "BMD", name = "Bermudian Dollar", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Bob = Currency(iso42173 = "BOB", name = "Bolivia Boliviano", numberDecimals = 2, defaultLocale = Some("qu-BO"), symbols = None)
  val Bam = Currency(iso42173 = "BAM", name = "Bosnia and Herzegovina Convertible Marks", numberDecimals = 2, defaultLocale = Some("hr-BA"), symbols = None)
  val Bwp = Currency(iso42173 = "BWP", name = "Botswana Pula", numberDecimals = 2, defaultLocale = Some("en-BW"), symbols = None)
  val Brl = Currency(iso42173 = "BRL", name = "Brazilian Real", numberDecimals = 2, defaultLocale = Some("pt-BR"), symbols = Some(CurrencySymbols(primary = "R$", narrow = None)))
  val Bnd = Currency(iso42173 = "BND", name = "Brunei Dollar", numberDecimals = 2, defaultLocale = Some("ms-BN"), symbols = None)
  val Khr = Currency(iso42173 = "KHR", name = "Cambodia Riel", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Cad = Currency(iso42173 = "CAD", name = "Canadian Dollar", numberDecimals = 2, defaultLocale = Some("en-CA"), symbols = Some(CurrencySymbols(primary = "CA$", narrow = Some("$"))))
  val Cve = Currency(iso42173 = "CVE", name = "Cape Verdi Escudo", numberDecimals = 0, defaultLocale = Some("pt-CV"), symbols = None)
  val Kyd = Currency(iso42173 = "KYD", name = "Cayman Islands Dollar", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Xof = Currency(iso42173 = "XOF", name = "CFA Franc BCEAO", numberDecimals = 0, defaultLocale = Some("ee-TG"), symbols = Some(CurrencySymbols(primary = "CFA", narrow = None)))
  val Xaf = Currency(iso42173 = "XAF", name = "CFA Franc BEAC", numberDecimals = 0, defaultLocale = Some("ar-TD"), symbols = Some(CurrencySymbols(primary = "FCFA", narrow = None)))
  val Xpf = Currency(iso42173 = "XPF", name = "CFP Franc", numberDecimals = 0, defaultLocale = Some("fr-PF"), symbols = Some(CurrencySymbols(primary = "CFPF", narrow = None)))
  val Clp = Currency(iso42173 = "CLP", name = "Chilean Peso", numberDecimals = 2, defaultLocale = Some("es-CL"), symbols = None)
  val Cop = Currency(iso42173 = "COP", name = "Colombian Peso", numberDecimals = 2, defaultLocale = Some("es-CO"), symbols = None)
  val Kmf = Currency(iso42173 = "KMF", name = "Comoro Franc", numberDecimals = 0, defaultLocale = Some("ar-KM"), symbols = None)
  val Crc = Currency(iso42173 = "CRC", name = "Costa Rican Colon", numberDecimals = 2, defaultLocale = Some("es-CR"), symbols = None)
  val Hrk = Currency(iso42173 = "HRK", name = "Croatia Kuna", numberDecimals = 2, defaultLocale = Some("hr"), symbols = None)
  val Czk = Currency(iso42173 = "CZK", name = "Czech Koruna", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Dkk = Currency(iso42173 = "DKK", name = "Danish Krone", numberDecimals = 2, defaultLocale = Some("da-DK"), symbols = None)
  val Djf = Currency(iso42173 = "DJF", name = "Djibouti Franc", numberDecimals = 0, defaultLocale = Some("ar-DJ"), symbols = None)
  val Dop = Currency(iso42173 = "DOP", name = "Dominican Republic Peso", numberDecimals = 2, defaultLocale = Some("es-DO"), symbols = None)
  val Xcd = Currency(iso42173 = "XCD", name = "East Carribean Dollar", numberDecimals = 2, defaultLocale = Some("en-AI"), symbols = Some(CurrencySymbols(primary = "EC$", narrow = Some("$"))))
  val Egp = Currency(iso42173 = "EGP", name = "Egyptian Pound", numberDecimals = 2, defaultLocale = Some("ar-EG"), symbols = None)
  val Svc = Currency(iso42173 = "SVC", name = "El Salvador Colón", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Eek = Currency(iso42173 = "EEK", name = "Estonian Krone", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Etb = Currency(iso42173 = "ETB", name = "Ethiopian Birr", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Eur = Currency(iso42173 = "EUR", name = "Euro", numberDecimals = 2, defaultLocale = Some("en-DE"), symbols = Some(CurrencySymbols(primary = "€", narrow = None)))
  val Fkp = Currency(iso42173 = "FKP", name = "Falkland Islands Pound", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Fjd = Currency(iso42173 = "FJD", name = "Fiji Dollar", numberDecimals = 2, defaultLocale = Some("en-FJ"), symbols = None)
  val Gmd = Currency(iso42173 = "GMD", name = "Gambia Delasi", numberDecimals = 2, defaultLocale = Some("en-GM"), symbols = None)
  val Gel = Currency(iso42173 = "GEL", name = "Georgian Lari", numberDecimals = 2, defaultLocale = Some("ka-GE"), symbols = None)
  val Ghs = Currency(iso42173 = "GHS", name = "Ghanaian Cedi (3rd)", numberDecimals = 2, defaultLocale = Some("ak-GH"), symbols = None)
  val Gip = Currency(iso42173 = "GIP", name = "Gibraltar Pound", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Gtq = Currency(iso42173 = "GTQ", name = "Guatemala Quetzal", numberDecimals = 2, defaultLocale = Some("es-GT"), symbols = None)
  val Gnf = Currency(iso42173 = "GNF", name = "Guinea Franc", numberDecimals = 0, defaultLocale = Some("fr-GN"), symbols = None)
  val Gyd = Currency(iso42173 = "GYD", name = "Guyanese Dollar", numberDecimals = 2, defaultLocale = Some("en-GY"), symbols = None)
  val Htg = Currency(iso42173 = "HTG", name = "Haitian Gourde", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Hnl = Currency(iso42173 = "HNL", name = "Honduras Lempira", numberDecimals = 2, defaultLocale = Some("es-HN"), symbols = None)
  val Hkd = Currency(iso42173 = "HKD", name = "Hong Kong Dollar", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "HK$", narrow = Some("$"))))
  val Huf = Currency(iso42173 = "HUF", name = "Hungarian Forint", numberDecimals = 2, defaultLocale = Some("hu"), symbols = None)
  val Isk = Currency(iso42173 = "ISK", name = "Iceland Krona", numberDecimals = 2, defaultLocale = Some("is"), symbols = None)
  val Inr = Currency(iso42173 = "INR", name = "Indian Rupee", numberDecimals = 2, defaultLocale = Some("bn-IN"), symbols = Some(CurrencySymbols(primary = "₹", narrow = None)))
  val Idr = Currency(iso42173 = "IDR", name = "Indonesian Rupiah", numberDecimals = 0, defaultLocale = Some("id"), symbols = None)
  val Jmd = Currency(iso42173 = "JMD", name = "Jamaican Dollar", numberDecimals = 2, defaultLocale = Some("en-JM"), symbols = None)
  val Jpy = Currency(iso42173 = "JPY", name = "Japanese Yen", numberDecimals = 0, defaultLocale = Some("ja-JP"), symbols = Some(CurrencySymbols(primary = "¥", narrow = None)))
  val Jod = Currency(iso42173 = "JOD", name = "Jordanian Dinar", numberDecimals = 3, defaultLocale = Some("ar-JO"), symbols = None)
  val Kzt = Currency(iso42173 = "KZT", name = "Kazakhstani Tenge", numberDecimals = 2, defaultLocale = Some("kk-KZ"), symbols = None)
  val Kes = Currency(iso42173 = "KES", name = "Kenyan Shilling", numberDecimals = 2, defaultLocale = Some("en-KE"), symbols = None)
  val Kwd = Currency(iso42173 = "KWD", name = "Kuwaiti Dinar", numberDecimals = 3, defaultLocale = Some("ar-KW"), symbols = None)
  val Kgs = Currency(iso42173 = "KGS", name = "Kyrgyzstan Som", numberDecimals = 2, defaultLocale = Some("ru-KG"), symbols = None)
  val Lak = Currency(iso42173 = "LAK", name = "Laos Kip", numberDecimals = 2, defaultLocale = Some("lo-LA"), symbols = None)
  val Lvl = Currency(iso42173 = "LVL", name = "Latvian Lats", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Lbp = Currency(iso42173 = "LBP", name = "Lebanese Pound", numberDecimals = 2, defaultLocale = Some("ar-LB"), symbols = None)
  val Lyd = Currency(iso42173 = "LYD", name = "Libyan Dinar", numberDecimals = 3, defaultLocale = Some("ar-LY"), symbols = None)
  val Ltl = Currency(iso42173 = "LTL", name = "Lithuanian Litas", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Mop = Currency(iso42173 = "MOP", name = "Macau Pataca", numberDecimals = 2, defaultLocale = Some("zh-MO"), symbols = None)
  val Mwk = Currency(iso42173 = "MWK", name = "Malawi Kwacha", numberDecimals = 2, defaultLocale = Some("en-MW"), symbols = None)
  val Myr = Currency(iso42173 = "MYR", name = "Malaysian Ringgit", numberDecimals = 2, defaultLocale = Some("en-MY"), symbols = None)
  val Mvr = Currency(iso42173 = "MVR", name = "Maldives Rufiyaa", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Mro = Currency(iso42173 = "MRO", name = "Mauritania Ouguiya", numberDecimals = 1, defaultLocale = Some("ar-MR"), symbols = None)
  val Mur = Currency(iso42173 = "MUR", name = "Mauritius Rupee", numberDecimals = 2, defaultLocale = Some("en-MU"), symbols = None)
  val Mxn = Currency(iso42173 = "MXN", name = "Mexican Peso", numberDecimals = 2, defaultLocale = Some("es-MX"), symbols = Some(CurrencySymbols(primary = "MX$", narrow = Some("$"))))
  val Mdl = Currency(iso42173 = "MDL", name = "Moldovia Leu", numberDecimals = 2, defaultLocale = Some("ro-MD"), symbols = None)
  val Mnt = Currency(iso42173 = "MNT", name = "Mongolia Tugrik", numberDecimals = 2, defaultLocale = Some("mn"), symbols = None)
  val Mad = Currency(iso42173 = "MAD", name = "Moroccan Dirham", numberDecimals = 2, defaultLocale = Some("ar-MA"), symbols = None)
  val Nad = Currency(iso42173 = "NAD", name = "Namibian Dollar", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Npr = Currency(iso42173 = "NPR", name = "Nepalese Rupee", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Byn = Currency(iso42173 = "BYN", name = "New Belarusian Ruble", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Bgn = Currency(iso42173 = "BGN", name = "New Bulgarian Lev", numberDecimals = 2, defaultLocale = Some("bg"), symbols = None)
  val Pgk = Currency(iso42173 = "PGK", name = "New Guinea Kina", numberDecimals = 2, defaultLocale = Some("en-PG"), symbols = None)
  val Ils = Currency(iso42173 = "ILS", name = "New Israeli Scheqel", numberDecimals = 2, defaultLocale = Some("ar-IL"), symbols = Some(CurrencySymbols(primary = "₪", narrow = None)))
  val Pln = Currency(iso42173 = "PLN", name = "New Polish Zloty", numberDecimals = 2, defaultLocale = Some("pl"), symbols = None)
  val Ron = Currency(iso42173 = "RON", name = "New Romanian Lei", numberDecimals = 2, defaultLocale = Some("ro"), symbols = None)
  val Twd = Currency(iso42173 = "TWD", name = "New Taiwan Dollar", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "NT$", narrow = Some("$"))))
  val Try = Currency(iso42173 = "TRY", name = "New Turkish Lira", numberDecimals = 2, defaultLocale = Some("tr"), symbols = None)
  val Nzd = Currency(iso42173 = "NZD", name = "New Zealand Dollar", numberDecimals = 2, defaultLocale = Some("en-CK"), symbols = Some(CurrencySymbols(primary = "NZ$", narrow = Some("$"))))
  val Nio = Currency(iso42173 = "NIO", name = "Nicaragua Cordoba Oro", numberDecimals = 2, defaultLocale = Some("es-NI"), symbols = None)
  val Ngn = Currency(iso42173 = "NGN", name = "Nigerian Naira", numberDecimals = 2, defaultLocale = Some("en-NG"), symbols = None)
  val Nok = Currency(iso42173 = "NOK", name = "Norwegian Krone", numberDecimals = 2, defaultLocale = Some("nb-NO"), symbols = None)
  val Pkr = Currency(iso42173 = "PKR", name = "Pakistan Rupee", numberDecimals = 2, defaultLocale = Some("en-PK"), symbols = None)
  val Pab = Currency(iso42173 = "PAB", name = "Panamanian Balboa", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Pyg = Currency(iso42173 = "PYG", name = "Paraguay Guarani", numberDecimals = 0, defaultLocale = Some("es-PY"), symbols = None)
  val Pen = Currency(iso42173 = "PEN", name = "Peruvian Nuevo Sol", numberDecimals = 2, defaultLocale = Some("es-PE"), symbols = None)
  val Uyu = Currency(iso42173 = "UYU", name = "Peso Uruguayo", numberDecimals = 2, defaultLocale = Some("es-UY"), symbols = None)
  val Php = Currency(iso42173 = "PHP", name = "Philippine Peso", numberDecimals = 2, defaultLocale = Some("en-PH"), symbols = None)
  val Gbp = Currency(iso42173 = "GBP", name = "Pound Sterling", numberDecimals = 2, defaultLocale = Some("en-GB"), symbols = Some(CurrencySymbols(primary = "£", narrow = None)))
  val Qar = Currency(iso42173 = "QAR", name = "Qatari Rial", numberDecimals = 2, defaultLocale = Some("ar-QA"), symbols = None)
  val Omr = Currency(iso42173 = "OMR", name = "Rial Omani", numberDecimals = 3, defaultLocale = Some("ar-OM"), symbols = None)
  val Rub = Currency(iso42173 = "RUB", name = "Russian Ruble", numberDecimals = 2, defaultLocale = Some("ru"), symbols = None)
  val Rwf = Currency(iso42173 = "RWF", name = "Rwanda Franc", numberDecimals = 0, defaultLocale = Some("en-RW"), symbols = None)
  val Wst = Currency(iso42173 = "WST", name = "Samoan Tala", numberDecimals = 2, defaultLocale = Some("en-WS"), symbols = None)
  val Std = Currency(iso42173 = "STD", name = "Sao Tome & Principe Dobra", numberDecimals = 2, defaultLocale = Some("pt-ST"), symbols = None)
  val Sar = Currency(iso42173 = "SAR", name = "Saudi Riyal", numberDecimals = 2, defaultLocale = Some("ar-SA"), symbols = None)
  val Rsd = Currency(iso42173 = "RSD", name = "Serbian Dinar", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Scr = Currency(iso42173 = "SCR", name = "Seychelles Rupee", numberDecimals = 2, defaultLocale = Some("en-SC"), symbols = None)
  val Sll = Currency(iso42173 = "SLL", name = "Sierra Leone", numberDecimals = 2, defaultLocale = Some("en-SL"), symbols = None)
  val Sgd = Currency(iso42173 = "SGD", name = "Singapore Dollar", numberDecimals = 2, defaultLocale = Some("zh-SG"), symbols = None)
  val Sbd = Currency(iso42173 = "SBD", name = "Solomon Island Dollar", numberDecimals = 2, defaultLocale = Some("en-SB"), symbols = None)
  val Sos = Currency(iso42173 = "SOS", name = "Somalia Shilling", numberDecimals = 2, defaultLocale = Some("ar-SO"), symbols = None)
  val Zar = Currency(iso42173 = "ZAR", name = "South African Rand", numberDecimals = 2, defaultLocale = Some("af-NA"), symbols = None)
  val Krw = Currency(iso42173 = "KRW", name = "South-Korean Won", numberDecimals = 0, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "₩", narrow = None)))
  val Lkr = Currency(iso42173 = "LKR", name = "Sri Lanka Rupee", numberDecimals = 2, defaultLocale = Some("ta-LK"), symbols = None)
  val Shp = Currency(iso42173 = "SHP", name = "St. Helena Pound", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Szl = Currency(iso42173 = "SZL", name = "Swaziland Lilangeni", numberDecimals = 2, defaultLocale = Some("en-SZ"), symbols = None)
  val Sek = Currency(iso42173 = "SEK", name = "Swedish Krone", numberDecimals = 2, defaultLocale = None, symbols = None)
  val Chf = Currency(iso42173 = "CHF", name = "Swiss Franc", numberDecimals = 2, defaultLocale = Some("fr-CH"), symbols = None)
  val Tzs = Currency(iso42173 = "TZS", name = "Tanzanian Shilling", numberDecimals = 2, defaultLocale = Some("en-TZ"), symbols = None)
  val Thb = Currency(iso42173 = "THB", name = "Thai Baht", numberDecimals = 2, defaultLocale = Some("th"), symbols = None)
  val Top = Currency(iso42173 = "TOP", name = "Tonga Pa'anga", numberDecimals = 2, defaultLocale = Some("en-TO"), symbols = None)
  val Ttd = Currency(iso42173 = "TTD", name = "Trinidad & Tobago Dollar", numberDecimals = 2, defaultLocale = Some("en-TT"), symbols = None)
  val Tnd = Currency(iso42173 = "TND", name = "Tunisian Dinar", numberDecimals = 3, defaultLocale = Some("ar-TN"), symbols = None)
  val Aed = Currency(iso42173 = "AED", name = "UAE Dirham", numberDecimals = 2, defaultLocale = Some("ar-AE"), symbols = None)
  val Ugx = Currency(iso42173 = "UGX", name = "Uganda Shilling", numberDecimals = 0, defaultLocale = Some("en-UG"), symbols = None)
  val Uah = Currency(iso42173 = "UAH", name = "Ukraine Hryvnia", numberDecimals = 2, defaultLocale = Some("uk-UA"), symbols = None)
  val Usd = Currency(iso42173 = "USD", name = "US Dollars", numberDecimals = 2, defaultLocale = Some("en-US"), symbols = Some(CurrencySymbols(primary = "$", narrow = None)))
  val Uzs = Currency(iso42173 = "UZS", name = "Uzbekistani Som", numberDecimals = 2, defaultLocale = Some("uz"), symbols = None)
  val Vuv = Currency(iso42173 = "VUV", name = "Vanuatu Vatu", numberDecimals = 0, defaultLocale = Some("en-VU"), symbols = None)
  val Vef = Currency(iso42173 = "VEF", name = "Venezuelan Bolívar", numberDecimals = 2, defaultLocale = Some("es-VE"), symbols = None)
  val Vnd = Currency(iso42173 = "VND", name = "Vietnamese New Dong", numberDecimals = 0, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "₫", narrow = None)))
  val Yer = Currency(iso42173 = "YER", name = "Yemeni Rial", numberDecimals = 2, defaultLocale = Some("ar-YE"), symbols = None)
  val Cny = Currency(iso42173 = "CNY", name = "Yuan Renminbi", numberDecimals = 2, defaultLocale = Some("zh-CN"), symbols = Some(CurrencySymbols(primary = "CN¥", narrow = Some("¥"))))
  val Zmw = Currency(iso42173 = "ZMW", name = "Zambia Kwacha", numberDecimals = 2, defaultLocale = Some("en-ZM"), symbols = None)

  val all = Seq(
    All,
    Dzd,
    Ang,
    Ars,
    Amd,
    Awg,
    Aud,
    Azn,
    Bsd,
    Bhd,
    Bdt,
    Bbd,
    Bzd,
    Bmd,
    Bob,
    Bam,
    Bwp,
    Brl,
    Bnd,
    Khr,
    Cad,
    Cve,
    Kyd,
    Xof,
    Xaf,
    Xpf,
    Clp,
    Cop,
    Kmf,
    Crc,
    Hrk,
    Czk,
    Dkk,
    Djf,
    Dop,
    Xcd,
    Egp,
    Svc,
    Eek,
    Etb,
    Eur,
    Fkp,
    Fjd,
    Gmd,
    Gel,
    Ghs,
    Gip,
    Gtq,
    Gnf,
    Gyd,
    Htg,
    Hnl,
    Hkd,
    Huf,
    Isk,
    Inr,
    Idr,
    Jmd,
    Jpy,
    Jod,
    Kzt,
    Kes,
    Kwd,
    Kgs,
    Lak,
    Lvl,
    Lbp,
    Lyd,
    Ltl,
    Mop,
    Mwk,
    Myr,
    Mvr,
    Mro,
    Mur,
    Mxn,
    Mdl,
    Mnt,
    Mad,
    Nad,
    Npr,
    Byn,
    Bgn,
    Pgk,
    Ils,
    Pln,
    Ron,
    Twd,
    Try,
    Nzd,
    Nio,
    Ngn,
    Nok,
    Pkr,
    Pab,
    Pyg,
    Pen,
    Uyu,
    Php,
    Gbp,
    Qar,
    Omr,
    Rub,
    Rwf,
    Wst,
    Std,
    Sar,
    Rsd,
    Scr,
    Sll,
    Sgd,
    Sbd,
    Sos,
    Zar,
    Krw,
    Lkr,
    Shp,
    Szl,
    Sek,
    Chf,
    Tzs,
    Thb,
    Top,
    Ttd,
    Tnd,
    Aed,
    Ugx,
    Uah,
    Usd,
    Uzs,
    Vuv,
    Vef,
    Vnd,
    Yer,
    Cny,
    Zmw
  )

}

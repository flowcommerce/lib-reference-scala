package io.flow.reference.data

import io.flow.reference.v0.models.{Currency, CurrencySymbols}

object Currencies {

  val All = Currency(iso42173 = "ALL", name = "Albanian Lek", numberDecimals = 2, defaultLocale = Some("sq-AL"), symbols = Some(CurrencySymbols(primary = "ALL", narrow = None)))
  val Dzd = Currency(iso42173 = "DZD", name = "Algerian Dinar", numberDecimals = 2, defaultLocale = Some("ar-DZ"), symbols = Some(CurrencySymbols(primary = "DZD", narrow = None)))
  val Ang = Currency(iso42173 = "ANG", name = "Antillian Guilder", numberDecimals = 2, defaultLocale = Some("nl-CW"), symbols = Some(CurrencySymbols(primary = "ANG", narrow = None)))
  val Ars = Currency(iso42173 = "ARS", name = "Argentine Peso", numberDecimals = 2, defaultLocale = Some("es-AR"), symbols = Some(CurrencySymbols(primary = "ARS", narrow = Some("$"))))
  val Amd = Currency(iso42173 = "AMD", name = "Armenian Dram", numberDecimals = 2, defaultLocale = Some("hy-AM"), symbols = Some(CurrencySymbols(primary = "AMD", narrow = None)))
  val Awg = Currency(iso42173 = "AWG", name = "Aruban Guilder", numberDecimals = 2, defaultLocale = Some("nl-AW"), symbols = Some(CurrencySymbols(primary = "AWG", narrow = None)))
  val Aud = Currency(iso42173 = "AUD", name = "Australian Dollar", numberDecimals = 2, defaultLocale = Some("en-AU"), symbols = Some(CurrencySymbols(primary = "A$", narrow = Some("$"))))
  val Azn = Currency(iso42173 = "AZN", name = "Azerbaijani manat", numberDecimals = 2, defaultLocale = Some("az"), symbols = Some(CurrencySymbols(primary = "AZN", narrow = None)))
  val Bsd = Currency(iso42173 = "BSD", name = "Bahamian Dollar", numberDecimals = 2, defaultLocale = Some("en-BS"), symbols = Some(CurrencySymbols(primary = "BSD", narrow = Some("$"))))
  val Bhd = Currency(iso42173 = "BHD", name = "Bahraini Dinar", numberDecimals = 3, defaultLocale = Some("ar-BH"), symbols = Some(CurrencySymbols(primary = "BHD", narrow = None)))
  val Bdt = Currency(iso42173 = "BDT", name = "Bangladesh Taka", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "BDT", narrow = Some("৳"))))
  val Bbd = Currency(iso42173 = "BBD", name = "Barbados Dollar", numberDecimals = 2, defaultLocale = Some("en-BB"), symbols = Some(CurrencySymbols(primary = "BBD", narrow = Some("$"))))
  val Bzd = Currency(iso42173 = "BZD", name = "Belize Dollar", numberDecimals = 2, defaultLocale = Some("en-BZ"), symbols = Some(CurrencySymbols(primary = "BZD", narrow = Some("$"))))
  val Bmd = Currency(iso42173 = "BMD", name = "Bermudian Dollar", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "BMD", narrow = Some("$"))))
  val Bob = Currency(iso42173 = "BOB", name = "Bolivia Boliviano", numberDecimals = 2, defaultLocale = Some("qu-BO"), symbols = Some(CurrencySymbols(primary = "BOB", narrow = Some("Bs"))))
  val Bam = Currency(iso42173 = "BAM", name = "Bosnia and Herzegovina Convertible Marks", numberDecimals = 2, defaultLocale = Some("hr-BA"), symbols = Some(CurrencySymbols(primary = "BAM", narrow = Some("KM"))))
  val Bwp = Currency(iso42173 = "BWP", name = "Botswana Pula", numberDecimals = 2, defaultLocale = Some("en-BW"), symbols = Some(CurrencySymbols(primary = "BWP", narrow = Some("P"))))
  val Brl = Currency(iso42173 = "BRL", name = "Brazilian Real", numberDecimals = 2, defaultLocale = Some("pt-BR"), symbols = Some(CurrencySymbols(primary = "R$", narrow = Some("R$"))))
  val Bnd = Currency(iso42173 = "BND", name = "Brunei Dollar", numberDecimals = 2, defaultLocale = Some("ms-BN"), symbols = Some(CurrencySymbols(primary = "BND", narrow = Some("$"))))
  val Mmk = Currency(iso42173 = "MMK", name = "Burmese Kyat", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "MMK", narrow = Some("K"))))
  val Khr = Currency(iso42173 = "KHR", name = "Cambodia Riel", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "KHR", narrow = Some("៛"))))
  val Cad = Currency(iso42173 = "CAD", name = "Canadian Dollar", numberDecimals = 2, defaultLocale = Some("en-CA"), symbols = Some(CurrencySymbols(primary = "CA$", narrow = Some("$"))))
  val Cve = Currency(iso42173 = "CVE", name = "Cape Verdi Escudo", numberDecimals = 0, defaultLocale = Some("pt-CV"), symbols = Some(CurrencySymbols(primary = "CVE", narrow = None)))
  val Kyd = Currency(iso42173 = "KYD", name = "Cayman Islands Dollar", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "KYD", narrow = Some("$"))))
  val Xof = Currency(iso42173 = "XOF", name = "CFA Franc BCEAO", numberDecimals = 0, defaultLocale = Some("ee-TG"), symbols = Some(CurrencySymbols(primary = "CFA", narrow = None)))
  val Xaf = Currency(iso42173 = "XAF", name = "CFA Franc BEAC", numberDecimals = 0, defaultLocale = Some("ar-TD"), symbols = Some(CurrencySymbols(primary = "FCFA", narrow = None)))
  val Xpf = Currency(iso42173 = "XPF", name = "CFP Franc", numberDecimals = 0, defaultLocale = Some("fr-PF"), symbols = Some(CurrencySymbols(primary = "CFPF", narrow = None)))
  val Clp = Currency(iso42173 = "CLP", name = "Chilean Peso", numberDecimals = 2, defaultLocale = Some("es-CL"), symbols = Some(CurrencySymbols(primary = "CLP", narrow = Some("$"))))
  val Cop = Currency(iso42173 = "COP", name = "Colombian Peso", numberDecimals = 2, defaultLocale = Some("es-CO"), symbols = Some(CurrencySymbols(primary = "COP", narrow = Some("$"))))
  val Kmf = Currency(iso42173 = "KMF", name = "Comoro Franc", numberDecimals = 0, defaultLocale = Some("ar-KM"), symbols = Some(CurrencySymbols(primary = "KMF", narrow = Some("CF"))))
  val Crc = Currency(iso42173 = "CRC", name = "Costa Rican Colon", numberDecimals = 2, defaultLocale = Some("es-CR"), symbols = Some(CurrencySymbols(primary = "CRC", narrow = Some("₡"))))
  val Hrk = Currency(iso42173 = "HRK", name = "Croatia Kuna", numberDecimals = 2, defaultLocale = Some("hr"), symbols = Some(CurrencySymbols(primary = "HRK", narrow = Some("kn"))))
  val Czk = Currency(iso42173 = "CZK", name = "Czech Koruna", numberDecimals = 2, defaultLocale = Some("cs-CZ"), symbols = Some(CurrencySymbols(primary = "CZK", narrow = Some("Kč"))))
  val Dkk = Currency(iso42173 = "DKK", name = "Danish Krone", numberDecimals = 2, defaultLocale = Some("da-DK"), symbols = Some(CurrencySymbols(primary = "DKK", narrow = Some("kr"))))
  val Djf = Currency(iso42173 = "DJF", name = "Djibouti Franc", numberDecimals = 0, defaultLocale = Some("ar-DJ"), symbols = Some(CurrencySymbols(primary = "DJF", narrow = None)))
  val Dop = Currency(iso42173 = "DOP", name = "Dominican Republic Peso", numberDecimals = 2, defaultLocale = Some("es-DO"), symbols = Some(CurrencySymbols(primary = "DOP", narrow = Some("$"))))
  val Xcd = Currency(iso42173 = "XCD", name = "East Carribean Dollar", numberDecimals = 2, defaultLocale = Some("en-AI"), symbols = Some(CurrencySymbols(primary = "EC$", narrow = Some("$"))))
  val Egp = Currency(iso42173 = "EGP", name = "Egyptian Pound", numberDecimals = 2, defaultLocale = Some("ar-EG"), symbols = Some(CurrencySymbols(primary = "EGP", narrow = Some("E£"))))
  val Svc = Currency(iso42173 = "SVC", name = "El Salvador Colón", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "SVC", narrow = None)))
  val Eek = Currency(iso42173 = "EEK", name = "Estonian Krone", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "EEK", narrow = None)))
  val Etb = Currency(iso42173 = "ETB", name = "Ethiopian Birr", numberDecimals = 2, defaultLocale = Some("am-ET"), symbols = Some(CurrencySymbols(primary = "ETB", narrow = None)))
  val Eur = Currency(iso42173 = "EUR", name = "Euro", numberDecimals = 2, defaultLocale = Some("de"), symbols = Some(CurrencySymbols(primary = "€", narrow = Some("€"))))
  val Fkp = Currency(iso42173 = "FKP", name = "Falkland Islands Pound", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "FKP", narrow = Some("£"))))
  val Fjd = Currency(iso42173 = "FJD", name = "Fiji Dollar", numberDecimals = 2, defaultLocale = Some("en-FJ"), symbols = Some(CurrencySymbols(primary = "FJD", narrow = Some("$"))))
  val Gmd = Currency(iso42173 = "GMD", name = "Gambia Delasi", numberDecimals = 2, defaultLocale = Some("en-GM"), symbols = Some(CurrencySymbols(primary = "GMD", narrow = None)))
  val Gel = Currency(iso42173 = "GEL", name = "Georgian Lari", numberDecimals = 2, defaultLocale = Some("ka-GE"), symbols = Some(CurrencySymbols(primary = "GEL", narrow = Some("₾"))))
  val Ghs = Currency(iso42173 = "GHS", name = "Ghanaian Cedi (3rd)", numberDecimals = 2, defaultLocale = Some("ak-GH"), symbols = Some(CurrencySymbols(primary = "GHS", narrow = None)))
  val Gip = Currency(iso42173 = "GIP", name = "Gibraltar Pound", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "GIP", narrow = Some("£"))))
  val Gtq = Currency(iso42173 = "GTQ", name = "Guatemala Quetzal", numberDecimals = 2, defaultLocale = Some("es-GT"), symbols = Some(CurrencySymbols(primary = "GTQ", narrow = Some("Q"))))
  val Gnf = Currency(iso42173 = "GNF", name = "Guinea Franc", numberDecimals = 0, defaultLocale = Some("fr-GN"), symbols = Some(CurrencySymbols(primary = "GNF", narrow = Some("FG"))))
  val Gyd = Currency(iso42173 = "GYD", name = "Guyanese Dollar", numberDecimals = 2, defaultLocale = Some("en-GY"), symbols = Some(CurrencySymbols(primary = "GYD", narrow = Some("$"))))
  val Htg = Currency(iso42173 = "HTG", name = "Haitian Gourde", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "HTG", narrow = None)))
  val Hnl = Currency(iso42173 = "HNL", name = "Honduras Lempira", numberDecimals = 2, defaultLocale = Some("es-HN"), symbols = Some(CurrencySymbols(primary = "HNL", narrow = Some("L"))))
  val Hkd = Currency(iso42173 = "HKD", name = "Hong Kong Dollar", numberDecimals = 2, defaultLocale = Some("zh-HK"), symbols = Some(CurrencySymbols(primary = "HK$", narrow = Some("$"))))
  val Huf = Currency(iso42173 = "HUF", name = "Hungarian Forint", numberDecimals = 0, defaultLocale = Some("hu"), symbols = Some(CurrencySymbols(primary = "HUF", narrow = Some("Ft"))))
  val Isk = Currency(iso42173 = "ISK", name = "Iceland Krona", numberDecimals = 2, defaultLocale = Some("is"), symbols = Some(CurrencySymbols(primary = "ISK", narrow = Some("kr"))))
  val Inr = Currency(iso42173 = "INR", name = "Indian Rupee", numberDecimals = 2, defaultLocale = Some("bn-IN"), symbols = Some(CurrencySymbols(primary = "₹", narrow = Some("₹"))))
  val Idr = Currency(iso42173 = "IDR", name = "Indonesian Rupiah", numberDecimals = 0, defaultLocale = Some("id"), symbols = Some(CurrencySymbols(primary = "IDR", narrow = Some("Rp"))))
  val Jmd = Currency(iso42173 = "JMD", name = "Jamaican Dollar", numberDecimals = 2, defaultLocale = Some("en-JM"), symbols = Some(CurrencySymbols(primary = "JMD", narrow = Some("$"))))
  val Jpy = Currency(iso42173 = "JPY", name = "Japanese Yen", numberDecimals = 0, defaultLocale = Some("ja-JP"), symbols = Some(CurrencySymbols(primary = "¥", narrow = Some("¥"))))
  val Jod = Currency(iso42173 = "JOD", name = "Jordanian Dinar", numberDecimals = 3, defaultLocale = Some("ar-JO"), symbols = Some(CurrencySymbols(primary = "JOD", narrow = None)))
  val Kzt = Currency(iso42173 = "KZT", name = "Kazakhstani Tenge", numberDecimals = 2, defaultLocale = Some("kk-KZ"), symbols = Some(CurrencySymbols(primary = "KZT", narrow = Some("₸"))))
  val Kes = Currency(iso42173 = "KES", name = "Kenyan Shilling", numberDecimals = 2, defaultLocale = Some("en-KE"), symbols = Some(CurrencySymbols(primary = "KES", narrow = None)))
  val Kwd = Currency(iso42173 = "KWD", name = "Kuwaiti Dinar", numberDecimals = 3, defaultLocale = Some("ar-KW"), symbols = Some(CurrencySymbols(primary = "KWD", narrow = None)))
  val Aoa = Currency(iso42173 = "AOA", name = "Kwanza", numberDecimals = 2, defaultLocale = Some("pt-AO"), symbols = Some(CurrencySymbols(primary = "AOA", narrow = Some("Kz"))))
  val Kgs = Currency(iso42173 = "KGS", name = "Kyrgyzstan Som", numberDecimals = 2, defaultLocale = Some("ru-KG"), symbols = Some(CurrencySymbols(primary = "KGS", narrow = None)))
  val Lak = Currency(iso42173 = "LAK", name = "Laos Kip", numberDecimals = 2, defaultLocale = Some("lo-LA"), symbols = Some(CurrencySymbols(primary = "LAK", narrow = Some("₭"))))
  val Lvl = Currency(iso42173 = "LVL", name = "Latvian Lats", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "LVL", narrow = Some("Ls"))))
  val Lbp = Currency(iso42173 = "LBP", name = "Lebanese Pound", numberDecimals = 2, defaultLocale = Some("ar-LB"), symbols = Some(CurrencySymbols(primary = "LBP", narrow = Some("L£"))))
  val Lyd = Currency(iso42173 = "LYD", name = "Libyan Dinar", numberDecimals = 3, defaultLocale = Some("ar-LY"), symbols = Some(CurrencySymbols(primary = "LYD", narrow = None)))
  val Ltl = Currency(iso42173 = "LTL", name = "Lithuanian Litas", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "LTL", narrow = Some("Lt"))))
  val Mop = Currency(iso42173 = "MOP", name = "Macau Pataca", numberDecimals = 2, defaultLocale = Some("zh-MO"), symbols = Some(CurrencySymbols(primary = "MOP", narrow = None)))
  val Mga = Currency(iso42173 = "MGA", name = "Malagasy Ariary", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "MGA", narrow = Some("Ar"))))
  val Mwk = Currency(iso42173 = "MWK", name = "Malawi Kwacha", numberDecimals = 2, defaultLocale = Some("en-MW"), symbols = Some(CurrencySymbols(primary = "MWK", narrow = None)))
  val Myr = Currency(iso42173 = "MYR", name = "Malaysian Ringgit", numberDecimals = 2, defaultLocale = Some("en-MY"), symbols = Some(CurrencySymbols(primary = "MYR", narrow = Some("RM"))))
  val Mvr = Currency(iso42173 = "MVR", name = "Maldives Rufiyaa", numberDecimals = 2, defaultLocale = Some("dv-MV"), symbols = Some(CurrencySymbols(primary = "MVR", narrow = None)))
  val Mro = Currency(iso42173 = "MRO", name = "Mauritania Ouguiya", numberDecimals = 1, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "MRO", narrow = None)))
  val Mur = Currency(iso42173 = "MUR", name = "Mauritius Rupee", numberDecimals = 2, defaultLocale = Some("en-MU"), symbols = Some(CurrencySymbols(primary = "MUR", narrow = Some("Rs"))))
  val Mxn = Currency(iso42173 = "MXN", name = "Mexican Peso", numberDecimals = 2, defaultLocale = Some("es-MX"), symbols = Some(CurrencySymbols(primary = "MX$", narrow = Some("$"))))
  val Mdl = Currency(iso42173 = "MDL", name = "Moldovia Leu", numberDecimals = 2, defaultLocale = Some("ro-MD"), symbols = Some(CurrencySymbols(primary = "MDL", narrow = None)))
  val Mnt = Currency(iso42173 = "MNT", name = "Mongolia Tugrik", numberDecimals = 2, defaultLocale = Some("mn"), symbols = Some(CurrencySymbols(primary = "MNT", narrow = Some("₮"))))
  val Mad = Currency(iso42173 = "MAD", name = "Moroccan Dirham", numberDecimals = 2, defaultLocale = Some("ar-MA"), symbols = Some(CurrencySymbols(primary = "MAD", narrow = None)))
  val Mzn = Currency(iso42173 = "MZN", name = "Mozambique Metical", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "MZN", narrow = None)))
  val Nad = Currency(iso42173 = "NAD", name = "Namibian Dollar", numberDecimals = 2, defaultLocale = Some("en-NA"), symbols = Some(CurrencySymbols(primary = "NAD", narrow = Some("$"))))
  val Npr = Currency(iso42173 = "NPR", name = "Nepalese Rupee", numberDecimals = 2, defaultLocale = Some("ne-NP"), symbols = Some(CurrencySymbols(primary = "NPR", narrow = Some("Rs"))))
  val Byn = Currency(iso42173 = "BYN", name = "New Belarusian Ruble", numberDecimals = 2, defaultLocale = Some("ru-BY"), symbols = Some(CurrencySymbols(primary = "BYN", narrow = Some("р."))))
  val Bgn = Currency(iso42173 = "BGN", name = "New Bulgarian Lev", numberDecimals = 2, defaultLocale = Some("bg"), symbols = Some(CurrencySymbols(primary = "BGN", narrow = None)))
  val Pgk = Currency(iso42173 = "PGK", name = "New Guinea Kina", numberDecimals = 2, defaultLocale = Some("en-PG"), symbols = Some(CurrencySymbols(primary = "PGK", narrow = None)))
  val Ils = Currency(iso42173 = "ILS", name = "New Israeli Scheqel", numberDecimals = 2, defaultLocale = Some("ar-IL"), symbols = Some(CurrencySymbols(primary = "₪", narrow = Some("₪"))))
  val Pln = Currency(iso42173 = "PLN", name = "New Polish Zloty", numberDecimals = 2, defaultLocale = Some("pl"), symbols = Some(CurrencySymbols(primary = "PLN", narrow = Some("zł"))))
  val Ron = Currency(iso42173 = "RON", name = "New Romanian Lei", numberDecimals = 2, defaultLocale = Some("ro"), symbols = Some(CurrencySymbols(primary = "RON", narrow = Some("lei"))))
  val Twd = Currency(iso42173 = "TWD", name = "New Taiwan Dollar", numberDecimals = 0, defaultLocale = Some("zh-TW"), symbols = Some(CurrencySymbols(primary = "NT$", narrow = Some("$"))))
  val Try = Currency(iso42173 = "TRY", name = "New Turkish Lira", numberDecimals = 2, defaultLocale = Some("tr"), symbols = Some(CurrencySymbols(primary = "TRY", narrow = Some("₺"))))
  val Nzd = Currency(iso42173 = "NZD", name = "New Zealand Dollar", numberDecimals = 2, defaultLocale = Some("en-CK"), symbols = Some(CurrencySymbols(primary = "NZ$", narrow = Some("$"))))
  val Nio = Currency(iso42173 = "NIO", name = "Nicaragua Cordoba Oro", numberDecimals = 2, defaultLocale = Some("es-NI"), symbols = Some(CurrencySymbols(primary = "NIO", narrow = Some("C$"))))
  val Ngn = Currency(iso42173 = "NGN", name = "Nigerian Naira", numberDecimals = 2, defaultLocale = Some("en-NG"), symbols = Some(CurrencySymbols(primary = "NGN", narrow = Some("₦"))))
  val Nok = Currency(iso42173 = "NOK", name = "Norwegian Krone", numberDecimals = 2, defaultLocale = Some("nb-NO"), symbols = Some(CurrencySymbols(primary = "NOK", narrow = Some("kr"))))
  val Pkr = Currency(iso42173 = "PKR", name = "Pakistan Rupee", numberDecimals = 2, defaultLocale = Some("en-PK"), symbols = Some(CurrencySymbols(primary = "PKR", narrow = Some("Rs"))))
  val Pab = Currency(iso42173 = "PAB", name = "Panamanian Balboa", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "PAB", narrow = None)))
  val Pyg = Currency(iso42173 = "PYG", name = "Paraguay Guarani", numberDecimals = 0, defaultLocale = Some("es-PY"), symbols = Some(CurrencySymbols(primary = "PYG", narrow = Some("₲"))))
  val Pen = Currency(iso42173 = "PEN", name = "Peruvian Nuevo Sol", numberDecimals = 2, defaultLocale = Some("es-PE"), symbols = Some(CurrencySymbols(primary = "PEN", narrow = None)))
  val Uyu = Currency(iso42173 = "UYU", name = "Peso Uruguayo", numberDecimals = 2, defaultLocale = Some("es-UY"), symbols = Some(CurrencySymbols(primary = "UYU", narrow = Some("$"))))
  val Php = Currency(iso42173 = "PHP", name = "Philippine Peso", numberDecimals = 2, defaultLocale = Some("en-PH"), symbols = Some(CurrencySymbols(primary = "PHP", narrow = Some("₱"))))
  val Gbp = Currency(iso42173 = "GBP", name = "Pound Sterling", numberDecimals = 2, defaultLocale = Some("en-GB"), symbols = Some(CurrencySymbols(primary = "£", narrow = Some("£"))))
  val Qar = Currency(iso42173 = "QAR", name = "Qatari Rial", numberDecimals = 2, defaultLocale = Some("ar-QA"), symbols = Some(CurrencySymbols(primary = "QAR", narrow = None)))
  val Omr = Currency(iso42173 = "OMR", name = "Rial Omani", numberDecimals = 3, defaultLocale = Some("ar-OM"), symbols = Some(CurrencySymbols(primary = "OMR", narrow = None)))
  val Rub = Currency(iso42173 = "RUB", name = "Russian Ruble", numberDecimals = 0, defaultLocale = Some("ru"), symbols = Some(CurrencySymbols(primary = "RUB", narrow = Some("₽"))))
  val Rwf = Currency(iso42173 = "RWF", name = "Rwanda Franc", numberDecimals = 0, defaultLocale = Some("en-RW"), symbols = Some(CurrencySymbols(primary = "RWF", narrow = Some("RF"))))
  val Wst = Currency(iso42173 = "WST", name = "Samoan Tala", numberDecimals = 2, defaultLocale = Some("en-WS"), symbols = Some(CurrencySymbols(primary = "WST", narrow = None)))
  val Std = Currency(iso42173 = "STD", name = "Sao Tome & Principe Dobra", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "STD", narrow = None)))
  val Sar = Currency(iso42173 = "SAR", name = "Saudi Riyal", numberDecimals = 2, defaultLocale = Some("ar-SA"), symbols = Some(CurrencySymbols(primary = "SAR", narrow = None)))
  val Rsd = Currency(iso42173 = "RSD", name = "Serbian Dinar", numberDecimals = 2, defaultLocale = Some("sr-RS"), symbols = Some(CurrencySymbols(primary = "RSD", narrow = None)))
  val Scr = Currency(iso42173 = "SCR", name = "Seychelles Rupee", numberDecimals = 2, defaultLocale = Some("en-SC"), symbols = Some(CurrencySymbols(primary = "SCR", narrow = None)))
  val Sll = Currency(iso42173 = "SLL", name = "Sierra Leone", numberDecimals = 2, defaultLocale = Some("en-SL"), symbols = Some(CurrencySymbols(primary = "SLL", narrow = None)))
  val Sgd = Currency(iso42173 = "SGD", name = "Singapore Dollar", numberDecimals = 2, defaultLocale = Some("zh-SG"), symbols = Some(CurrencySymbols(primary = "SGD", narrow = Some("$"))))
  val Sbd = Currency(iso42173 = "SBD", name = "Solomon Island Dollar", numberDecimals = 2, defaultLocale = Some("en-SB"), symbols = Some(CurrencySymbols(primary = "SBD", narrow = Some("$"))))
  val Sos = Currency(iso42173 = "SOS", name = "Somalia Shilling", numberDecimals = 2, defaultLocale = Some("ar-SO"), symbols = Some(CurrencySymbols(primary = "SOS", narrow = None)))
  val Tjs = Currency(iso42173 = "TJS", name = "Somoni", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "TJS", narrow = None)))
  val Zar = Currency(iso42173 = "ZAR", name = "South African Rand", numberDecimals = 2, defaultLocale = Some("en-LS"), symbols = Some(CurrencySymbols(primary = "ZAR", narrow = Some("R"))))
  val Krw = Currency(iso42173 = "KRW", name = "South-Korean Won", numberDecimals = 0, defaultLocale = Some("ko-KR"), symbols = Some(CurrencySymbols(primary = "₩", narrow = Some("₩"))))
  val Lkr = Currency(iso42173 = "LKR", name = "Sri Lanka Rupee", numberDecimals = 2, defaultLocale = Some("ta-LK"), symbols = Some(CurrencySymbols(primary = "LKR", narrow = Some("Rs"))))
  val Shp = Currency(iso42173 = "SHP", name = "St. Helena Pound", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "SHP", narrow = Some("£"))))
  val Srd = Currency(iso42173 = "SRD", name = "Surinam Dollar", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "SRD", narrow = Some("$"))))
  val Szl = Currency(iso42173 = "SZL", name = "Swaziland Lilangeni", numberDecimals = 2, defaultLocale = Some("en-SZ"), symbols = Some(CurrencySymbols(primary = "SZL", narrow = None)))
  val Sek = Currency(iso42173 = "SEK", name = "Swedish Krone", numberDecimals = 2, defaultLocale = Some("sv-SE"), symbols = Some(CurrencySymbols(primary = "SEK", narrow = Some("kr"))))
  val Chf = Currency(iso42173 = "CHF", name = "Swiss Franc", numberDecimals = 2, defaultLocale = Some("fr-CH"), symbols = Some(CurrencySymbols(primary = "CHF", narrow = None)))
  val Tzs = Currency(iso42173 = "TZS", name = "Tanzanian Shilling", numberDecimals = 2, defaultLocale = Some("en-TZ"), symbols = Some(CurrencySymbols(primary = "TZS", narrow = None)))
  val Thb = Currency(iso42173 = "THB", name = "Thai Baht", numberDecimals = 2, defaultLocale = Some("th"), symbols = Some(CurrencySymbols(primary = "THB", narrow = Some("฿"))))
  val Top = Currency(iso42173 = "TOP", name = "Tonga Pa'anga", numberDecimals = 2, defaultLocale = Some("en-TO"), symbols = Some(CurrencySymbols(primary = "TOP", narrow = Some("T$"))))
  val Ttd = Currency(iso42173 = "TTD", name = "Trinidad & Tobago Dollar", numberDecimals = 2, defaultLocale = Some("en-TT"), symbols = Some(CurrencySymbols(primary = "TTD", narrow = Some("$"))))
  val Tnd = Currency(iso42173 = "TND", name = "Tunisian Dinar", numberDecimals = 3, defaultLocale = Some("ar-TN"), symbols = Some(CurrencySymbols(primary = "TND", narrow = None)))
  val Tmt = Currency(iso42173 = "TMT", name = "Turkmenistan New Manat", numberDecimals = 2, defaultLocale = None, symbols = Some(CurrencySymbols(primary = "TMT", narrow = None)))
  val Aed = Currency(iso42173 = "AED", name = "UAE Dirham", numberDecimals = 2, defaultLocale = Some("ar-AE"), symbols = Some(CurrencySymbols(primary = "AED", narrow = None)))
  val Ugx = Currency(iso42173 = "UGX", name = "Uganda Shilling", numberDecimals = 0, defaultLocale = Some("en-UG"), symbols = Some(CurrencySymbols(primary = "UGX", narrow = None)))
  val Uah = Currency(iso42173 = "UAH", name = "Ukraine Hryvnia", numberDecimals = 2, defaultLocale = Some("uk-UA"), symbols = Some(CurrencySymbols(primary = "UAH", narrow = Some("₴"))))
  val Usd = Currency(iso42173 = "USD", name = "US Dollars", numberDecimals = 2, defaultLocale = Some("en-US"), symbols = Some(CurrencySymbols(primary = "US$", narrow = Some("$"))))
  val Uzs = Currency(iso42173 = "UZS", name = "Uzbekistani Som", numberDecimals = 2, defaultLocale = Some("uz"), symbols = Some(CurrencySymbols(primary = "UZS", narrow = None)))
  val Vuv = Currency(iso42173 = "VUV", name = "Vanuatu Vatu", numberDecimals = 0, defaultLocale = Some("en-VU"), symbols = Some(CurrencySymbols(primary = "VUV", narrow = None)))
  val Vef = Currency(iso42173 = "VEF", name = "Venezuelan Bolívar", numberDecimals = 2, defaultLocale = Some("es-VE"), symbols = Some(CurrencySymbols(primary = "VEF", narrow = Some("Bs"))))
  val Vnd = Currency(iso42173 = "VND", name = "Vietnamese New Dong", numberDecimals = 0, defaultLocale = Some("vi-VN"), symbols = Some(CurrencySymbols(primary = "₫", narrow = Some("₫"))))
  val Yer = Currency(iso42173 = "YER", name = "Yemeni Rial", numberDecimals = 2, defaultLocale = Some("ar-YE"), symbols = Some(CurrencySymbols(primary = "YER", narrow = None)))
  val Cny = Currency(iso42173 = "CNY", name = "Yuan Renminbi", numberDecimals = 2, defaultLocale = Some("zh-CN"), symbols = Some(CurrencySymbols(primary = "CN¥", narrow = Some("¥"))))
  val Zmw = Currency(iso42173 = "ZMW", name = "Zambia Kwacha", numberDecimals = 2, defaultLocale = Some("en-ZM"), symbols = Some(CurrencySymbols(primary = "ZMW", narrow = Some("ZK"))))

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
    Mmk,
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
    Aoa,
    Kgs,
    Lak,
    Lvl,
    Lbp,
    Lyd,
    Ltl,
    Mop,
    Mga,
    Mwk,
    Myr,
    Mvr,
    Mro,
    Mur,
    Mxn,
    Mdl,
    Mnt,
    Mad,
    Mzn,
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
    Tjs,
    Zar,
    Krw,
    Lkr,
    Shp,
    Srd,
    Szl,
    Sek,
    Chf,
    Tzs,
    Thb,
    Top,
    Ttd,
    Tnd,
    Tmt,
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

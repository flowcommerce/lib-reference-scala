package io.flow.reference.data

import io.flow.reference.v0.models.Province

object Provinces {

  val AusAct: Province = Province(
    id = "AUS-ACT",
    iso31662 = "ACT",
    name = "Australian Capital Territory",
    country = "AUS",
    provinceType = io.flow.reference.v0.models.ProvinceType("territory"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Australian Capital Territory",
        ),
      ),
    ),
  )
  val AusNsw: Province = Province(
    id = "AUS-NSW",
    iso31662 = "NSW",
    name = "New South Wales",
    country = "AUS",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "New South Wales",
        ),
      ),
    ),
  )
  val AusNt: Province = Province(
    id = "AUS-NT",
    iso31662 = "NT",
    name = "Northern Territory",
    country = "AUS",
    provinceType = io.flow.reference.v0.models.ProvinceType("territory"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Northern Territory",
        ),
      ),
    ),
  )
  val AusQld: Province = Province(
    id = "AUS-QLD",
    iso31662 = "QLD",
    name = "Queensland",
    country = "AUS",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Queensland",
        ),
      ),
    ),
  )
  val AusSa: Province = Province(
    id = "AUS-SA",
    iso31662 = "SA",
    name = "South Australia",
    country = "AUS",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "South Australia",
        ),
      ),
    ),
  )
  val AusTas: Province = Province(
    id = "AUS-TAS",
    iso31662 = "TAS",
    name = "Tasmania",
    country = "AUS",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Tasmania",
        ),
      ),
    ),
  )
  val AusVic: Province = Province(
    id = "AUS-VIC",
    iso31662 = "VIC",
    name = "Victoria",
    country = "AUS",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Victoria",
        ),
      ),
    ),
  )
  val AusWa: Province = Province(
    id = "AUS-WA",
    iso31662 = "WA",
    name = "Western Australia",
    country = "AUS",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Western Australia",
        ),
      ),
    ),
  )
  val CanAb: Province = Province(
    id = "CAN-AB",
    iso31662 = "AB",
    name = "Alberta",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Alberta",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Alberta",
        ),
      ),
    ),
  )
  val CanBc: Province = Province(
    id = "CAN-BC",
    iso31662 = "BC",
    name = "British Columbia",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "British Columbia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Colombie-Britannique",
        ),
      ),
    ),
  )
  val CanMb: Province = Province(
    id = "CAN-MB",
    iso31662 = "MB",
    name = "Manitoba",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Manitoba",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Manitoba",
        ),
      ),
    ),
  )
  val CanNb: Province = Province(
    id = "CAN-NB",
    iso31662 = "NB",
    name = "New Brunswick",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "New Brunswick",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Nouveau-Brunswick",
        ),
      ),
    ),
  )
  val CanNl: Province = Province(
    id = "CAN-NL",
    iso31662 = "NL",
    name = "Newfoundland and Labrador",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Newfoundland and Labrador",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Terre-Neuve-et-Labrador",
        ),
      ),
    ),
  )
  val CanNs: Province = Province(
    id = "CAN-NS",
    iso31662 = "NS",
    name = "Nova Scotia",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Nova Scotia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Nouvelle-Écosse",
        ),
      ),
    ),
  )
  val CanNt: Province = Province(
    id = "CAN-NT",
    iso31662 = "NT",
    name = "Northwest Territories",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("territory"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Northwest Territories",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Territoires du Nord-Ouest",
        ),
      ),
    ),
  )
  val CanNu: Province = Province(
    id = "CAN-NU",
    iso31662 = "NU",
    name = "Nunavut",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("territory"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Nunavut",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Nunavut",
        ),
      ),
    ),
  )
  val CanOn: Province = Province(
    id = "CAN-ON",
    iso31662 = "ON",
    name = "Ontario",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Ontario",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Ontario",
        ),
      ),
    ),
  )
  val CanPe: Province = Province(
    id = "CAN-PE",
    iso31662 = "PE",
    name = "Prince Edward Island",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Prince Edward Island",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Île-du-Prince-Édouard",
        ),
      ),
    ),
  )
  val CanQc: Province = Province(
    id = "CAN-QC",
    iso31662 = "QC",
    name = "Quebec",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Quebec",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Québec",
        ),
      ),
    ),
  )
  val CanSk: Province = Province(
    id = "CAN-SK",
    iso31662 = "SK",
    name = "Saskatchewan",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Saskatchewan",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Saskatchewan",
        ),
      ),
    ),
  )
  val CanYt: Province = Province(
    id = "CAN-YT",
    iso31662 = "YT",
    name = "Yukon",
    country = "CAN",
    provinceType = io.flow.reference.v0.models.ProvinceType("territory"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Yukon",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "fr-CA",
            name = "French - Canada",
            country = "CAN",
            language = "fr",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = " "),
          ),
          name = "Yukon",
        ),
      ),
    ),
  )
  val Chn11: Province = Province(
    id = "CHN-11",
    iso31662 = "11",
    name = "Beijing",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("municipality"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Beijing",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "北京市",
        ),
      ),
    ),
  )
  val Chn12: Province = Province(
    id = "CHN-12",
    iso31662 = "12",
    name = "Tianjin",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("municipality"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Tianjin",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "天津市",
        ),
      ),
    ),
  )
  val Chn13: Province = Province(
    id = "CHN-13",
    iso31662 = "13",
    name = "Hebei",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Hebei",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "河北省",
        ),
      ),
    ),
  )
  val Chn14: Province = Province(
    id = "CHN-14",
    iso31662 = "14",
    name = "Shanxi",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Shanxi",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "山西省",
        ),
      ),
    ),
  )
  val Chn15: Province = Province(
    id = "CHN-15",
    iso31662 = "15",
    name = "Nei Mongol",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Inner Mongolia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "内蒙古自治区",
        ),
      ),
    ),
  )
  val Chn21: Province = Province(
    id = "CHN-21",
    iso31662 = "21",
    name = "Liaoning",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Liaoning",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "辽宁省",
        ),
      ),
    ),
  )
  val Chn22: Province = Province(
    id = "CHN-22",
    iso31662 = "22",
    name = "Jilin",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Jilin",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "吉林省",
        ),
      ),
    ),
  )
  val Chn23: Province = Province(
    id = "CHN-23",
    iso31662 = "23",
    name = "Heilongjiang",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Heilongjiang",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "黑龙江省",
        ),
      ),
    ),
  )
  val Chn31: Province = Province(
    id = "CHN-31",
    iso31662 = "31",
    name = "Shanghai",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("municipality"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Shanghai",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "上海市",
        ),
      ),
    ),
  )
  val Chn32: Province = Province(
    id = "CHN-32",
    iso31662 = "32",
    name = "Jiangsu",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Jiangsu",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "江苏省",
        ),
      ),
    ),
  )
  val Chn33: Province = Province(
    id = "CHN-33",
    iso31662 = "33",
    name = "Zhejiang",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Zhejiang",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "浙江省",
        ),
      ),
    ),
  )
  val Chn34: Province = Province(
    id = "CHN-34",
    iso31662 = "34",
    name = "Anhui",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Anhui",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "安徽省",
        ),
      ),
    ),
  )
  val Chn35: Province = Province(
    id = "CHN-35",
    iso31662 = "35",
    name = "Fujian",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Fujian",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "福建省",
        ),
      ),
    ),
  )
  val Chn36: Province = Province(
    id = "CHN-36",
    iso31662 = "36",
    name = "Jiangxi",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Jiangxi",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "江西省",
        ),
      ),
    ),
  )
  val Chn37: Province = Province(
    id = "CHN-37",
    iso31662 = "37",
    name = "Shandong",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Shandong",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "山东省",
        ),
      ),
    ),
  )
  val Chn41: Province = Province(
    id = "CHN-41",
    iso31662 = "41",
    name = "Henan",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Henan",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "河南省",
        ),
      ),
    ),
  )
  val Chn42: Province = Province(
    id = "CHN-42",
    iso31662 = "42",
    name = "Hubei",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Hubei",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "湖北省",
        ),
      ),
    ),
  )
  val Chn43: Province = Province(
    id = "CHN-43",
    iso31662 = "43",
    name = "Hunan",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Hunan",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "湖南省",
        ),
      ),
    ),
  )
  val Chn44: Province = Province(
    id = "CHN-44",
    iso31662 = "44",
    name = "Guangdong",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Guangdong",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "广东省",
        ),
      ),
    ),
  )
  val Chn45: Province = Province(
    id = "CHN-45",
    iso31662 = "45",
    name = "Guangxi",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Guangxi",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "广西壮族自治区",
        ),
      ),
    ),
  )
  val Chn46: Province = Province(
    id = "CHN-46",
    iso31662 = "46",
    name = "Hainan",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Hainan",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "海南省",
        ),
      ),
    ),
  )
  val Chn50: Province = Province(
    id = "CHN-50",
    iso31662 = "50",
    name = "Chongqing",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("municipality"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Chongqing",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "重庆市",
        ),
      ),
    ),
  )
  val Chn51: Province = Province(
    id = "CHN-51",
    iso31662 = "51",
    name = "Sichuan",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Sichuan",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "四川省",
        ),
      ),
    ),
  )
  val Chn52: Province = Province(
    id = "CHN-52",
    iso31662 = "52",
    name = "Guizhou",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Guizhou",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "贵州省",
        ),
      ),
    ),
  )
  val Chn53: Province = Province(
    id = "CHN-53",
    iso31662 = "53",
    name = "Yunnan",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Yunnan",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "云南省",
        ),
      ),
    ),
  )
  val Chn54: Province = Province(
    id = "CHN-54",
    iso31662 = "54",
    name = "Xizang",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Tibet",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "西藏",
        ),
      ),
    ),
  )
  val Chn61: Province = Province(
    id = "CHN-61",
    iso31662 = "61",
    name = "Shaanxi",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Shaanxi",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "陕西省",
        ),
      ),
    ),
  )
  val Chn62: Province = Province(
    id = "CHN-62",
    iso31662 = "62",
    name = "Gansu",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Gansu",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "甘肃省",
        ),
      ),
    ),
  )
  val Chn63: Province = Province(
    id = "CHN-63",
    iso31662 = "63",
    name = "Qinghai",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Qinghai",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "青海省",
        ),
      ),
    ),
  )
  val Chn64: Province = Province(
    id = "CHN-64",
    iso31662 = "64",
    name = "Ningxia",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Ningxia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "宁夏回族自治区",
        ),
      ),
    ),
  )
  val Chn65: Province = Province(
    id = "CHN-65",
    iso31662 = "65",
    name = "Xinjiang",
    country = "CHN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Xinjiang",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "zh-CN",
            name = "Chinese - China",
            country = "CHN",
            language = "zh",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "新疆维吾尔自治区",
        ),
      ),
    ),
  )
  val EspA: Province = Province(
    id = "ESP-A",
    iso31662 = "A",
    name = "Alicante",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Alicante",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Alicante",
        ),
      ),
    ),
  )
  val EspAb: Province = Province(
    id = "ESP-AB",
    iso31662 = "AB",
    name = "Albacete",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Albacete",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Albacete",
        ),
      ),
    ),
  )
  val EspAl: Province = Province(
    id = "ESP-AL",
    iso31662 = "AL",
    name = "Almería",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Almeria",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Almería",
        ),
      ),
    ),
  )
  val EspAv: Province = Province(
    id = "ESP-AV",
    iso31662 = "AV",
    name = "Ávila",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Avila",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Ávila",
        ),
      ),
    ),
  )
  val EspB: Province = Province(
    id = "ESP-B",
    iso31662 = "B",
    name = "Barcelona",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Barcelona",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Barcelona",
        ),
      ),
    ),
  )
  val EspBa: Province = Province(
    id = "ESP-BA",
    iso31662 = "BA",
    name = "Badajoz",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Badajoz",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Badajoz",
        ),
      ),
    ),
  )
  val EspBi: Province = Province(
    id = "ESP-BI",
    iso31662 = "BI",
    name = "Biskaia",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Biskaia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Biskaia",
        ),
      ),
    ),
  )
  val EspBu: Province = Province(
    id = "ESP-BU",
    iso31662 = "BU",
    name = "Burgos",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Burgos",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Burgos",
        ),
      ),
    ),
  )
  val EspC: Province = Province(
    id = "ESP-C",
    iso31662 = "C",
    name = "A Coruña",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "A Coruña",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "A Coruña",
        ),
      ),
    ),
  )
  val EspCa: Province = Province(
    id = "ESP-CA",
    iso31662 = "CA",
    name = "Cádiz",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Cadiz",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Cádiz",
        ),
      ),
    ),
  )
  val EspCc: Province = Province(
    id = "ESP-CC",
    iso31662 = "CC",
    name = "Cáceres",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Caceres",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Cáceres",
        ),
      ),
    ),
  )
  val EspCe: Province = Province(
    id = "ESP-CE",
    iso31662 = "CE",
    name = "Ceuta",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Ceuta",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Ceuta",
        ),
      ),
    ),
  )
  val EspCi: Province = Province(
    id = "ESP-CI",
    iso31662 = "CI",
    name = "Canary Islands",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Canary Islands",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Canary Islands",
        ),
      ),
    ),
  )
  val EspCo: Province = Province(
    id = "ESP-CO",
    iso31662 = "CO",
    name = "Córdoba",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Cordoba",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Córdoba",
        ),
      ),
    ),
  )
  val EspCr: Province = Province(
    id = "ESP-CR",
    iso31662 = "CR",
    name = "Ciudad Real",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Ciudad Real",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Ciudad Real",
        ),
      ),
    ),
  )
  val EspCs: Province = Province(
    id = "ESP-CS",
    iso31662 = "CS",
    name = "Castellón",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Castellon",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Castellón",
        ),
      ),
    ),
  )
  val EspCu: Province = Province(
    id = "ESP-CU",
    iso31662 = "CU",
    name = "Cuenca",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Cuenca",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Cuenca",
        ),
      ),
    ),
  )
  val EspGc: Province = Province(
    id = "ESP-GC",
    iso31662 = "GC",
    name = "Las Palmas",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Las Palmas",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Las Palmas",
        ),
      ),
    ),
  )
  val EspGi: Province = Province(
    id = "ESP-GI",
    iso31662 = "GI",
    name = "Girona",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Girona",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Girona",
        ),
      ),
    ),
  )
  val EspGr: Province = Province(
    id = "ESP-GR",
    iso31662 = "GR",
    name = "Granada",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Granada",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Granada",
        ),
      ),
    ),
  )
  val EspGu: Province = Province(
    id = "ESP-GU",
    iso31662 = "GU",
    name = "Guadalajara",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Guadalajara",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Guadalajara",
        ),
      ),
    ),
  )
  val EspH: Province = Province(
    id = "ESP-H",
    iso31662 = "H",
    name = "Huelva",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Huelva",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Huelva",
        ),
      ),
    ),
  )
  val EspHu: Province = Province(
    id = "ESP-HU",
    iso31662 = "HU",
    name = "Huesca",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Huesca",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Huesca",
        ),
      ),
    ),
  )
  val EspJ: Province = Province(
    id = "ESP-J",
    iso31662 = "J",
    name = "Jaén",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Jaen",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Jaén",
        ),
      ),
    ),
  )
  val EspL: Province = Province(
    id = "ESP-L",
    iso31662 = "L",
    name = "Lleida",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Lleida",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Lleida",
        ),
      ),
    ),
  )
  val EspLe: Province = Province(
    id = "ESP-LE",
    iso31662 = "LE",
    name = "León",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Leon",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "León",
        ),
      ),
    ),
  )
  val EspLo: Province = Province(
    id = "ESP-LO",
    iso31662 = "LO",
    name = "La Rioja",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "La Rioja",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "La Rioja",
        ),
      ),
    ),
  )
  val EspLu: Province = Province(
    id = "ESP-LU",
    iso31662 = "LU",
    name = "Lugo",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Lugo",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Lugo",
        ),
      ),
    ),
  )
  val EspM: Province = Province(
    id = "ESP-M",
    iso31662 = "M",
    name = "Madrid",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Madrid",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Madrid",
        ),
      ),
    ),
  )
  val EspMa: Province = Province(
    id = "ESP-MA",
    iso31662 = "MA",
    name = "Málaga",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Malaga",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Málaga",
        ),
      ),
    ),
  )
  val EspMl: Province = Province(
    id = "ESP-ML",
    iso31662 = "ML",
    name = "Melilla",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Melilla",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Melilla",
        ),
      ),
    ),
  )
  val EspMu: Province = Province(
    id = "ESP-MU",
    iso31662 = "MU",
    name = "Murcia",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Murcia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Murcia",
        ),
      ),
    ),
  )
  val EspNa: Province = Province(
    id = "ESP-NA",
    iso31662 = "NA",
    name = "Navarra",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Navarra",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Navarra",
        ),
      ),
    ),
  )
  val EspO: Province = Province(
    id = "ESP-O",
    iso31662 = "O",
    name = "Asturias",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Asturias",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Asturias",
        ),
      ),
    ),
  )
  val EspOr: Province = Province(
    id = "ESP-OR",
    iso31662 = "OR",
    name = "Ourense",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Ourense",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Ourense",
        ),
      ),
    ),
  )
  val EspP: Province = Province(
    id = "ESP-P",
    iso31662 = "P",
    name = "Palencia",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Palencia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Palencia",
        ),
      ),
    ),
  )
  val EspPm: Province = Province(
    id = "ESP-PM",
    iso31662 = "PM",
    name = "Balears",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Balears",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Balears",
        ),
      ),
    ),
  )
  val EspPo: Province = Province(
    id = "ESP-PO",
    iso31662 = "PO",
    name = "Pontevedra",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Pontevedra",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Pontevedra",
        ),
      ),
    ),
  )
  val EspS: Province = Province(
    id = "ESP-S",
    iso31662 = "S",
    name = "Cantabria",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Cantabria",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Cantabria",
        ),
      ),
    ),
  )
  val EspSa: Province = Province(
    id = "ESP-SA",
    iso31662 = "SA",
    name = "Salamanca",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Salamanca",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Salamanca",
        ),
      ),
    ),
  )
  val EspSe: Province = Province(
    id = "ESP-SE",
    iso31662 = "SE",
    name = "Sevilla",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Sevilla",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Sevilla",
        ),
      ),
    ),
  )
  val EspSg: Province = Province(
    id = "ESP-SG",
    iso31662 = "SG",
    name = "Segovia",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Segovia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Segovia",
        ),
      ),
    ),
  )
  val EspSo: Province = Province(
    id = "ESP-SO",
    iso31662 = "SO",
    name = "Soria",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Soria",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Soria",
        ),
      ),
    ),
  )
  val EspSs: Province = Province(
    id = "ESP-SS",
    iso31662 = "SS",
    name = "Gipuzkoa",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Gipuzkoa",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Gipuzkoa",
        ),
      ),
    ),
  )
  val EspT: Province = Province(
    id = "ESP-T",
    iso31662 = "T",
    name = "Tarragona",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Tarragona",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Tarragona",
        ),
      ),
    ),
  )
  val EspTe: Province = Province(
    id = "ESP-TE",
    iso31662 = "TE",
    name = "Teruel",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Teruel",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Teruel",
        ),
      ),
    ),
  )
  val EspTf: Province = Province(
    id = "ESP-TF",
    iso31662 = "TF",
    name = "Santa Cruz de Tenerife",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Santa Cruz de Tenerife",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Santa Cruz de Tenerife",
        ),
      ),
    ),
  )
  val EspTo: Province = Province(
    id = "ESP-TO",
    iso31662 = "TO",
    name = "Toledo",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Toledo",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Toledo",
        ),
      ),
    ),
  )
  val EspV: Province = Province(
    id = "ESP-V",
    iso31662 = "V",
    name = "València",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Valencia",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Valencia",
        ),
      ),
    ),
  )
  val EspVa: Province = Province(
    id = "ESP-VA",
    iso31662 = "VA",
    name = "Valladolid",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Valladolid",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Valladolid",
        ),
      ),
    ),
  )
  val EspVi: Province = Province(
    id = "ESP-VI",
    iso31662 = "VI",
    name = "Álava",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Alava",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Álava",
        ),
      ),
    ),
  )
  val EspZ: Province = Province(
    id = "ESP-Z",
    iso31662 = "Z",
    name = "Zaragoza",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Zaragoza",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Zaragoza",
        ),
      ),
    ),
  )
  val EspZa: Province = Province(
    id = "ESP-ZA",
    iso31662 = "ZA",
    name = "Zamora",
    country = "ESP",
    provinceType = io.flow.reference.v0.models.ProvinceType("province"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Zamora",
        ),
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "es",
            name = "Spanish - Spain",
            country = "ESP",
            language = "es",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ",", group = "."),
          ),
          name = "Zamora",
        ),
      ),
    ),
  )
  val Jpn01: Province = Province(
    id = "JPN-01",
    iso31662 = "01",
    name = "Hokkaido",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Hokkaido",
        ),
      ),
    ),
  )
  val Jpn02: Province = Province(
    id = "JPN-02",
    iso31662 = "02",
    name = "Aomori",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn03: Province = Province(
    id = "JPN-03",
    iso31662 = "03",
    name = "Iwate",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn04: Province = Province(
    id = "JPN-04",
    iso31662 = "04",
    name = "Miyagi",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn05: Province = Province(
    id = "JPN-05",
    iso31662 = "05",
    name = "Akita",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn06: Province = Province(
    id = "JPN-06",
    iso31662 = "06",
    name = "Yamagata",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn07: Province = Province(
    id = "JPN-07",
    iso31662 = "07",
    name = "Fukushima",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Fukushima",
        ),
      ),
    ),
  )
  val Jpn08: Province = Province(
    id = "JPN-08",
    iso31662 = "08",
    name = "Ibaraki",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn09: Province = Province(
    id = "JPN-09",
    iso31662 = "09",
    name = "Tochigi",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Tochigi",
        ),
      ),
    ),
  )
  val Jpn10: Province = Province(
    id = "JPN-10",
    iso31662 = "10",
    name = "Gunma",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn11: Province = Province(
    id = "JPN-11",
    iso31662 = "11",
    name = "Saitama",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn12: Province = Province(
    id = "JPN-12",
    iso31662 = "12",
    name = "Chiba",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Chiba",
        ),
      ),
    ),
  )
  val Jpn13: Province = Province(
    id = "JPN-13",
    iso31662 = "13",
    name = "Tokyo",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Tokyo",
        ),
      ),
    ),
  )
  val Jpn14: Province = Province(
    id = "JPN-14",
    iso31662 = "14",
    name = "Kanagawa",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn15: Province = Province(
    id = "JPN-15",
    iso31662 = "15",
    name = "Niigata",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn16: Province = Province(
    id = "JPN-16",
    iso31662 = "16",
    name = "Toyama",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn17: Province = Province(
    id = "JPN-17",
    iso31662 = "17",
    name = "Ishikawa",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Ishikawa",
        ),
      ),
    ),
  )
  val Jpn18: Province = Province(
    id = "JPN-18",
    iso31662 = "18",
    name = "Fukui",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Fukui",
        ),
      ),
    ),
  )
  val Jpn19: Province = Province(
    id = "JPN-19",
    iso31662 = "19",
    name = "Yamanashi",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Yamanashi",
        ),
      ),
    ),
  )
  val Jpn20: Province = Province(
    id = "JPN-20",
    iso31662 = "20",
    name = "Nagano",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn21: Province = Province(
    id = "JPN-21",
    iso31662 = "21",
    name = "Gifu",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Gifu",
        ),
      ),
    ),
  )
  val Jpn22: Province = Province(
    id = "JPN-22",
    iso31662 = "22",
    name = "Shizuoka",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Shizuoka",
        ),
      ),
    ),
  )
  val Jpn23: Province = Province(
    id = "JPN-23",
    iso31662 = "23",
    name = "Aichi",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Aichi",
        ),
      ),
    ),
  )
  val Jpn24: Province = Province(
    id = "JPN-24",
    iso31662 = "24",
    name = "Mie",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn25: Province = Province(
    id = "JPN-25",
    iso31662 = "25",
    name = "Shiga",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Shiga",
        ),
      ),
    ),
  )
  val Jpn26: Province = Province(
    id = "JPN-26",
    iso31662 = "26",
    name = "Kyoto",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Kyoto",
        ),
      ),
    ),
  )
  val Jpn27: Province = Province(
    id = "JPN-27",
    iso31662 = "27",
    name = "Osaka",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Osaka",
        ),
      ),
    ),
  )
  val Jpn28: Province = Province(
    id = "JPN-28",
    iso31662 = "28",
    name = "Hyogo",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Hyogo",
        ),
      ),
    ),
  )
  val Jpn29: Province = Province(
    id = "JPN-29",
    iso31662 = "29",
    name = "Nara",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn30: Province = Province(
    id = "JPN-30",
    iso31662 = "30",
    name = "Wakayama",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn31: Province = Province(
    id = "JPN-31",
    iso31662 = "31",
    name = "Tottori",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn32: Province = Province(
    id = "JPN-32",
    iso31662 = "32",
    name = "Shimane",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Shimane",
        ),
      ),
    ),
  )
  val Jpn33: Province = Province(
    id = "JPN-33",
    iso31662 = "33",
    name = "Okayama",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn34: Province = Province(
    id = "JPN-34",
    iso31662 = "34",
    name = "Hiroshima",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Hiroshima",
        ),
      ),
    ),
  )
  val Jpn35: Province = Province(
    id = "JPN-35",
    iso31662 = "35",
    name = "Yamaguchi",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Yamaguchi",
        ),
      ),
    ),
  )
  val Jpn36: Province = Province(
    id = "JPN-36",
    iso31662 = "36",
    name = "Tokushima",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Tokushima",
        ),
      ),
    ),
  )
  val Jpn37: Province = Province(
    id = "JPN-37",
    iso31662 = "37",
    name = "Kagawa",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn38: Province = Province(
    id = "JPN-38",
    iso31662 = "38",
    name = "Ehime",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn39: Province = Province(
    id = "JPN-39",
    iso31662 = "39",
    name = "Kochi",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Kochi",
        ),
      ),
    ),
  )
  val Jpn40: Province = Province(
    id = "JPN-40",
    iso31662 = "40",
    name = "Fukuoka",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Fukuoka",
        ),
      ),
    ),
  )
  val Jpn41: Province = Province(
    id = "JPN-41",
    iso31662 = "41",
    name = "Saga",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn42: Province = Province(
    id = "JPN-42",
    iso31662 = "42",
    name = "Nagasaki",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn43: Province = Province(
    id = "JPN-43",
    iso31662 = "43",
    name = "Kumamoto",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn44: Province = Province(
    id = "JPN-44",
    iso31662 = "44",
    name = "Oita",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Oita",
        ),
      ),
    ),
  )
  val Jpn45: Province = Province(
    id = "JPN-45",
    iso31662 = "45",
    name = "Miyazaki",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val Jpn46: Province = Province(
    id = "JPN-46",
    iso31662 = "46",
    name = "Kagoshima",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Kagoshima",
        ),
      ),
    ),
  )
  val Jpn47: Province = Province(
    id = "JPN-47",
    iso31662 = "47",
    name = "Okinawa",
    country = "JPN",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouAb: Province = Province(
    id = "ROU-AB",
    iso31662 = "AB",
    name = "Alba",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouAg: Province = Province(
    id = "ROU-AG",
    iso31662 = "AG",
    name = "Argeș",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouAr: Province = Province(
    id = "ROU-AR",
    iso31662 = "AR",
    name = "Arad",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouB: Province = Province(
    id = "ROU-B",
    iso31662 = "B",
    name = "București",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("municipality"),
    translations = Some(Seq()),
  )
  val RouBc: Province = Province(
    id = "ROU-BC",
    iso31662 = "BC",
    name = "Bacău",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouBh: Province = Province(
    id = "ROU-BH",
    iso31662 = "BH",
    name = "Bihor",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouBn: Province = Province(
    id = "ROU-BN",
    iso31662 = "BN",
    name = "Bistrița-Năsăud",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouBr: Province = Province(
    id = "ROU-BR",
    iso31662 = "BR",
    name = "Brăila",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouBt: Province = Province(
    id = "ROU-BT",
    iso31662 = "BT",
    name = "Botoșani",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouBv: Province = Province(
    id = "ROU-BV",
    iso31662 = "BV",
    name = "Brașov",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouBz: Province = Province(
    id = "ROU-BZ",
    iso31662 = "BZ",
    name = "Buzău",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouCj: Province = Province(
    id = "ROU-CJ",
    iso31662 = "CJ",
    name = "Cluj",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouCl: Province = Province(
    id = "ROU-CL",
    iso31662 = "CL",
    name = "Călărași",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouCs: Province = Province(
    id = "ROU-CS",
    iso31662 = "CS",
    name = "Caraș-Severin",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouCt: Province = Province(
    id = "ROU-CT",
    iso31662 = "CT",
    name = "Constanța",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouCv: Province = Province(
    id = "ROU-CV",
    iso31662 = "CV",
    name = "Covasna",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouDb: Province = Province(
    id = "ROU-DB",
    iso31662 = "DB",
    name = "Dâmbovița",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouDj: Province = Province(
    id = "ROU-DJ",
    iso31662 = "DJ",
    name = "Dolj",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouGj: Province = Province(
    id = "ROU-GJ",
    iso31662 = "GJ",
    name = "Gorj",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouGl: Province = Province(
    id = "ROU-GL",
    iso31662 = "GL",
    name = "Galați",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouGr: Province = Province(
    id = "ROU-GR",
    iso31662 = "GR",
    name = "Giurgiu",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouHd: Province = Province(
    id = "ROU-HD",
    iso31662 = "HD",
    name = "Hunedoara",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouHr: Province = Province(
    id = "ROU-HR",
    iso31662 = "HR",
    name = "Harghita",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouIf: Province = Province(
    id = "ROU-IF",
    iso31662 = "IF",
    name = "Ilfov",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouIl: Province = Province(
    id = "ROU-IL",
    iso31662 = "IL",
    name = "Ialomița",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouIs: Province = Province(
    id = "ROU-IS",
    iso31662 = "IS",
    name = "Iași",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouMh: Province = Province(
    id = "ROU-MH",
    iso31662 = "MH",
    name = "Mehedinți",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouMm: Province = Province(
    id = "ROU-MM",
    iso31662 = "MM",
    name = "Maramureș",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouMs: Province = Province(
    id = "ROU-MS",
    iso31662 = "MS",
    name = "Mureș",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouNt: Province = Province(
    id = "ROU-NT",
    iso31662 = "NT",
    name = "Neamț",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouOt: Province = Province(
    id = "ROU-OT",
    iso31662 = "OT",
    name = "Olt",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouPh: Province = Province(
    id = "ROU-PH",
    iso31662 = "PH",
    name = "Prahova",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouSb: Province = Province(
    id = "ROU-SB",
    iso31662 = "SB",
    name = "Sibiu",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouSj: Province = Province(
    id = "ROU-SJ",
    iso31662 = "SJ",
    name = "Sălaj",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouSm: Province = Province(
    id = "ROU-SM",
    iso31662 = "SM",
    name = "Satu Mare",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouSv: Province = Province(
    id = "ROU-SV",
    iso31662 = "SV",
    name = "Suceava",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouTl: Province = Province(
    id = "ROU-TL",
    iso31662 = "TL",
    name = "Tulcea",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouTm: Province = Province(
    id = "ROU-TM",
    iso31662 = "TM",
    name = "Timiș",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouTr: Province = Province(
    id = "ROU-TR",
    iso31662 = "TR",
    name = "Teleorman",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouVl: Province = Province(
    id = "ROU-VL",
    iso31662 = "VL",
    name = "Vâlcea",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouVn: Province = Province(
    id = "ROU-VN",
    iso31662 = "VN",
    name = "Vrancea",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val RouVs: Province = Province(
    id = "ROU-VS",
    iso31662 = "VS",
    name = "Vaslui",
    country = "ROU",
    provinceType = io.flow.reference.v0.models.ProvinceType("other"),
    translations = Some(Seq()),
  )
  val UsaAk: Province = Province(
    id = "USA-AK",
    iso31662 = "AK",
    name = "Alaska",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Alaska",
        ),
      ),
    ),
  )
  val UsaAl: Province = Province(
    id = "USA-AL",
    iso31662 = "AL",
    name = "Alabama",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Alabama",
        ),
      ),
    ),
  )
  val UsaAr: Province = Province(
    id = "USA-AR",
    iso31662 = "AR",
    name = "Arkansas",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Arkansas",
        ),
      ),
    ),
  )
  val UsaAz: Province = Province(
    id = "USA-AZ",
    iso31662 = "AZ",
    name = "Arizona",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Arizona",
        ),
      ),
    ),
  )
  val UsaCa: Province = Province(
    id = "USA-CA",
    iso31662 = "CA",
    name = "California",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "California",
        ),
      ),
    ),
  )
  val UsaCo: Province = Province(
    id = "USA-CO",
    iso31662 = "CO",
    name = "Colorado",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Colorado",
        ),
      ),
    ),
  )
  val UsaCt: Province = Province(
    id = "USA-CT",
    iso31662 = "CT",
    name = "Connecticut",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Connecticut",
        ),
      ),
    ),
  )
  val UsaDc: Province = Province(
    id = "USA-DC",
    iso31662 = "DC",
    name = "District of Columbia",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("district"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Washington DC",
        ),
      ),
    ),
  )
  val UsaDe: Province = Province(
    id = "USA-DE",
    iso31662 = "DE",
    name = "Delaware",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Delaware",
        ),
      ),
    ),
  )
  val UsaFl: Province = Province(
    id = "USA-FL",
    iso31662 = "FL",
    name = "Florida",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Florida",
        ),
      ),
    ),
  )
  val UsaGa: Province = Province(
    id = "USA-GA",
    iso31662 = "GA",
    name = "Georgia",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Georgia",
        ),
      ),
    ),
  )
  val UsaHi: Province = Province(
    id = "USA-HI",
    iso31662 = "HI",
    name = "Hawaii",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Hawaii",
        ),
      ),
    ),
  )
  val UsaIa: Province = Province(
    id = "USA-IA",
    iso31662 = "IA",
    name = "Iowa",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Iowa",
        ),
      ),
    ),
  )
  val UsaId: Province = Province(
    id = "USA-ID",
    iso31662 = "ID",
    name = "Idaho",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Idaho",
        ),
      ),
    ),
  )
  val UsaIl: Province = Province(
    id = "USA-IL",
    iso31662 = "IL",
    name = "Illinois",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Illinois",
        ),
      ),
    ),
  )
  val UsaIn: Province = Province(
    id = "USA-IN",
    iso31662 = "IN",
    name = "Indiana",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Indiana",
        ),
      ),
    ),
  )
  val UsaKs: Province = Province(
    id = "USA-KS",
    iso31662 = "KS",
    name = "Kansas",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Kansas",
        ),
      ),
    ),
  )
  val UsaKy: Province = Province(
    id = "USA-KY",
    iso31662 = "KY",
    name = "Kentucky",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Kentucky",
        ),
      ),
    ),
  )
  val UsaLa: Province = Province(
    id = "USA-LA",
    iso31662 = "LA",
    name = "Louisiana",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Louisiana",
        ),
      ),
    ),
  )
  val UsaMa: Province = Province(
    id = "USA-MA",
    iso31662 = "MA",
    name = "Massachusetts",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Massachusetts",
        ),
      ),
    ),
  )
  val UsaMd: Province = Province(
    id = "USA-MD",
    iso31662 = "MD",
    name = "Maryland",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Maryland",
        ),
      ),
    ),
  )
  val UsaMe: Province = Province(
    id = "USA-ME",
    iso31662 = "ME",
    name = "Maine",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Maine",
        ),
      ),
    ),
  )
  val UsaMi: Province = Province(
    id = "USA-MI",
    iso31662 = "MI",
    name = "Michigan",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Michigan",
        ),
      ),
    ),
  )
  val UsaMn: Province = Province(
    id = "USA-MN",
    iso31662 = "MN",
    name = "Minnesota",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Minnesota",
        ),
      ),
    ),
  )
  val UsaMo: Province = Province(
    id = "USA-MO",
    iso31662 = "MO",
    name = "Missouri",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Missouri",
        ),
      ),
    ),
  )
  val UsaMs: Province = Province(
    id = "USA-MS",
    iso31662 = "MS",
    name = "Mississippi",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Mississippi",
        ),
      ),
    ),
  )
  val UsaMt: Province = Province(
    id = "USA-MT",
    iso31662 = "MT",
    name = "Montana",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Montana",
        ),
      ),
    ),
  )
  val UsaNc: Province = Province(
    id = "USA-NC",
    iso31662 = "NC",
    name = "North Carolina",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "North Carolina",
        ),
      ),
    ),
  )
  val UsaNd: Province = Province(
    id = "USA-ND",
    iso31662 = "ND",
    name = "North Dakota",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "North Dakota",
        ),
      ),
    ),
  )
  val UsaNe: Province = Province(
    id = "USA-NE",
    iso31662 = "NE",
    name = "Nebraska",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Nebraska",
        ),
      ),
    ),
  )
  val UsaNh: Province = Province(
    id = "USA-NH",
    iso31662 = "NH",
    name = "New Hampshire",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "New Hampshire",
        ),
      ),
    ),
  )
  val UsaNj: Province = Province(
    id = "USA-NJ",
    iso31662 = "NJ",
    name = "New Jersey",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "New Jersey",
        ),
      ),
    ),
  )
  val UsaNm: Province = Province(
    id = "USA-NM",
    iso31662 = "NM",
    name = "New Mexico",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "New Mexico",
        ),
      ),
    ),
  )
  val UsaNv: Province = Province(
    id = "USA-NV",
    iso31662 = "NV",
    name = "Nevada",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Nevada",
        ),
      ),
    ),
  )
  val UsaNy: Province = Province(
    id = "USA-NY",
    iso31662 = "NY",
    name = "New York",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "New York",
        ),
      ),
    ),
  )
  val UsaOh: Province = Province(
    id = "USA-OH",
    iso31662 = "OH",
    name = "Ohio",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Ohio",
        ),
      ),
    ),
  )
  val UsaOk: Province = Province(
    id = "USA-OK",
    iso31662 = "OK",
    name = "Oklahoma",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Oklahoma",
        ),
      ),
    ),
  )
  val UsaOr: Province = Province(
    id = "USA-OR",
    iso31662 = "OR",
    name = "Oregon",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Oregon",
        ),
      ),
    ),
  )
  val UsaPa: Province = Province(
    id = "USA-PA",
    iso31662 = "PA",
    name = "Pennsylvania",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Pennsylvania",
        ),
      ),
    ),
  )
  val UsaRi: Province = Province(
    id = "USA-RI",
    iso31662 = "RI",
    name = "Rhode Island",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Rhode Island",
        ),
      ),
    ),
  )
  val UsaSc: Province = Province(
    id = "USA-SC",
    iso31662 = "SC",
    name = "South Carolina",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "South Carolina",
        ),
      ),
    ),
  )
  val UsaSd: Province = Province(
    id = "USA-SD",
    iso31662 = "SD",
    name = "South Dakota",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "South Dakota",
        ),
      ),
    ),
  )
  val UsaTn: Province = Province(
    id = "USA-TN",
    iso31662 = "TN",
    name = "Tennessee",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Tennessee",
        ),
      ),
    ),
  )
  val UsaTx: Province = Province(
    id = "USA-TX",
    iso31662 = "TX",
    name = "Texas",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Texas",
        ),
      ),
    ),
  )
  val UsaUt: Province = Province(
    id = "USA-UT",
    iso31662 = "UT",
    name = "Utah",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Utah",
        ),
      ),
    ),
  )
  val UsaVa: Province = Province(
    id = "USA-VA",
    iso31662 = "VA",
    name = "Virginia",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Virginia",
        ),
      ),
    ),
  )
  val UsaVt: Province = Province(
    id = "USA-VT",
    iso31662 = "VT",
    name = "Vermont",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Vermont",
        ),
      ),
    ),
  )
  val UsaWa: Province = Province(
    id = "USA-WA",
    iso31662 = "WA",
    name = "Washington",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Washington",
        ),
      ),
    ),
  )
  val UsaWi: Province = Province(
    id = "USA-WI",
    iso31662 = "WI",
    name = "Wisconsin",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Wisconsin",
        ),
      ),
    ),
  )
  val UsaWv: Province = Province(
    id = "USA-WV",
    iso31662 = "WV",
    name = "West Virginia",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "West Virginia",
        ),
      ),
    ),
  )
  val UsaWy: Province = Province(
    id = "USA-WY",
    iso31662 = "WY",
    name = "Wyoming",
    country = "USA",
    provinceType = io.flow.reference.v0.models.ProvinceType("state"),
    translations = Some(
      Seq(
        io.flow.reference.v0.models.LocalizedTranslation(
          locale = io.flow.reference.v0.models.Locale(
            id = "en-US",
            name = "English - United States",
            country = "USA",
            language = "en",
            numbers = io.flow.reference.v0.models.LocaleNumbers(decimal = ".", group = ","),
          ),
          name = "Wyoming",
        ),
      ),
    ),
  )

  val all: Seq[Province] = Seq(
    AusAct,
    AusNsw,
    AusNt,
    AusQld,
    AusSa,
    AusTas,
    AusVic,
    AusWa,
    CanAb,
    CanBc,
    CanMb,
    CanNb,
    CanNl,
    CanNs,
    CanNt,
    CanNu,
    CanOn,
    CanPe,
    CanQc,
    CanSk,
    CanYt,
    Chn11,
    Chn12,
    Chn13,
    Chn14,
    Chn15,
    Chn21,
    Chn22,
    Chn23,
    Chn31,
    Chn32,
    Chn33,
    Chn34,
    Chn35,
    Chn36,
    Chn37,
    Chn41,
    Chn42,
    Chn43,
    Chn44,
    Chn45,
    Chn46,
    Chn50,
    Chn51,
    Chn52,
    Chn53,
    Chn54,
    Chn61,
    Chn62,
    Chn63,
    Chn64,
    Chn65,
    EspA,
    EspAb,
    EspAl,
    EspAv,
    EspB,
    EspBa,
    EspBi,
    EspBu,
    EspC,
    EspCa,
    EspCc,
    EspCe,
    EspCi,
    EspCo,
    EspCr,
    EspCs,
    EspCu,
    EspGc,
    EspGi,
    EspGr,
    EspGu,
    EspH,
    EspHu,
    EspJ,
    EspL,
    EspLe,
    EspLo,
    EspLu,
    EspM,
    EspMa,
    EspMl,
    EspMu,
    EspNa,
    EspO,
    EspOr,
    EspP,
    EspPm,
    EspPo,
    EspS,
    EspSa,
    EspSe,
    EspSg,
    EspSo,
    EspSs,
    EspT,
    EspTe,
    EspTf,
    EspTo,
    EspV,
    EspVa,
    EspVi,
    EspZ,
    EspZa,
    Jpn01,
    Jpn02,
    Jpn03,
    Jpn04,
    Jpn05,
    Jpn06,
    Jpn07,
    Jpn08,
    Jpn09,
    Jpn10,
    Jpn11,
    Jpn12,
    Jpn13,
    Jpn14,
    Jpn15,
    Jpn16,
    Jpn17,
    Jpn18,
    Jpn19,
    Jpn20,
    Jpn21,
    Jpn22,
    Jpn23,
    Jpn24,
    Jpn25,
    Jpn26,
    Jpn27,
    Jpn28,
    Jpn29,
    Jpn30,
    Jpn31,
    Jpn32,
    Jpn33,
    Jpn34,
    Jpn35,
    Jpn36,
    Jpn37,
    Jpn38,
    Jpn39,
    Jpn40,
    Jpn41,
    Jpn42,
    Jpn43,
    Jpn44,
    Jpn45,
    Jpn46,
    Jpn47,
    RouAb,
    RouAg,
    RouAr,
    RouB,
    RouBc,
    RouBh,
    RouBn,
    RouBr,
    RouBt,
    RouBv,
    RouBz,
    RouCj,
    RouCl,
    RouCs,
    RouCt,
    RouCv,
    RouDb,
    RouDj,
    RouGj,
    RouGl,
    RouGr,
    RouHd,
    RouHr,
    RouIf,
    RouIl,
    RouIs,
    RouMh,
    RouMm,
    RouMs,
    RouNt,
    RouOt,
    RouPh,
    RouSb,
    RouSj,
    RouSm,
    RouSv,
    RouTl,
    RouTm,
    RouTr,
    RouVl,
    RouVn,
    RouVs,
    UsaAk,
    UsaAl,
    UsaAr,
    UsaAz,
    UsaCa,
    UsaCo,
    UsaCt,
    UsaDc,
    UsaDe,
    UsaFl,
    UsaGa,
    UsaHi,
    UsaIa,
    UsaId,
    UsaIl,
    UsaIn,
    UsaKs,
    UsaKy,
    UsaLa,
    UsaMa,
    UsaMd,
    UsaMe,
    UsaMi,
    UsaMn,
    UsaMo,
    UsaMs,
    UsaMt,
    UsaNc,
    UsaNd,
    UsaNe,
    UsaNh,
    UsaNj,
    UsaNm,
    UsaNv,
    UsaNy,
    UsaOh,
    UsaOk,
    UsaOr,
    UsaPa,
    UsaRi,
    UsaSc,
    UsaSd,
    UsaTn,
    UsaTx,
    UsaUt,
    UsaVa,
    UsaVt,
    UsaWa,
    UsaWi,
    UsaWv,
    UsaWy,
  )

}

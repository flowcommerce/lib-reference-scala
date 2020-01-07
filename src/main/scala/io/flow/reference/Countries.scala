package io.flow.reference

import io.flow.reference.v0.models.Country

object Countries extends Validation[Country] {

  override val cache: Map[String, Country] = Map(
    data.Countries.all.flatMap { c =>
      Seq(
        (c.iso31662.toLowerCase -> c),
        (c.iso31663.toLowerCase -> c),
        (c.name.toLowerCase -> c)
      )
    }: _*
  )

  override def singular = "country"

  override def plural = "countries"
  
  override def name(c: Country): String = c.name

  /**
    * Validation function that will turn two provided codes into either of:
    *
    *   - 1 or more errors
    *   - A tuple of two country objects
    *
    * Example:
    * 
    *    validate2("country of origin", "CHN", "destination", "AUS") match {
    *      case Left(errors) => { }
    *      case Right((origin, destination)) => { }
    *    }
    */
  def validate2(label1: String, code1: String, label2: String, code2: String): Either[Seq[String], (Country, Country)] = {
    validateN(
      Seq(
        (label1, code1),
        (label2, code2)
      )
    ) match {
      case Left(errors) => {
        Left(errors)
      }

      case Right(countries) => {
        countries.toList match {
          case a :: b :: Nil => Right(a -> b)
          case _ => sys.error(s"validateN should have returned 2 items but instead returned: ${countries.size}")
        }
      }
    }
  }

  def validateN(labelsAndCodes: Seq[(String, String)]): Either[Seq[String], Seq[Country]] = {
    val labelCountries = labelsAndCodes.map { case (label, code) => (label, code) -> Countries.find(code) }
    val notFound = labelCountries.collect { case (labelCode, countryOpt) if countryOpt.isEmpty => labelCode }

    if (notFound.nonEmpty) {
      val invalid =
        notFound
          .groupBy { case (label, _) => label }
          .map { case (label, values) => label -> values.map { case (_, code) => code } }
      val messages =
        invalid.toSeq.sortBy { case (label, _) => label }.map { case (label, codes) =>
          s"Invalid $label ${codes.mkString("'", "', '", "'")}. Must be ${if (codes.size == 1) "a " else ""}valid " +
            s"ISO 3166-2 or 3166-3 digit code. See https://api.flow.io/reference/countries"
        }
      Left(messages)
    }

    else
      Right(labelCountries.flatMap { case (_, country) => country })
  }
}

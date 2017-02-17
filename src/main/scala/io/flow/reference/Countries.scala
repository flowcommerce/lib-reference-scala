package io.flow.reference

import io.flow.reference.v0.models.Country
import scala.collection.mutable

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
          case a :: b :: Nil => Right(a, b)
          case _ => sys.error(s"validateN should have returned 2 items but instead returned: ${countries.size}")
        }
      }
    }
  }

  def validateN(labelsAndCodes: Seq[(String, String)]): Either[Seq[String], Seq[Country]] = {
    val invalid = mutable.Map[String, mutable.Set[String]]()
    val countries = mutable.ListBuffer[Country]()

    labelsAndCodes.foreach { case (label, code) =>
      Countries.find(code) match {
        case None => {
          invalid.get(label) match {
            case None => {
              val tmp = mutable.Set[String]()
              tmp += code
              invalid += (label -> tmp)
            }

            case Some(values) => {
              values += code
            }
          }
        }

        case Some(c) => {
          countries += c
        }
      }
    }

    val messages: Seq[String] = invalid.map { case (label, codes) =>
      s"Invalid $label ${codes.mkString("'", "', '", "'")}. Must be a valid ISO 3166 2 or 3 digit code. See https://api.flow.io/reference/countries"
    }.toSeq

    messages.toList match {
      case Nil => Right(countries)
      case errors => Left(errors)
    }
  }
}

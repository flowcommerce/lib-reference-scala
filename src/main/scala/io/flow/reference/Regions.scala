package io.flow.reference

import io.flow.reference.v0.models.{Country, Region}

object Regions extends Validation[Region] {
  val cache: Map[String, Region] = Map(
    data.Regions.all.map { r =>
      (r.id.toLowerCase -> r)
    }: _*
  )

  val supportedCache: Map[String, Region] = Map(
    data.Regions.supported.map { r =>
      (r.id.toLowerCase -> r)
    }: _*
  )
  def singular = "region"
  def plural = "regions"
  def name(r: Region) = r.name


  /**
    * Filters regions based on the query parameter. We filter in a few
    * different ways:
    * 
    *  - if the query string maps to a country, we find all regions that contain that country
    *  - otherwise we check if there is a region with id = q
    */
  def filter(q: String): Seq[Region] = {  
    Countries.find(q) match {
      case None => {
        find(q) match {
          case None => Nil
          case Some(r) => Seq(r)
        }
      }

      case Some(c) => {
        data.Regions.all.filter { r =>
          r.countries.contains(c.iso31663)
        }
      }
    }
  }

  /**
    * Finds the region that is mapped to exactly this country, if it
    * exists. If there is exactly one region, we have found the
    * region. This enables finding a region by, for example, the two
    * character country iso code.
    */
  def findBySingleCountry(countryQuery: String): Option[Region] = {
    Countries.find(countryQuery).flatMap { findBySingleCountry(_) }
  }

  def findBySingleCountry(country: Country): Option[Region] = {  
    data.Regions.all.filter(_.countries.size == 1).filter { r =>
      r.countries == Seq(country.iso31663)
    }.toList match {
      case one :: Nil => Some(one)
      case _ => None
    }
  }
}

package io.flow.reference

import io.flow.reference.v0.models.{Country, Province}

class BaseProvinces extends Reference[Province] {

  override val cache: Map[String, Province] = Map(
    data.Provinces.all.map { c =>
      c.id.toLowerCase -> c
    }: _*,
  )

  override def singular = "province"
  override def plural = "provinces"
  override def name(p: Province): String = p.id

  def findInCountry(country: Country, q: String): Option[Province] = {
    internalQuery(Some(q), Some(Seq(country))).headOption
  }

  def query(q: Option[String], countriesOpt: Option[Seq[String]]): Seq[Province] = {
    internalQuery(q, countriesOpt.map(_.flatMap(Countries.find)))
  }

  private[this] def internalQuery(q: Option[String], countries: Option[Seq[Country]]): Seq[Province] = {
    /*
     * If q is provided, use that to narrow down by id, name, and iso31662 code
     * Otherwise, just return everything
     */
    val found: Seq[Province] = q match {
      case None => {
        data.Provinces.all
      }
      case Some(text) => {
        val byId: Seq[Province] = Seq(find(text)).flatten

        val byNameOrIso31662: Seq[Province] = data.Provinces.all.filter { p =>
          p.name.toLowerCase == text.toLowerCase || p.iso31662.toLowerCase == text.toLowerCase
        }

        (byId ++ byNameOrIso31662).distinct
      }
    }

    /*
     * If a list of countries is passed, use that to filter the list
     */
    countries match {
      case Some(all) => found.filter { p => Countries.find(p.country).exists(all.contains(_)) }
      case None => found
    }
  }
}

object Provinces extends BaseProvinces with EitherValidation[Province]

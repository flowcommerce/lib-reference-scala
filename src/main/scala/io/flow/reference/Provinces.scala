package io.flow.reference

import io.flow.reference.v0.models.Province

object Provinces extends Validation[Province] {
  override val cache: Map[String, Province] = Map(
    data.Provinces.all.map { c =>
      c.id.toLowerCase -> c
    }: _*
  )

  override def singular = "province"
  override def plural = "provinces"
  override def name(p: Province) = p.id

  def query(q: Option[String], countriesOpt: Option[Seq[String]]): Seq[Province] = {
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
    val finalList: Seq[Province] = countriesOpt match {
      case Some(countries) => found.filter { p => countries.map(_.toLowerCase).contains(p.country.toLowerCase) }
      case None => found
    }

    finalList
  }
}

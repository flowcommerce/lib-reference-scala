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

  def filter(q: String, countriesOpt: Option[Seq[String]] = None): Seq[Province] = {
    /**
      * Find by ID, Name, or ISO 3166-2 Code
      */
    val byId: Seq[Province] = Seq(find(q)).flatten

    val byNameOrIso31662: Seq[Province] = data.Provinces.all.filter { p =>
      p.name.toLowerCase == q.toLowerCase || p.iso31662.toLowerCase == q.toLowerCase
    }

    val found: Seq[Province] = (byId ++ byNameOrIso31662).distinct

    /**
      * If a list of countries is passed, then
      * use that to further filter the list
      */
    val finalList: Seq[Province] = countriesOpt match {
      case Some(countries) => found.filter { p => countries.map(_.toLowerCase).contains(p.country.toLowerCase) }
      case None => found
    }

    finalList
  }
}

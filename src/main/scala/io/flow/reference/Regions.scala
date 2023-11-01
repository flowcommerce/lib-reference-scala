package io.flow.reference

import io.flow.reference.v0.models.Region

object Regions extends Validation[Region] {

  override val cache: Map[String, Region] = Map(
    data.Regions.all.map { r =>
      (r.id.toLowerCase -> r)
    }: _*
  )

  override def singular = "region"

  override def plural = "regions"

  override def name(r: Region): String = r.name

  /** Filters regions based on the query parameter. We filter in a few different ways:
    *
    *   - if the query string maps to a country, we find all regions that contain that country
    *   - otherwise we check if there is a region with id = q
    */
  def filter(q: String): Seq[Region] = {
    Countries.find(q) match {
      case None => {
        Seq(find(q)).flatten
      }

      case Some(c) => {
        data.Regions.all.filter { r =>
          r.countries.contains(c.iso31663)
        }
      }
    }
  }
}

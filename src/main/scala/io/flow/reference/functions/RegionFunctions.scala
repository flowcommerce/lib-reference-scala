package io.flow.reference.functions

import io.flow.reference.data
import io.flow.reference.v0.models.Region

import scala.annotation.tailrec

object RegionFunctions {

  /**
    * A Region is a logical construct that can cover just about any geography -- political, physical, economic -- and
    * is thus naturally layered.
    *
    * As such, it will occasionally be important to determine how a given region intersects with a set of regionally
    * associated rules -- such as determining which set of regulations applies when regulations might be set at
    * state, province, country and union levels.
    *
    * @param r
    */
  implicit class RegionCoverage(r: Region) {
    /**
      * Returns a Seq of all the regions that include this region (including itself).
      *
      * E.g.
      *
      * World -> World
      *
      * Europe -> Europe, World
      *
      * France -> France, Eurozone, EuropeanEconmicArea, EuropeanUnion, Europe, World
      *
      * This Seq is sorted by "locality", with the most local regions appearing first.
      */
    lazy val encompassingRegions = {
      val rs = r match {
        case data.Regions.World => Seq(r)
        case Region(_, _, countries, _, _, _, _) => {
          data.Regions.all.filter(eachRegion =>
            countries.forall(c => eachRegion.countries.contains(c))
          )
        }
      }
      rs.sortBy(_.countries.size)
    }

    /**
      * Returns a Seq of all the regions that this region includes (including itself).
      *
      * World -> (everything)
      *
      * Europe -> Europe, EuropeanEconomicArea, EuropeanUnion, (all countries in Europe)
      *
      * France -> France
      *
      * This Seq is sorted by inverse "locality", with the least local regions appearing first.
      */
    lazy val enclosedRegions = {
      val rs = r match {
        case data.Regions.World => data.Regions.all
        case Region(_, _, countries, _, _, _, _) => {
          data.Regions.all.filter(
            _.countries.forall(c => countries.contains(c))
          )
        }
      }
      rs.sortBy(_.countries.size)(Ordering.Int.reverse)
    }

    /**
      * Given a region and a function that returns an optional product to that service, returns the product that is
      * most local to the region. E.g. if a rule applies in France and a different rule applies in Europe, the French
      * rule would be returned.
      *
      * Locality is determines based on the count of countries within a Region -- e.g. Africa is more local than World
      * w/r/t Morocco. This isn't a fantastic heuristic and will likely need to be revisited in the future.
      *
      * Note that f() will be called as few times as is feasible to return a response.
      *
      * @param f
      * @tparam B
      * @return
      */
    def mostLocal[B](f: Region => Option[B]): Option[B] = collectFirstDefined(encompassingRegions.iterator, f)

    @tailrec
    private def collectFirstDefined[B](it: Iterator[Region], f: Region => Option[B]): Option[B] = {
      if (it.hasNext) {
        f(it.next()) match {
          case None => collectFirstDefined(it, f)
          case s => s
        }
      } else None
    }

    /**
      * Given a region and a function that returns an optional product to that service, returns the product that is
      * most global to the region. E.g. if a rule applies in France and a different rule applies to Europe, the European
      * rule would be returned
      *
      * Locality is determines based on the count of countries within a Region -- e.g. Africa is more local than World
      * w/r/t Morocco. This isn't a fantastic heuristic and will likely need to be revisited in the future.
      *
      * Note that f() will be called as few times as is feasible to return a response.
      *
      * @param f
      * @tparam B
      * @return
      */
    def mostGlobal[B](f: Region => Option[B]): Option[B] = collectFirstDefined(encompassingRegions.reverseIterator, f)

  }

}

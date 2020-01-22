package io.flow.reference.functions

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import RegionFunctions._
import io.flow.reference.data

class RegionCoverageSpec extends AnyFunSpec with Matchers {

  it("encompassingRegions should include a test region and any region that includes it") {
    data.Regions.France.encompassingRegions.map(_.id).sorted should be(Seq(data.Regions.France, data.Regions.EuropeanUnion, data.Regions.Eurozone, data.Regions.EuropeanEconomicArea, data.Regions.Europe, data.Regions.World).map(_.id).sorted)
    data.Regions.EuropeanUnion.encompassingRegions.map(_.id) should be(Seq(data.Regions.EuropeanUnion, data.Regions.EuropeanEconomicArea, data.Regions.Europe, data.Regions.World).map(_.id))
    data.Regions.World.encompassingRegions.map(_.id) should be(Seq(data.Regions.World.id))
  }

  it("enclosedRegions should include a test region and all regions it contains") {
    data.Regions.France.enclosedRegions should be(Seq(data.Regions.France))
    data.Regions.EuropeanUnion.enclosedRegions.head should be(data.Regions.EuropeanUnion)
    data.Regions.World.enclosedRegions.head should be(data.Regions.World)
  }

  it("mostLocal should return the most local option returned by a test function") {
    data.Regions.France.mostLocal {
      case data.Regions.France => Some("a")
      case data.Regions.EuropeanUnion => sys.error("Illegal Call")
      case data.Regions.World => sys.error("Illegal Call")
      case _ => sys.error("Illegal Call")
    } should be(Some("a"))

    data.Regions.Spain.mostLocal {
      case data.Regions.France => Some("a")
      case data.Regions.EuropeanUnion => Some("b")
      case data.Regions.World => sys.error("Illegal Call")
      case _ => None
    } should be(Some("b"))

    data.Regions.Andorra.mostLocal {
      case data.Regions.France => Some("a")
      case data.Regions.EuropeanUnion => Some("b")
      case data.Regions.World => Some("c")
      case _ => None
    } should be(Some("c"))
  }

  it("mostLocal should return none when no region is covered by a test function") {
    data.Regions.France.mostLocal(_ => None) should be(None)
  }
}

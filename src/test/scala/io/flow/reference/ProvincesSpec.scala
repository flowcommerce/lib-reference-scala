package io.flow.reference

import org.scalatest.{FunSpec, Matchers}

class ProvincesSpec extends FunSpec with Matchers {

  it("be unique") {
    data.Provinces.all.groupBy(_.id).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("be sorted") {
    data.Provinces.all.map(_.id) should be(data.Provinces.all.map(_.id).sortBy { _.toLowerCase })
  }

  it("id must be join of iso31662 and country") {
    data.Provinces.all.map(_.id) should be(data.Provinces.all.map(p => s"${p.country}-${p.iso31662}"))
  }

  it("have no blanks") {
    data.Provinces.all.find(_.id.trim.isEmpty) should be(None)
  }

  it("find") {
    Seq("USA-NY", "usa-ny", "AUS-NSW", "aus-nsw").foreach { id =>
      Provinces.find(id).getOrElse {
        sys.error(s"$id missing")
      }
    }

    Provinces.find("other") should be(None)
  }

  it("mustFind") {
    Seq("USA-NY", "usa-ny", "UsA-nY").foreach { id =>
      Provinces.mustFind(id).id should be("USA-NY")
    }

    intercept[Throwable] {
      Provinces.mustFind("other")
    }.getMessage should be("The following province is invalid: [other]. See https://api.flow.io/reference/provinces for a list of all valid provinces.")
  }

  it("filter") {
    Seq("New York", "NY").foreach { q =>
      Provinces.filter(q) should be(Seq(data.Provinces.UsaNy))
    }

    Seq("New York", "NY").foreach { q =>
      Provinces.filter(q, Some(Seq("AUS"))) should be(Nil)
    }

    Seq("New York", "NY").foreach { q =>
      Provinces.filter(q, Some(Seq("USA"))) should be(Seq(data.Provinces.UsaNy))
    }
  }

}

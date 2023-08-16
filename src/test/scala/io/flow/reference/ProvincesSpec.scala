package io.flow.reference

import io.flow.reference.data.Countries.{Can, Usa}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.immutable.Nil

class ProvincesSpec extends AnyFunSpec with Matchers {

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

  it("query") {
    Seq("New York", "NY").foreach { q =>
      Provinces.query(Some(q), None) should be(Seq(data.Provinces.UsaNy))
    }

    Seq("New York", "NY").foreach { q =>
      Provinces.query(Some(q), Some(Seq("AUS"))) should be(Nil)
    }

    Seq("New York", "NY").foreach { q =>
      Provinces.query(Some(q), Some(Seq("USA"))) should be(Seq(data.Provinces.UsaNy))
    }

    Provinces.query(None, Some(Seq("USA"))) should contain(data.Provinces.UsaNy)
  }

  it("findInCountry") {
    Provinces.findInCountry(Usa, "New York").get.id shouldBe data.Provinces.UsaNy.id
    Provinces.findInCountry(Usa, "NY").get.id shouldBe data.Provinces.UsaNy.id
    Provinces.findInCountry(Usa, "quebec") shouldBe None
    Provinces.findInCountry(Can, "quebec").get.id shouldBe data.Provinces.CanQc.id
  }

}

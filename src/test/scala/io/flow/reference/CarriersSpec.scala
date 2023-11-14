package io.flow.reference

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CarriersSpec extends AnyFunSpec with Matchers {

  it("be unique") {
    data.Carriers.all.groupBy(_.id).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("be sorted") {
    data.Carriers.all.map(_.id) should be(data.Carriers.all.map(_.id).sortBy { _.toLowerCase })
  }

  it("have no blanks") {
    data.Carriers.all.find(_.id.trim.isEmpty) should be(None)
  }

  it("find") {
    data.Carriers.all.foreach { carrier =>
      // find by name
      Carriers.find(carrier.name).getOrElse {
        sys.error(s"${carrier.name} missing")
      }

      // find by id
      Carriers.find(carrier.id).getOrElse {
        sys.error(s"${carrier.id} missing")
      }
    }

    Carriers.find("blah") should be(None)
  }

  it("mustFind") {
    data.Carriers.all.foreach { carrier =>
      // must find by name
      Carriers.mustFind(carrier.name).name.toLowerCase should be(carrier.name.trim.toLowerCase)

      // must find by id
      Carriers.mustFind(carrier.id).id.toLowerCase should be(carrier.id.trim.toLowerCase)
    }

    intercept[Throwable] {
      Carriers.mustFind("blah")
    }.getMessage should be(
      "The following carrier is invalid: [blah]. See https://api.flow.io/reference/carriers for a list of all valid carriers.",
    )
  }

}

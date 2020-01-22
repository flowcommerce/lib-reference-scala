package io.flow.reference

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CarrierServicesSpec extends AnyFunSpec with Matchers {

  it("be unique") {
    data.CarrierServices.all.groupBy(_.id).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("be sorted") {
    data.CarrierServices.all.map(_.id) should be(data.CarrierServices.all.map(_.id).sortBy { _.toLowerCase })
  }

  it("have no blanks") {
    data.CarrierServices.all.find(_.id.trim.isEmpty) should be(None)
  }

  it("find") {
    data.CarrierServices.all.foreach { carrierService =>
      // find by name
      CarrierServices.find(carrierService.name).getOrElse {
        sys.error(s"${carrierService.name} missing")
      }

      // find by id
      CarrierServices.find(carrierService.id).getOrElse {
        sys.error(s"${carrierService.id} missing")
      }
    }

    CarrierServices.find("other") should be(None)
  }

  it("mustFind") {
    data.CarrierServices.all.foreach { carrierService =>
      // must find by name
      CarrierServices.mustFind(carrierService.name).name.toLowerCase should be(carrierService.name.trim.toLowerCase)

      // must find by id
      CarrierServices.mustFind(carrierService.id).id.toLowerCase should be(carrierService.id.trim.toLowerCase)
    }

    intercept[Throwable] {
      CarrierServices.mustFind("other")
    }.getMessage should be("The following carrier service is invalid: [other]. See https://api.flow.io/reference/carrier-services for a list of all valid carrier-services.")
  }

}

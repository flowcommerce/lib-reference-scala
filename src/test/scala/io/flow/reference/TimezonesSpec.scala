package io.flow.reference

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class TimezonesSpec extends AnyFunSpec with Matchers {

  it("be unique") {
    data.Timezones.all.groupBy(_.name).filter { _._2.size > 1 }.keys should be(Set())
  }

  it("be sorted") {
    data.Timezones.all.map(_.description) should be(data.Timezones.all.map(_.description).sortBy { _.toLowerCase })
  }

  it("have no blanks") {
    data.Timezones.all.find(_.name.trim.isEmpty) should be(None)
  }

  it("have common timezones are defined") {
    val est = Timezones.find("US/Eastern").getOrElse {
      sys.error("US/Eastern missing")
    }
    est.description should be("Eastern Daylight Time")
    est.offset should be(-240)
  }

  it("find") {
    Seq("US/Mountain", "US/Pacific", " US/PACIFIC ", "Canada/Atlantic", "Australia/Brisbane").foreach { name =>
      Timezones.find(name).getOrElse {
        sys.error(s"$name missing")
      }
    }

    Timezones.find("other") should be(None)
  }

  it("mustFind") {
    Seq("US/Mountain", "US/Pacific", " US/PACIFIC ", "Canada/Atlantic", "Australia/Brisbane").foreach { name =>
      Timezones.mustFind(name).name.toLowerCase should be(name.trim.toLowerCase)
    }

    intercept[Throwable] {
      Timezones.mustFind("other")
    }.getMessage should be(
      "The following timezone is invalid: [other]. See https://api.flow.io/reference/timezones for a list of all valid timezones.",
    )
  }

}

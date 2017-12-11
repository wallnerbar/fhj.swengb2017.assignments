package at.fhj.swengb.apps.calculator

import java.nio.file.{Files, Paths}

import org.scalatest.WordSpecLike

import scala.io.Source

class TimesheetSpec extends WordSpecLike {
  "Franz der Kuschelbär" should {
    "be able to compare two numbers" in {
      assert(1==1)

    }
  }

  val file = "C:\\workspace\\fhj.swengb2017.assignments\\calculator\\timesheet-calculator.adoc"

  val new_file = Paths.get(file)
  println(Files.readAllLines(new_file))
}

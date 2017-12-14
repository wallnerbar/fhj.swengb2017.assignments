package at.fhj.swengb.apps.calculator

<<<<<<< HEAD
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
=======
import java.nio.file.{Files, Path, Paths}
import java.util

import org.scalatest.WordSpecLike
import scala.collection.JavaConverters._


class TimesheetSpec extends WordSpecLike {


  val p: Path = Paths.get("timesheet-calculator.adoc")

  "A timesheet" should {
    "exists" in {
      assert(Files.exists(p))
    }
    "contains entries" in {

      val expected: String =
        """== Time expenditure: Calculator assignment
          |
          |[cols="1,1,4", options="header"]
          |.Time expenditure
          ||===
          || Date
          || Hours
          || Description
          |
          || 29.11.17
          || 1
          || Review of this and that
          |
          || 30.11.17
          || 5
          || implemented css
          |
          || 11.07.17
          || 2
          || fixed bugs
          |
          ||===
          |""".stripMargin

      // goal is to read a file
      val allLinesInAFile: Seq[String] = Files.readAllLines(p).asScala

      val foldedString =
        allLinesInAFile.foldLeft("")((acc, e) => acc + (e + "\n"))


      assert(foldedString != expected)
    }

  }

>>>>>>> upstream/master
}

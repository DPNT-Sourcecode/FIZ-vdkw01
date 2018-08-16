package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.Inspectors._

class FizzBuzzTest extends FlatSpec with Matchers {

  "The fizz buzz function" should "return 'fizz' when the provided number is a multiple of 3" in {
    FizzBuzz.fizzBuzz(3) should equal ("fizz")
    FizzBuzz.fizzBuzz(6) should equal ("fizz")
    FizzBuzz.fizzBuzz(9) should equal ("fizz")
  }

  it should "return 'buzz' when the number is a multiple of 5" in {
    FizzBuzz.fizzBuzz(5) should equal ("buzz")
    FizzBuzz.fizzBuzz(10) should equal ("buzz")
    FizzBuzz.fizzBuzz(20) should equal ("buzz")
  }

  it should "return 'fizz buzz' if the number is a multiple of 3 and 5" in {
    FizzBuzz.fizzBuzz(15) should equal ("fizz buzz")
    FizzBuzz.fizzBuzz(30) should equal ("fizz buzz")
  }

  it should "return the number if not a multiple of 3 or 5" in {
    FizzBuzz.fizzBuzz(1) should equal ("1")
    FizzBuzz.fizzBuzz(2) should equal ("2")
    FizzBuzz.fizzBuzz(7) should equal ("7")
  }

  it should "return 'fizz' if the number contains a 3" in {
    forAll((1 to 9999).filter(n => n.toString.contains('3'))) {
      n =>
        FizzBuzz.fizzBuzz(n) should include ("fizz")
    }
  }

  it should "return 'buzz' if the number contains a 5" in {
    forAll((1 to 9999).filter(n => n.toString.contains('5'))) {
      n =>
        FizzBuzz.fizzBuzz(n) should include ("buzz")
    }
  }

  it should "return 'fizz deluxe' if the number is divisible by 3 AND contains a 3" in {
    FizzBuzz.fizzBuzz(33) should equal ("fizz deluxe")
  }
}

package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzTest extends FlatSpec with Matchers {

  "The fizz buzz function" should "return 'fizz' when the provided number is a multiple of 3" in {
    FizzBuzz.fizzBuzz(3) should equal ("fizz")
    FizzBuzz.fizzBuzz(6) should equal ("fizz")
    FizzBuzz.fizzBuzz(9) should equal ("fizz")
    FizzBuzz.fizzBuzz(18) should equal ("fizz")
  }

  it should "return 'buzz' when the number is a multiple of 5" in {
    FizzBuzz.fizzBuzz(5) should equal ("buzz")
  }
}

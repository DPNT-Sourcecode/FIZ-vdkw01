package befaster.solutions.FIZ

object FizzBuzz {
  def fizzBuzz(number: Int): String = {
    val result = Seq[Option[String]](
      if (number.divisibleBy(3) || number.contains(3)) Some("fizz") else None,
      if (number.divisibleBy(5) || number.contains(5)) Some("buzz") else None,
      if (number.isDeluxe)
        if (number.isFakeDeluxe) Some("fake deluxe") else Some("deluxe")
      else
        None)

    if (result.forall(_.isEmpty))
      number.toString
    else
      result.filterNot(_.isEmpty).map(_.get).reduce(_ + " " + _)
  }

  implicit class FizzBuzzNumber(number: Int) {
    def divisibleBy(divisor: Int): Boolean = number % divisor == 0
    def contains(digit: Int): Boolean = number.toString.contains(digit.toString)
    def isDeluxe: Boolean = divisibleBy(3) && contains(3) || divisibleBy(5) && contains(5)
    def isFakeDeluxe: Boolean = isDeluxe && number % 2 != 0
  }
}

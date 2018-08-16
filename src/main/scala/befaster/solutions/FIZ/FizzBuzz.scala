package befaster.solutions.FIZ

object FizzBuzz {
  def fizzBuzz(number: Int): String = number match {
    case n if n.isDeluxe => "deluxe"
    case n if (n.divisibleBy(3) || n.contains(3)) && (n.divisibleBy(5) || n.contains(5)) => "fizz buzz"
    case n if n.divisibleBy(3) || n.contains(3) => "fizz"
    case n if n.divisibleBy(5) || n.contains(5) => "buzz"
    case n => n.toString
  }

  implicit class FizzBuzzNumber(number: Int) {
    def divisibleBy(divisor: Int): Boolean = number % divisor == 0
    def contains(digit: Int): Boolean = number.toString.contains(digit.toString)
    def isDeluxe: Boolean = number > 10 && number.toString.distinct.length == 1
  }
}

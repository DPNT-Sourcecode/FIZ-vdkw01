package befaster.solutions.FIZ

object FizzBuzz {
  def fizzBuzz(number: Int): String = number match {
    case n if n % 15 == 0 => "fizz buzz"
    case n if n % 3 == 0 => "fizz"
    case n if n % 5 == 0 => "buzz"
    case n => n.toString
  }
}

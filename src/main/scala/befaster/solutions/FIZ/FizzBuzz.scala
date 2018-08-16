package befaster.solutions.FIZ

object FizzBuzz {
  def fizzBuzz(number: Int): String = number match {
    case n if n % 3 == 0 => "fizz"
    case _ => "buzz"
  }
}

package befaster.solutions.HLO

import org.scalatest.{FlatSpec, Matchers}

class HelloTest extends FlatSpec with Matchers {

  "The hello class" should "return 'Hello, World!' when given the name Craftsman" in {
    Hello.hello("Craftsman") should equal ("Hello, World!")
  }

  it should "return 'Hello, World!' regardless of user input" in {
    Hello.hello("Mr. X") should equal ("Hello, World!")
  }
}

package befaster.solutions.HLO

import org.scalatest.{FlatSpec, Matchers}

class HelloTest extends FlatSpec with Matchers {

  "The hello class" should "return 'Hello, World!' when given the name World" in {
    Hello.hello("World") should equal ("Hello, World!")
  }

  it should "return a greeting to the provided name" in {
    Hello.hello("Mr. X") should equal ("Hello, Mr. X!")
  }
}

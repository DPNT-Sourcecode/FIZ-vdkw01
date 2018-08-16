package befaster.solutions.HLO

import org.scalatest.{FlatSpec, Matchers}

class HelloTest extends FlatSpec with Matchers {

  "The hello class" should "return a string containing a greeting to the provided name" in {
    Hello.hello("world") should equal ("Hello, world")
  }
}

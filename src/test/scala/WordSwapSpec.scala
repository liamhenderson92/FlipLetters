import org.scalatest.{MustMatchers, WordSpec}

class WordSwapSpec extends WordSpec with MustMatchers {

  "WordSwap" must {

    "return a list of subnge and chamit when given submit and change" in {
      WordSwap.swap("submit", "change",3) mustEqual List("subnge", "chamit")
    }

    "return a list of dbc and aef when given abc and def" in {
      WordSwap.swap("abcd", "efgk",2) mustEqual List("abgk","efcd")
    }

    "return 12354 and 54566 when given 12366 and 54554" in {
      WordSwap.swap("12366","54554",2) mustEqual List("12354", "54566")
    }
  }
}

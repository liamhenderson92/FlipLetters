import org.scalatest.{WordSpec, MustMatchers}

class CharachterSwappingSpec extends WordSpec with MustMatchers {

  "CharachterSwapping" must {

    "return 'Y' when given an 'X'" in {
      CharachterSwapping.swap("X") mustEqual "Y"
    }

    "return 'Z' when given a 'Y'" in {
      CharachterSwapping.swap("Y") mustEqual "Z"
    }

    "return 'X' when given 'Z'" in {
      CharachterSwapping.swap("Z") mustEqual "X"
    }

    "return 'XX' when given 'ZZ'" in {
      CharachterSwapping.swap("ZZ") mustEqual "XX"
    }

    "return 'ZZZ' when given 'YYY" in {
      CharachterSwapping.swap("YYY") mustEqual "ZZZ"
    }

    "return all other opposite outcomes when given 'XYZ'" in {
      CharachterSwapping.replaceIndex("XYZ") mustEqual List("YYZ", "ZYZ", "XZZ", "XXZ", "XYX", "XYY")
    }
  }

}

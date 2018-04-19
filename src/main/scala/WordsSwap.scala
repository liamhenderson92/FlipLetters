object WordsSwap extends App {

  def swap (string1: String, string2: String, numChange: Int): List[String] = {
    val stringLeft = string1.length-numChange

    val newString1 = string1.take(stringLeft).concat(string2.takeRight(numChange))
    val newString2 = string2.take(stringLeft).concat(string1.takeRight(numChange))

    List(newString1, newString2)
  }

  println(swap("submit", "change",3))
}

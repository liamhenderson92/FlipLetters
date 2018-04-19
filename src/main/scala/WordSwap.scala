object WordSwap {

  def swap(string1: String, string2: String, num : Int) : List[String] =  {

    val startString1 = string1.length-num

//    val string1Left = string1.take(word1)
//    val string2Left = string2.take(word2)
//
//    val string1Right = string1.takeRight(word1)
//    val string2Right = string2.takeRight(word2)
//
//    val word1Output = string1Left.concat(string2Right)
//    val word2Output = string2Left.concat(string1Right)

    val newString1 = string1.take(startString1).concat(string2.takeRight(num))
    val newString2 = string2.take(startString1).concat(string1.takeRight(num))

//    List(word1Output, word2Output)

    List(newString1, newString2)

  }
}

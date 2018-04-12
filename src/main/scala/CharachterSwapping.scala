import scala.collection.immutable

object CharachterSwapping extends App {

  def swap(input: String): String = {
    val letters = Map("X" -> "Y", "Y" -> "Z", "Z" -> "X")
      input.map(x => letters(x.toString)).mkString
  }

  def replaceIndex(input: String): List[String] = {

    val inputLength: Seq[Int] = 0 until input.length

    inputLength.flatMap(number =>
      altChar(input(number)).map(char =>
        input.updated(number, char).mkString)).toList
  }

  def altChar(input: Char): List[String] = {
    input match {
      case 'X' => List("Y", "Z")
      case 'Y' => List("Z", "X")
      case 'Z' => List("X", "Y")
    }
  }
}


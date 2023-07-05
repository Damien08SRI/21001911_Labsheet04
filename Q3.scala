package Demo4

import scala.io.StdIn
object Q3 extends App{

  println("Enter a string: ")
  val inputString = StdIn.readLine()

  val uppercaseString = inputString.toUpperCase()

  val lowercaseString = inputString.toLowerCase()

  println(uppercaseString)
  println(lowercaseString)


}

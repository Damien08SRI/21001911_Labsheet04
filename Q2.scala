package Demo4

import scala.io.StdIn
object Q2 extends App {

  println("Enter an Integer: ")
  val inputInteger = StdIn.readInt()

  def outPut(catg:Int)= catg match{
    case x if x < 0 => """negative"""
    case x if x == 0 => """zero"""
    case x if x > 0 =>
      x % 2 match {
        case 0 => "even"
        case _ => """odd"""
      }

  }
  println(outPut(inputInteger))

}

package Demo4

object Q1 extends App{
  def interest(amount: Double): Double = {
    amount match {
      case x if x < 20000 => x * 0.02
      case x if x < 200000 => x * 0.04
      case x if x > 200000 => x * 0.06
      case x if x < 2000000 => x * 0.035
    }
  }
  val deposit = 250000
  val amountinterest = interest(deposit)
  println(s"The interest earned for a deposit of Rs. $deposit is Rs. $amountinterest")
}

object UseRationals {
  import Rational._
  import scala.language.implicitConversions
  implicit def intToRational(x: Int) = new Rational(x)

  def main(args:Array[String]):Unit = {
    val x = new Rational(2, 3)
    val y = Rational(5, 7)
    println(s"x=$x")
    println(s"y=$y")
    val z = -2 * x + y * 3
    println(s"z=$z")
  }
}


class Rational(n: Int, d: Int) {

  def this(n: Int) = this(n, 1);

  require(d != 0, "Denominator cannot be zero");
  
  private val g = gcd(n.abs, d.abs);

  
  val numer: Int = n / g;
  val denom: Int = d / g;
  

  def neg: Rational = new Rational(-numer, denom);

  override def toString: String = s"$numer/$denom";

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b);
}

def main(args: Array[String]): Unit = {
  //using user inputs
  // println("Enter the numerator");
  // val enu:Int = scala.io.StdIn.readLine().toInt;
  // println("Enter  the denominator");
  // val den = scala.io.StdIn.readLine().toInt;
  // val x = new Rational(enu,den);

  val x = new Rational(3, 4);

  println(x.neg) 
}


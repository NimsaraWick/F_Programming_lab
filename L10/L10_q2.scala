class Rational(n: Int, d: Int) {

  def this(n: Int) = this(n, 1);

  require(d != 0, "Denominator cannot be zero");
  
  private val g = gcd(n.abs, d.abs);

  
  val numer: Int = n / g;
  val denom: Int = d / g;
  
  override def toString: String = s"$numer/$denom";

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b);
   
  def sub(r2:Rational):Rational={
    new Rational(this.numer * r2.denom-this.denom * r2.numer , this.denom * r2.denom);
  }
}
    


def main(args: Array[String]): Unit = {
  
    println("x=3/4 , y=5/8 , z=2/7 ") ;

    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);

    val ans = x.sub(y).sub(z);

    println(s"x-y-z = $ans") 
}


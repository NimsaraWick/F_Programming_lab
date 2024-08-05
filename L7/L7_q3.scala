def isPrime(num: Int): Boolean = {
  if (num <= 1) false;
  else if (num == 2) true;
  else !(2 until num).exists(i => num % i == 0);
}

def filterPrime(numbers: List[Int]): List[Int] = {
  numbers.filter(num => isPrime(num));
}
def main(args: Array[String]): Unit = {
    val numbers= List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println(s"${filterPrime(numbers)}");

}

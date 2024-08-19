object PatternMatching{
    val classifyNumber: Int => String = {
        case x if x <= 0 => "Negative/Zero is input"
        case x if x % 2 == 0 => "Even number is given"
        case x if x % 2 != 0 => "Odd number is given"
    }

    def main(args: Array[String]): Unit = {
        val input = scala.io.StdIn.readLine("Enter an integer: ").toInt;
        println(classifyNumber(input));
    }
}

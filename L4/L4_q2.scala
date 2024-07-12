def main(args: Array[String]): Unit = {
    var num:Int=scala.io.StdIn.readLine().toInt;
    printf(s"${PatternMatching(num)}");
}
    
def PatternMatching(num:Int):String = {
        num match{
            case x if x <= 0 => "Negative/Zero is input.";
            case x if x % 2 == 0 =>"Even number.";
            case x if x % 2 != 0 =>"Odd number.";
        }
}   
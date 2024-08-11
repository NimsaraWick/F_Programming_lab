
val isMultipleOfThree: Int => Boolean = _ % 3 == 0;
val isMultipleOfFive: Int => Boolean = _ % 5 == 0;
val isMultipleOfBoth: Int => Boolean = x => isMultipleOfThree(x) && isMultipleOfFive(x);

def main(args: Array[String]): Unit = {
    var number = scala.io.StdIn.readLine("Enter a number : ").toInt;
    
    if (isMultipleOfBoth(number)) {
        println("Multiple of Both Three and Five");
    } else if (isMultipleOfThree(number)) {
        println("Multiple of Three");
    } else if (isMultipleOfFive(number)) {
        println("Multiple of Five");
    } else {
        println("Not a Multiple of Three or Five");
    }

}
def mean(num1:Int, num2:Int) : Float = {
    return (num1+num2)/2.0f;
}


def main(args: Array[String]): Unit = {
    val num1 = 24;
    val num2 = 27;
    val meanvalue = mean(num1,num2);
    printf(f"Mean is : $meanvalue%.2f");

}

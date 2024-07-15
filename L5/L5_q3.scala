def fibonacci(n:Int):Int= n match{
    case x if x==0 => 0;
    case x if x==1 => 1;
    case _ => fibonacci(n-1) + fibonacci(n-2);
}

def print_fibonacci(n:Int):Unit={
    for(i <- 0 until n){
        printf(s"${fibonacci(i)} ");
    }
}

def main(args: Array[String]): Unit = {
    println("---The Fibonacci Sequence---");
    printf("Enter number : ");
    var num = scala.io.StdIn.readLine().toInt;
    printf(s"Series of first $num Fibonacci numbers : ");
    print_fibonacci(num);
}
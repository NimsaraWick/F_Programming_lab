object interestCalculate{
    val interest = (amount: Float, rate: Float) => {(amount * rate) / 100};
    // val interest : (Float,Float) => Float = (amount: Float, rate: Float)=> {(amount * rate) / 100};

    val interest_calculater = (amount:Float) =>{
        if(amount <= 20000){interest(amount , 2)};
        else if(amount<=200000){interest(amount,4)};
        else if(amount<=2000000){interest(amount,5)}; // took 3.5% as 5%
        else {interest(amount,6.5)};
    }

    def main(args: Array[String]): Unit = {
        var amount = scala.io.StdIn.readLine("Enter your deposit amount (Rs.): ").toFloat;
        println(s"Interest (in a year) : ${interest_calculater(amount)}");
    }
}


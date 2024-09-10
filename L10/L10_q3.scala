class Account(n:Double){

    private var balance =n;
    println(s"Account created with balance: Rs.$balance");

    def deposit(amount:Double):Unit={
        require(amount > 0, "Deposit amount must be positive");

        balance+=amount;
        println(s"Deposited : Rs.$amount .\nNew Balance : Rs.$balance")

    }
    def withdraw(amount:Double):Unit={
        require(amount > 0, "Withdrawal amount must be positive");
        require(amount <= balance, "Insufficient balance!");
        balance-=amount;
        println(s"Withdrew : Rs.$amount .\nNew Balance : Rs.$balance");
        
    }

    def transfer(acc2: Account,amount:Double):Unit={

        require(amount > 0, "Transfer amount must be positive");
        require(amount <= balance, "Insufficient balance!");
        
        balance-=amount;
        print(s"--- Recipient's Account---\n");
        acc2.deposit(amount);

        println(s"\nTransferred: $amount .\nYour New Balance : Rs.$balance");
        
    }
}
 def main(args: Array[String]): Unit = {

    println("creating acc1");
    val acc1 = new Account(1000.0);

    println("creating acc2");
    val acc2 = new Account(500.0);

    println("\n---Deposit(acc1)---");
    acc1.deposit(250.0);

    println("\n---Withdraw(acc1)---");
    acc1.withdraw(180.0);
    
    println("\n---Transfer(acc1 to acc2)---");
    acc1.transfer(acc2,350.0);

 }
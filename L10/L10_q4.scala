class Account(var balance: Double, val id: Int) {

    println(s"Account created with ID: $id and balance: Rs.$balance");

    def deposit(amount: Double): Unit = {
        require(amount > 0, "Deposit amount must be positive");
        balance += amount;
    }

    def withdraw(amount: Double): Unit = {
        require(amount > 0, "Withdrawal amount must be positive");
        balance -= amount;
    }

    override def toString: String = s"Account ID: $id, Balance: Rs.$balance";
}

object Bank {

    def accounts_negative_balance(accounts: List[Account]): List[Account] = {
        accounts.filter(account => account.balance < 0);
    }

    def total_balance(accounts: List[Account]): Double = {
        accounts.map(account => account.balance).sum;
    }

    def Interest(accounts: List[Account]): List[Account] = {
        accounts.map { account =>
            if (account.balance > 0) {
                account.deposit(account.balance * 0.05);
            } else if (account.balance < 0) {
                account.withdraw(account.balance * 0.1*(-1));
            }
            account; 
        }
    }
}

def main(args: Array[String]): Unit = {

        val acc1 = new Account(1000.0, 1);
        val acc2 = new Account(-800.0, 2);
        val acc3 = new Account(500.0, 3);
        val acc4 = new Account(-200.0, 4);


        val bank: List[Account] = List(acc1, acc2, acc3, acc4);

        val negative_accounts = Bank.accounts_negative_balance(bank);
        println("\nAccounts with Negative Balances:");
        negative_accounts.foreach(println);
        
        val total = Bank.total_balance(bank);
        println(s"\nTotal Balance of All Accounts: Rs.$total");

    
        val updated_accounts = Bank.Interest(bank);
        println("\nAccounts after applying interest:");
        updated_accounts.foreach(println);
}


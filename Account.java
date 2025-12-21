//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

public class Account {
    private double balance;

         public Account(double initialBalance) {
         if (initialBalance > 0.0) {
         balance = initialBalance;
         } else {
            balance = 0.0;
         }
         }

public void credit(double amount) {
balance = balance + amount;
}

public double getBalance() {
return balance;
}
}
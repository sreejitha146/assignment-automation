package java_oops;

public class Account {
   protected double balance;
   protected double interestRate;
   public Account(double balance, double interestRate) {
       this.balance = balance;
       this.interestRate = interestRate;
   }
   public void calculateInterest() {
       double interest = balance * interestRate / 100;
       balance += interest;
       System.out.println("Balance after interest: " + balance);
   }
}

package java_oops;

public class SavingsAccount extends Account {
   public SavingsAccount(double balance, double interestRate) {
       super(balance, interestRate);
   }
   @Override
   public void calculateInterest() {
       double interest = balance * interestRate / 100;
       balance += interest;
       System.out.println("Savings Account Balance: " + balance);
   }
}

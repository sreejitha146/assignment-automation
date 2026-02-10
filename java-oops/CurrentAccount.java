package java_oops;

public class CurrentAccount extends Account {
   public CurrentAccount(double balance, double interestRate) {
       super(balance, interestRate);
   }
   @Override
   public void calculateInterest() {
       System.out.println("No interest for Current Account. Balance: " + balance);
   }
}


public class SavingAccount extends BankAcount{

    private final double interestRate = 0.03;
    
    public SavingAccount(String accountNumber, String ownerName, double balance) {
      super(accountNumber, ownerName, balance);

    }

   @Override
   public void calculateInterest() {

    super.deposit(balance*interestRate);
    System.out.println("deposit  :  " + "+" +balance*interestRate);

   }
    



    
}
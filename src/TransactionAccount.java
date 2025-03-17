public class TransactionAccount extends BankAcount {

    private final double overDraftLimit = 500;


    public TransactionAccount(String acNum, String owName, double balance) {
        super(acNum, owName, balance);
    }

    @Override
    public void calculateInterest() {

        System.out.println("Account : Intrest : 0.00");
        
    }
    @Override
    public void withDraw(double amount) {

        System.out.println("---------------------------");
        System.out.println("Transaction Account");
        System.out.println(getAccontNumber() + "        " + getOwnerName());
        if(amount > 0) {
            if(amount <= balance + overDraftLimit) {
                balance -= amount;
                System.out.println("withdraw  :  " + "-" + amount);
                System.out.println("new balance  :  " + balance);
            }
            else 
             System.out.println("amount is beyond the limit");
        }
        else 
        System.out.println("inputed amount is not valid");

        System.out.println("---------------------------");

    }
    
}

public class Main {
    public static void main(String[] args) {

        BankCustomers bank = new BankCustomers();

        SavingAccount savingAccount1 = new SavingAccount("1927", "Ali", 40);
        SavingAccount savingAccount2 = new SavingAccount("2358", "Faraz", 100);
        SavingAccount savingAccount3 = new SavingAccount("1269", "tyler", 30);

        TransactionAccount transactionAccount1 = new TransactionAccount("1928", "ALi", 10);
        TransactionAccount transactionAccount2 = new TransactionAccount("2389", "Faraz", 20.99);
        TransactionAccount TransactionAccount3 = new TransactionAccount("1270", "tyler", 68);

        bank.addAccount(savingAccount1);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);
        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(TransactionAccount3);
       
        // existed account
        bank.findAccount("1927");
        // doesnt exist
        bank.findAccount("0000");

       savingAccount1.deposit(30.18);
      // System.out.println(savingAccount1.balance);
       savingAccount1.calculateInterest();
       //System.out.println(savingAccount1.balance);

       transactionAccount1.withDraw(12);
       transactionAccount1.withDraw(900);

       //other payments
       savingAccount2.deposit(100);
       savingAccount2.calculateInterest();
       savingAccount2.withDraw(20);

       transactionAccount2.deposit(20);
       transactionAccount2.withDraw(999);
       transactionAccount2.withDraw(-9);
       transactionAccount2.withDraw(88);
       transactionAccount2.deposit(10000);

       savingAccount3.deposit(100);
       savingAccount3.calculateInterest();
       savingAccount3.withDraw(99);
       savingAccount3.withDraw(-9999);
       savingAccount3.withDraw(9);

       TransactionAccount3.withDraw(4374);
       TransactionAccount3.deposit(845.434334);
       TransactionAccount3.withDraw(-9999);
       TransactionAccount3.deposit(-9);

        bank.showAllBalance();
    }
    
}

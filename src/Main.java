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

        




    }
    
}

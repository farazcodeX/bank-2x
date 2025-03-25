import java.util.ArrayList;

public class BankCustomers {

    
    private ArrayList<BankAcount> accountsList = new ArrayList<>();

    public void addAccount(BankAcount acount) {


      // boolean found = false;

        for(int i = 0; i < accountsList.size(); ++i) {
            
            if(acount.getAccontNumber() == accountsList.get(i).getAccontNumber()) {
                System.out.println("account is already exit");
                return;
            }

        }

        System.out.println("----------------------------------------");
        System.out.println("account added successfully");
        System.out.println("Name :  " + acount.getOwnerName() + "  account number  : " + acount.getAccontNumber());
        accountsList.add(acount);
        System.out.println("-----------------------------------------");

    }
    public void showAllBalance() {
        for(int i = 0; i < accountsList.size(); ++i) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("account : " + accountsList.get(i).getAccontNumber() + "    Owner  :  ms/mr " + accountsList.get(i).getOwnerName() + "  balnce  : " + accountsList.get(i).getBalance());
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
    public BankAcount findAccount(String acNum) {
        for(int i = 0; i < accountsList.size(); ++i) {
            if(accountsList.get(i).getAccontNumber() == acNum) {
                System.out.println("account has been founded");
                return accountsList.get(i);
            }
        }
        System.out.println("account doesnt exist");
        return null;
    }

}

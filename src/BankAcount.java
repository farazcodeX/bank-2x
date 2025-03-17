public abstract class BankAcount {

   final private String accountNumber;
   private String ownerName;
   protected double balance;

   public BankAcount(String acNum, String ownerName, double balance) {
       
      this.accountNumber = acNum;
      this.ownerName = ownerName;
      this.balance = balance;

   }

   public abstract void calculateInterest();
   public void deposit(double amount) {

      if(amount > 0) {
         balance += amount;
         System.out.println("added  : " + amount + "new balance :  " + balance);
      } 
      else
       System.out.println("inputed amount is not valid");
      
   } 
   public void withDraw(double amount) {

      if(amount > 0) {
         balance -= amount;
         System.out.println(" withdraw  : " + "-" + amount + "   new balance :  " + balance);
      } 
      else
       System.out.println("inputed amount is not valid");
      
   }


   // define 3 getter for private fields
   public double getBalance() {
      return balance;

   }
   public String getAccontNumber() {
      return accountNumber;

   }
   public String getOwnerName() {
      return ownerName;
   }

  
}
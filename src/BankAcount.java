public abstract class BankAcount {

   final private String accountNumber;
   private String ownerName;
   protected double balance;

   public BankAcount(String accountNumber, String ownerName, double balance) {

      // i wnat to add a wrong input exception class but i think no need for this because this program is too basic 

      

      this.accountNumber = accountNumber;
      this.ownerName = ownerName;
      this.balance = balance;

   }

   public abstract void calculateInterest();

   public void deposit(double amount) {

      System.out.println("-------------------------");
      
      System.out.println(getAccontNumber() + "          " + getOwnerName());

      if(amount > 0) {

         balance += amount;
         System.out.println("added  : " + amount + "      new balance :  " + balance);
      } 
      else
       System.out.println("inputed amount is not valid");

      System.out.println("---------------------------");
      
   } 
   public void withDraw(double amount) {

      if(amount > 0) {

         if(amount < balance) {
           balance -= amount;
           System.out.println(" withdraw  : " + "-" + amount + "   new balance :  " + balance);
         }
         else
         System.out.println("not enough money");
      
   
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
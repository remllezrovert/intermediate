package java111.week6;

/**
   This program tests the BankAccount class.
*/

public class BankAccountTester
{

/**
 * Tests the transaction fee system
 * @param bankAccount b
 */
   public static void testTransactionFees(BankAccount b){
     System.out.println( "This account has " +
      b.getTransactionCount() +
      " transactions, and $" +
      b.getTransactionFee() +
      ".00 in transaction fees."
     );
   }

   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysAccount = new BankAccount(1000);
      harrysAccount.deposit(500); // Balance is now $1500
      harrysAccount.withdraw(2000); // Balance is now $1490
      harrysAccount.addInterest(1); // Balance is now $1490 + 14.90
      System.out.print("\nTest case 1\nThe balence is: ");
      System.out.printf("%.2f%n", harrysAccount.getBalance());
      System.out.println("Expected: 1504.90");
      testTransactionFees(harrysAccount);

      //test the penalty systems when withdrawling above the balence
      BankAccount trevorsAccount = new BankAccount();
      trevorsAccount.deposit(1); 
      trevorsAccount.deposit(2); 
      trevorsAccount.deposit(3); 
      trevorsAccount.deposit(4); 
      trevorsAccount.deposit(5); 
      trevorsAccount.withdraw(2000);
      trevorsAccount.addInterest(1); 
      System.out.print("Test case 2\nThe balence is: ");
      System.out.printf("%.2f%n", trevorsAccount.getBalance());
      System.out.println("Expected: 5.05");
      testTransactionFees(trevorsAccount);
     
      //tests a LOT of transactions 
      BankAccount yourAccount = new BankAccount();
      yourAccount.deposit(100); 
      yourAccount.deposit(100); 
      yourAccount.deposit(100); 
      yourAccount.deposit(100); 
      yourAccount.deposit(100); 
      yourAccount.deposit(100); 
      yourAccount.deposit(100); 
      yourAccount.deposit(100); 
      yourAccount.withdraw(50);
      yourAccount.withdraw(50);
      yourAccount.addInterest(1);
      System.out.print("\nTest case 3\nThe balence is: ");
      System.out.printf("%.2f%n", yourAccount.getBalance());
      System.out.println("Expected: 707.00");
      testTransactionFees(yourAccount);
   }
}



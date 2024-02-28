package java111.week6;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;
   private final int freeTransactions = 5;
   private int transactions = 0;
   private int transactionFee = 0;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into this account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      transactionFee();
      balance = balance + amount;
      
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {   
      transactionFee();
      final double PENALTY = 10;
      if (amount > balance)
      {
         balance = balance - PENALTY;
      }
      else
      {
         balance = balance - amount;
      }
   }

   /**
      Adds interest to this account.
      @param rate the interest rate in percent
   */
   public void addInterest(double rate)
   {   
      double amount = balance * rate / 100;
      balance = balance + amount;
   }

   /**
    * Charge the user a fee if they have expended their free transactions
    */
   public void transactionFee(){
      transactions +=1;
      if (transactions > freeTransactions)
         transactionFee++;
   }

/**
 * Get the transaction fee
 * @return transactionFee
 */
   public int getTransactionFee(){
      return transactionFee;
   }
/**
 * Gets the number of transactions
 * @return transactionCount
 */
   public int getTransactionCount(){
      return transactions;
   }

   /**
      Gets the current balance of this account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}


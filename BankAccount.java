/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afroze.task3;

/**
 *
 * @author afroz
 */

public class BankAccount {
    
    private float balance;
     public BankAccount(float initialBalance) {
        balance = initialBalance;
    }
     
    void withdraw(float amount)
     {
        if(amount>0)
        {
            if (balance>=amount)
            {
                balance=balance-amount;   
            }
            else
            {
                System.out.println("Insufficient Balance in ur Account");
            }
        }
        else
        {
            System.out.println("Invalid Amount Entered");
        }
         
     }
     void deposit(float amount)
     {
         balance=balance+amount;
         System.out.println("Transaction Successful ");
         System.out.println("Current balance of account is : " + balance);
     }
     void checkbalance()
     {
         System.out.println("Current balance of account is : " + balance);
     }
}

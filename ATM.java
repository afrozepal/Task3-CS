/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afroze.task3;
import java.util.Scanner;
/**
 *
 * @author afroz
 */
public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                account.checkbalance();
            } else if (choice == 2) {
                System.out.print("Enter the amount to deposit: $");
                float depositAmount = scanner.nextFloat();
                account.deposit(depositAmount);
            } else if (choice == 3) {
                System.out.print("Enter the amount to withdraw: $");
                float withdrawAmount = scanner.nextFloat();
                account.withdraw(withdrawAmount);
                account.checkbalance();
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                return;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package afroze.task3;

import java.util.*;

    
      

/**
 *
 * @author afroz
 */
public class Task3 {

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance of $1000
        ATM atm = new ATM(userAccount);
        atm.displayMenu();
    }
}

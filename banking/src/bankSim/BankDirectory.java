package bankSim;

import bankSim.*;
import java.util.*;

public class BankDirectory {
    static boolean accountStatus = true;
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Home Page \n");

        String options = "1. Check Amount in Account \n" +
                "2. Withdraw Funds \n" +
                "3. Deposit Funds \n" +
                "4. Logout ";

        System.out.println("Select a Mobile Banking Option: \n" + options);

        while(accountStatus){
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            choice = scanner.nextInt();
            if(choice < 1 || choice > 4){
                System.out.println("The choice you have selected is not present on the menu ");
            }
            if(choice == 1){
                // take to the account
                System.out.println("Account Amount");
                System.out.println(Account.accountAmount);
                System.out.println("\n" + options);
            }
            if(choice == 2){
                // take to class that allows withdrawal
                Withdraw.withdraw();
                System.out.println("\n" + options);
            }

            if(choice == 3){
                // take to class that deposits funds
                Deposit.deposit();
                System.out.println("\n" + options);
            }

            if(choice == 4){
                //logout
                System.out.println("You are now logged out of the Mobile Banking System: ");
                accountStatus = false;
            }

        }

    }
}

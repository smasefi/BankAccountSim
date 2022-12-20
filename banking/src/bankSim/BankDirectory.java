package bankSim;

import java.util.*;

public class BankDirectory {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Home Page \n");

        String options = "1. Check Amount in Account \n" +
                "2. Withdraw Funds \n" +
                "3. Deposit Funds \n" +
                "4. Logout ";

        System.out.println("Select a Mobile Banking Option: \n" + options);

        while(true){
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            choice = scanner.nextInt();
            if(choice < 1 || choice > 4){
                System.out.println("The choice you have selected is not present on the menu ");
            }

        }

    }
}

package bankSim;
import bankSim.*;

import java.util.Scanner;

public class Deposit {

    public static int new_total = 0;

    public static void deposit(){
        System.out.println("How much would you like to deposit");
        Scanner scanner = new Scanner(System.in);
        int deposit_amount = 0;
        deposit_amount = scanner.nextInt();

        int account_amount = Account.accountAmount;

        new_total = account_amount + deposit_amount;
    }

}

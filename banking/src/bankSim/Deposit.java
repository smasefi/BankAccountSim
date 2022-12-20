package bankSim;
import bankSim.*;

import java.util.Scanner;

public class Deposit extends Account{

    public static int new_total = Account.accountAmount;

    public static void deposit(){
        System.out.println("How much would you like to deposit");
        Scanner scanner = new Scanner(System.in);
        int deposit_amount = 0;
        deposit_amount = scanner.nextInt();

        new_total = new_total + deposit_amount;
        //System.out.println(new_total);
        setAccountAmount(new_total);
    }

}

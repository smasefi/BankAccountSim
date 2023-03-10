package bankSim;

import java.util.Scanner;

public class Withdraw extends Account {
    public static int account_total = Account.accountAmount;

    public static void withdraw() {
        System.out.println("Enter the amount you would like to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        int withdraw_amt = 0;

        withdraw_amt = scanner.nextInt();

        if(withdraw_amt > account_total){
            System.out.println("The amount that you are trying to withdraw exceeds the amount in your account. ");
        }
        else if (withdraw_amt == account_total){
            account_total = account_total - withdraw_amt;
            System.out.println("Your account is empty " + "Amount total is: " + account_total);
            setAccountAmount(account_total);
        }
        else{
            account_total = account_total - withdraw_amt;
            setAccountAmount(account_total);
        }
    }
}


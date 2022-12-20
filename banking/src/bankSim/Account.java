package bankSim;

public class Account {
    public static int accountAmount = 0;
    public static void accountAmount(){
        System.out.println(accountAmount);
    }

    public static void amountUpdater(){
        int new_total = Deposit.new_total;
        accountAmount = new_total + accountAmount;
    }
}

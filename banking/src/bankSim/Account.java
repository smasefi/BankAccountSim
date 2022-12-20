package bankSim;

public class Account {
    public static int accountAmount = 0;

    public static int getAccountAmount() {
        return accountAmount;
    }

    public static void setAccountAmount(int accountAmount) {
        Account.accountAmount = accountAmount;
    }
}

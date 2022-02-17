package generics1;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CurrentAccount currentAccount = new CurrentAccount(2000);
        printBalance(savingsAccount);
        printBalance(currentAccount);
//printBalance("hello"); // will not work as it does not extends the Account class
    }

    public static <E extends Account> void printBalance(E account) {// extends Account means the classes which extends account
        // can only access this method printBalance defined here.

        System.out.println("the account balance is " + account.getAccountBalance());
    }
}


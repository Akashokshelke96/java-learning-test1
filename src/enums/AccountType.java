package enums;

public enum AccountType {
    savingsAccount(5000),
    currentAccount(100000),
    jointAccount(12000);


    private double minBalance;
    AccountType (double minB){
    minBalance = minB;
}
    double getMinBalance() {
        return minBalance;
    }
}

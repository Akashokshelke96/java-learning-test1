package enums;

public class Account {
    private double balance;
    private String name;
    private AccountType accountType;

    public Account(double balance, String name, AccountType accountType) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getAccountType() {
    return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}

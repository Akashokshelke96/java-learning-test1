package concurrency;

public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public synchronized void updateBalance(int balance) {
        this.balance += balance;
    }
}


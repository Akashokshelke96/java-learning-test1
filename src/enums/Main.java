package enums;

public class Main {
    public static void main(String[] args) {
        try {
            debitMoney("akash");
        } catch (TransactionDeclinedException ex) {
            System.out.println(ex.getMessage());
        }
     

        Account account1 = new Account(10000, "akash", AccountType.savingsAccount);
        Account account2 = new Account(12314, "pratik", AccountType.jointAccount);
        System.out.println(account1.getAccountType());
        System.out.println(account1.getBalance());
        System.out.println(account1.getAccountType().getMinBalance());
        System.out.println((AccountType.currentAccount.getMinBalance())); //2nd wAY TO GET min balacne

    }

    public static void debitMoney(String account) throws TransactionDeclinedException {
        throw new TransactionDeclinedException(account + "dones not have sufficient balance!");
    }

}

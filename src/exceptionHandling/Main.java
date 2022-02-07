package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            debitMoney("akash");
        } catch (TransactionDeclinedException ex) {
            System.out.println(ex.getMessage());
        }
        try {

            creditMoney("nishu");
        } catch (AccountNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void debitMoney(String account)throws TransactionDeclinedException{
        throw new TransactionDeclinedException(account +" does not have sufficient balance");

    }
    public static void creditMoney(String account){
        throw new AccountNotFoundException(account + " does not have enough balance!!gareeb ");
    }

}

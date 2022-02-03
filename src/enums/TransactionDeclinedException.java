package enums;

public class TransactionDeclinedException extends Exception{
    public TransactionDeclinedException(String message){
        super(message);
    }
}

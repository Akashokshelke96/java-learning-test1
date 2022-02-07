package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void debitMoney(String account) throws TransactionDeclinedException {
        throw new TransactionDeclinedException(account + " does not have enough balance!");

    }
}

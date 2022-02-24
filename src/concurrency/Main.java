package concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {

       // for (int i = 0 ; i < 5 ; i++){
            Printer printer = new Printer(2);
            printer.start();
       //     Thread.sleep(700);
            printer.interrupt();


            // Thread th = new Thread(new Printer(i)); // running all the threads in parallel
           // printer.start(); // this will make the statements run in parallel
           // printer.doPrinting(); //this will print one by one going to sleep and wake up individually
        }
    }


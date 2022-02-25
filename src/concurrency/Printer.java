package concurrency;

public class Printer extends Thread {

    private int num;
    private BankAccount bankAccount;

    public Printer(int num, BankAccount bankAccount) {
        this.num = num;
        this.bankAccount = bankAccount;

    }


    public void run() {
        for (int i = 0; i < 3; i++) {
            int startingBalance = bankAccount.getBalance();
            System.out.println("Inside thread " + num + " starting balance =" + startingBalance);
            bankAccount.updateBalance(10);
            // bankAccount.setBalance(startingBalance + 10);
            System.out.println("Inside thread " + num + " ending balance = " + bankAccount.getBalance());

        }

    }
}
//    public void doPrinting() throws InterruptedException {
//        System.out.println("i am going to sleep " + num);
//        for (int i =0 ; i< 1000 ; i++) {
//            System.out.println("i = " + i);
//            if(Thread.interrupted()){
//                System.out.println("i am interrupted but i dont care");
//                Thread.sleep(4000);
//            }
//            }
//        System.out.println("Printer no = " + num );
//        }
//    }
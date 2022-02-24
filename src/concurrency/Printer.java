package concurrency;

public class Printer extends Thread {

    private int num;
    public Printer(int num){
        this.num = num;
        System.out.println("priting " + num + "!" );
    }
    @Override
    public void run() {
        try {
            doPrinting();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public void doPrinting() throws InterruptedException {
        System.out.println("i am going to sleep " + num);
        for (int i =0 ; i< 1000 ; i++) {
            System.out.println("i = " + i);
            if(Thread.interrupted()){
                System.out.println("i am interrupted but i dont care");
                Thread.sleep(4000);
            }
            }
        System.out.println("Printer no = " + num );
        }
    }


package concurrency;

public class Printer extends Thread {

    private int num;
    public Printer(int num){
        this.num = num;
        System.out.println("priting " + num + "!" );
    }
    @Override
    public void run() {
        doPrinting();


    }
    public void doPrinting(){
        System.out.println("i am going to sleep " + num);
        try {
            Thread.sleep(5000); //sleeps for 5 seconds and then again continue
            System.out.println("i am awake now " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
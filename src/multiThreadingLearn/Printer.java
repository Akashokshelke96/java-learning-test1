package multiThreadingLearn;

public class Printer implements Runnable {
    private int num;
    public Printer(int num){
        this.num = num;

    }
    @Override
    public void run() {
        doPrinting();

    }
    public void doPrinting() {
        System.out.println("i am going to sleep " + num);
        try{
            Thread.sleep(5000);
            System.out.println("returned from sleep" + num);
            }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }
}


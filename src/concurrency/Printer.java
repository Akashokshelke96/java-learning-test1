package concurrency;

public class Printer {
    private int num;
    public Printer(int num){
        this.num = num;
        System.out.println("priting " + num + "!" );
    }
    public void doPrinting(){
        System.out.println("i am going to sleep " + num);
        try {
            Thread.sleep(5000);
            System.out.println("i am awake now " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
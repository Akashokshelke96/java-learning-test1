package multiThreadingLearn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        for(int i = 0 ; i < 5 ; i++){
            Printer printer = new Printer(i);
            threadPool.submit(printer);
        }
    }
}

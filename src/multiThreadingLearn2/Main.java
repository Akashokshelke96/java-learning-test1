package multiThreadingLearn2;

import multiThreadingLearn.Printer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(5);// herer the order is irregular        for(int i = 0 ; i < 5 ; i++){
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            Printer printer = new Printer(i);
            threadPool.schedule(printer, 5, TimeUnit.SECONDS);
        }
    }
}

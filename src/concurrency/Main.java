package concurrency;

public class Main {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5 ; i++){
            Printer printer = new Printer(i);
            printer.doPrinting();
        }
    }
}

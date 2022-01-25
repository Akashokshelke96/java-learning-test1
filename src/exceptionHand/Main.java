package exceptionHand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        int num2  = sc.nextInt();
       try {


           int result = someFunction(num1, num2);
           System.out.println(result);
       } catch (ArithmeticException ex) {
           System.out.println("recieved exception artithmatic better luck next time sucker");
       }
    }
    public static int someFunction(int num1, int num2){
        return num1/num2;

}
}


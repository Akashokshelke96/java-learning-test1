package java1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClassB {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = 24;//scanner.nextInt();
        if (N%2 != 0){

            System.out.println("Weird");

        }

        else if (N%2 ==0) {
            if (2<=N && N<=5) {
                System.out.println("Not Weird");
            }
            else if (N>20) {
                System.out.println("Not Weird");
            }
            else if (N>=6 && N<=20) {

                System.out.println("Weird");
            }

            scanner.close();
        }
    }
}

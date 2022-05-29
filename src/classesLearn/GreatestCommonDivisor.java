package classesLearn;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void gcd(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " + n2);
    }
    public static void main(String[] args) {


        //Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1,n2);
    }
}


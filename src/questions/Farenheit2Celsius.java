package questions;

import java.util.Scanner;

public class Farenheit2Celsius {//this is the program to convert Farenheit to degree Celcius
        public static void main(String[] args) {
            float temperatue;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter temperatue in Fahrenheit");
            temperatue = in.nextInt();

            temperatue = ((temperatue - 32)*5)/9;

            System.out.println("Temperatue in Celsius = " + temperatue);
        }
    }


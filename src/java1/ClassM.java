package java1;

import java.util.Scanner;

public class ClassM {
        public static void main(String[] args) {

            Scanner in =new Scanner(System.in);
            int orgNum=in.nextInt();
            int copyNum = orgNum;
            int revNum = 0;
            while(copyNum != 0) {
                int digit = copyNum %10;
                copyNum /= 10;
                revNum = revNum * 10 + digit;

            }
            System.out.println(revNum);


        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }


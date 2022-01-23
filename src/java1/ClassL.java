package java1;

import java.util.Scanner;

public class ClassL {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer buffer = new StringBuffer(A);
        buffer.reverse();
        String Data = buffer.toString();
        if(A.equals(Data)) {
            System.out.println("Yes");
        }
            else{
                System.out.println("No");
            }
        }

    }
//learning git, push,add


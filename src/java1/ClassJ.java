package java1;

import java.util.Scanner;

public class ClassJ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean flag = false;
        for(int i=2;i<=num/2;++i) {
            if (num% i ==0){
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Yes");
        else {
            System.out.println("NO");
        }

    }
}//learning git, push,add
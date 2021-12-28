package java1;
import java.util.Scanner;
public class ClassA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 != 0) {

            System.out.println("Weird");

        } else {
            if ((2 <= N && N <= 5) || (N > 20)) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {

                System.out.println("Weird");
            }

            scanner.close();
        }
    }
}
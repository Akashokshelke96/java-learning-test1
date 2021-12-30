package java1;

public class ClassF {

    public static void main(String[] args) {
        int n = 6;

        for(int i = 1; i <= n; i++) {
            int noOfSpaces = n - 1;
            for (int j = 1; j <= noOfSpaces; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
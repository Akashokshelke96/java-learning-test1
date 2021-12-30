package java1;

public class ClassG {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            int noOfSpaces = n - i;
            for (int j = 1; j <= noOfSpaces; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


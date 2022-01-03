package Patterns;

public class MasterTriangle {
        public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" "); // 0spaces= Left Align Trian. ; 1Space= Pyramid ; 2Spaces= Right Align Train.
                                         //increasing the spaces will increase the angle and goes obtuse
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
//
    }
    }

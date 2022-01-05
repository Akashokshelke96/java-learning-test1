package arrays;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{90, 20830, 89}, {60, 40, 67}, {50, 10, 85},{12,45,78},{56,98,86}};
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        int[][] ary = new int[][]{
                {90, 20830, 89}, {60, 40, 67}, {50, 10, 85},{12,45,78},{56,98,86}};
        System.out.println(ary[2][2]);
        }

    }

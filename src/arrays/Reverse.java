package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 3;
        arr[3] = 23;
        arr[4] = 34;

        int[] arr2 = new int[5];
        arr[0] = 122;
        arr[1] = 23;
        arr[3] = 423;
        arr[4] = 33;



        for (int i : arrayReverse(arr)) {
            System.out.println(i);
        }


    }
    public static int[] arrayReverse(int[] list){
        int[] result = new int[list.length];

        for(int  i =0, j=result.length -1 ; i < list.length; i++,j--) {
            result[j] = list[i];
        }
        return result;
    }
}

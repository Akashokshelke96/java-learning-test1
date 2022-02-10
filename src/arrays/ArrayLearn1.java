package arrays;

public class ArrayLearn1 {
    public static void main(String[] args) {
        double[] arr = new double[5];
        arr[0] = 12;
        arr[1] = 3.5;
        arr[3] = 23.5667;
        arr[4] = 34.44;

        for(int i =0 ; i< arr.length ; i++){
            System.out.println((arr[i]) + " ");
        }

        System.out.println("===========");
        System.out.println("===========");
       int total = 0;
        for(int i = 0 ; i < arr.length ; i++){
            total += arr[i];
        }
        System.out.println(total);
        double max  = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max) max = arr[i];

        }
        System.out.println(max);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");

        for(double elements: arr) {
            System.out.println(elements);
        }



    }




}

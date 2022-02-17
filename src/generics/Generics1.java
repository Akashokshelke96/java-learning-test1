package generics;

public class Generics1 {
    public static void main(String[] args) {
        String [] arr = {"aaksh", "nishu", "shelke"};
        Integer[] arr2 = {2,4,5,7,8,9,0,8};
        printArrays(arr2);
        printArrays((arr));
    }

    public static <L> void printArrays(L[] arr){
        for(int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

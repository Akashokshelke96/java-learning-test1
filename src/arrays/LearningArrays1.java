package arrays;

public class LearningArrays1 {
    public static void main(String[] args) {
        String[] arr = new String[12];
        arr[0] = "akash";
        arr[1] = "nishu";
        arr[3] = "shelke";
        System.out.println(arr[3]);
        int n = arr.length;
        for(int i=0 ;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

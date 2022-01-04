package arrays;
import java.util.Arrays;
public class LearningArrays2 {
    public static void main(String[] args) {
        int[] arr = new int[]{
                90, 20830, 60, 40, 50, 10};
        int n = arr.length;

        System.out.println(Arrays.toString(arr));
        System.out.println("before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("after sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");





        }

    }
}

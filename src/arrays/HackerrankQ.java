package arrays;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class HackerrankQ {


    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        int result = HackerrankQ.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        sc.close();
        bufferedWriter.close();

    }
    public static int hourglassSum( int[][] arr) {
        Scanner in = new Scanner(System.in);

        int maxSum = Integer.MIN_VALUE;;
        int sum = 0;

        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();

                if(i > 1 && j > 1)
                {
                    sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2]
                            + arr[i - 1][j - 1]
                            + arr[i - 2][j] + arr[i - 2][j - 1] + arr[i -2][j - 2];

                    if(sum > maxSum)
                    {
                        maxSum = sum;
                    }
                }
            }
        }

        return maxSum;
    }
}




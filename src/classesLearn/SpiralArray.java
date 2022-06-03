package classesLearn;

public class SpiralArray {
    public static void main(String[] args) {

        int row =4;
        int col = 4;
        int[][] arr = new int[row][col];
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;
        arr[2][0] = 9;
        arr[2][1] = 10;
        arr[2][2] = 11;
        arr[2][3] = 12;
        arr[3][0] = 13;
        arr[3][1] = 14;
        arr[3][2] = 15;
        arr[3][3] = 16;

//        for(int i = 0; i<row; i++){
//            for (int j = 0; j < col; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        while(top<=bottom && left<= right){
            for(int i = left; i <= right ; i++ ){
                System.out.print(arr[top][i]+ " ");
            }
            top++;
            for(int i = top ; i<= bottom ; i++){
                System.out.print(arr[i][right]+ " ");
            }
            right--;
            if(top<bottom){
                for(int i =right;i>=left; i-- ){
                    System.out.print(arr[bottom][i]+ " ");
                }
            }
            bottom--;
            if(left<right){
                for(int i = bottom ;i >= top ;i--){
                    System.out.print(arr[i][left]+ " ");
                }
            }
            left++;
            System.out.println();
        }

    }
}

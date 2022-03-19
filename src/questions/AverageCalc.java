package questions;

public class AverageCalc {
    public static void main(String[] args) {
        System.out.println("calculating avg");
        int[] inputNumberArray = {10,20,30};

        double average = calculateAverage(inputNumberArray); //this is  program to learn debugging, hence the wrong output
        System.out.println(average);
    }
    public static double calculateAverage(int[] input){

        double result = 0;
        for(int element : input){
            result += element;


        }
      return result;
    }
}

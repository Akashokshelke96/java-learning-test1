public class VarargsDemo {
    public static void main(String[] args) {
        myForm(12,34,45667,878,98,5634,345,45,657,6,79);

    }
    public static void myForm(double... numbers){
        if(numbers.length == 0) {
            System.out.println("Invalid Input");
            return;
        }
        double result = numbers[0];
        for (int i = 0 ; i< numbers.length; i++){
            if(numbers[i] > result){
                result = numbers[i];
            }

        }
        System.out.println("Maxinmum value is " + result);
    }
}

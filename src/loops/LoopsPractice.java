package loops;

public class LoopsPractice {
    public static void main(String[] args) {
        //understanding the break sequence
        int count = 0;
        while (count<100){
            System.out.println("Akash " + count);
            count = count +1;
            if (count == 30){
                break;
            }
        }
    }
}

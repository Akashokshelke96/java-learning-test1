package loops;

public class ForLoops {
    public static void main(String[] args) {//string reversal

        String str = "akashkumarshelke";
        System.out.println(str.length());

        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.println(str.charAt(i));

        }
    }
}

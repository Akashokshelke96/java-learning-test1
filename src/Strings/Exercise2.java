package Strings;

public class Exercise2 {
    public static void main(String[] args) {
        String name = "ihavebeenagreatpersonyet";
        for (int i = name.length() - 1 ; i >= 0; i--) {
            System.out.println("char at: " + name.charAt(i));
        }
        //printing charAt reverse of String.
    }
}

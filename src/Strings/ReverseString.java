package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "akashShelke";
        StringBuilder sb = new StringBuilder(str);

        //smaller version of reversing a string
        for(int i = str.length()-1 ; i >= 0; i--){
            System.out.print(sb.charAt(i));
        }

        //Longer version of doing the same thing..

        for (int i = 0; i < str.length() - 1; i++) {
                int front = i;
                int back = str.length() - 1 - i;

                char frontChar = str.charAt(front);
                char backChar = str.charAt(back);

                sb.setCharAt(front, backChar);
                sb.setCharAt(back, frontChar);

            }
        System.out.println(" ");
            System.out.println(sb);

        }
    }


package Strings;

public class StringsPractice {
    public static void main(String[] args) {
        String a = "hello yogi there yogi";
        System.out.println(a.length());
        String b = "helo";
        int l = a.indexOf("yogi", 4);
        int k = a.lastIndexOf("yogi");
        System.out.println(l);
        System.out.println(k);



        if (!b.equalsIgnoreCase("helo")) {
            System.out.println("bv");
        }
        else
        {
            System.out.println("msski");
        }
    }
}

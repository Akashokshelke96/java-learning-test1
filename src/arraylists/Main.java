package arraylists;

import java.util.ArrayList;

public class Main {// main class of arraylist
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("people");
        System.out.println(arr.size());
        System.out.println((arr.contains("hello")));
        arr.add("nishu");
        System.out.println(arr);
        arr.add("akash");
        arr.add("savi");
        for (int i = 0; i < arr.size(); i++) { // this is how we can print it in a non array manner in next line.
            System.out.println(arr.get(i));
        }
    }
}


package arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays2 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("aksh");
        arr1.add("aksha");
        arr1.add("akshs");
        arr1.add("akshd");
        arr1.add("akshgh");
        arr1.add("akshhgh");
        Iterator<String> iter = arr1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println(arr1.listIterator());
        }
    }// this is an arraylist example 2
}


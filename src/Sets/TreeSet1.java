package Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

    // Main driver method
    public static void main(String args[]) {

        // Creating an empty TreeSet of string type elements
        TreeSet<String> al = new TreeSet<String>();

        // Adding elements
        // using add() method
        al.add("Welcome");
        al.add("to");
        al.add("Geeks for Geeks");

        // Traversing elements via help of iterators
        Iterator<String> itr = al.iterator();

        // Holds true until there is element remaining in object
        while (itr.hasNext()) {

            // Moving onto next element with help of next() method
            System.out.println(itr.next());
        }
    }
}


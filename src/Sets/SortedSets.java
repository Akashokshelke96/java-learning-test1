package Sets;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        set.add("akash");
        set.add("nishu");
        set.add("savita");

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Object element  = itr.next();
            System.out.println(element.toString());
        }
    }
}

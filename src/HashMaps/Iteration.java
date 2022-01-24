package HashMaps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        HashSet<Integer> mp = new HashSet<>();
        mp.add(12);
        mp.add(35);
        mp.add(56);
        mp.add(76);
        mp.add(46);

        Iterator<Integer> it = mp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() );
        }

    }
}

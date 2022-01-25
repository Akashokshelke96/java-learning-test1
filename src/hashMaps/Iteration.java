package hashMaps;

import java.util.*;

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
        List<Integer> elements = new ArrayList<>();
        elements.add(35);
        elements.add(56);

       // mp.removeAll(elements);
        System.out.println(mp);
        mp.retainAll(elements);
        System.out.println();

    }
}

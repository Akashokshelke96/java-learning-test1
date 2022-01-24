package Sets;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set);
        set.add(23);
        set.add(33);
        set.add(21);
        set.add(45);
        set.add(5434);
        System.out.println(set);
        System.out.println(set.contains(23));
        System.out.println(set.stream().findFirst());


    }
}

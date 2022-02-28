package Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(23);
        l1.add(344);
        l1.add(38);
        System.out.println(l1.listIterator(0));
        System.out.println(l1);

    }
}

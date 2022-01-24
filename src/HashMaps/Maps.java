package HashMaps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("toyota", 178);
        mp.put("tesla" , 200);
        mp.put("toyota lo" ,85);
        mp.put("ferrari", 12);
        System.out.println(mp.size());
        mp.remove("toyota");
        mp.containsKey("tesla");
        System.out.println(mp);
        System.out.println("this is the size");
        System.out.println(mp.size());
        System.out.println(mp.get("tesla"));
        mp.clone();
        System.out.println(mp);
        HashMap<String, Integer> mp2 = new HashMap<>();
        mp2.putAll(mp);
        System.out.println(mp);

    }

}

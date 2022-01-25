package hashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        HashMap<String, Integer> ms1 = new HashMap<>();
        ms1.put("Akash", 2000);
        ms1.put("prakash", 23124);
        ms1.put("savita",  232214);
        ms1.put("shelke" , 243677);

        Set<String> keys = ms1.keySet();
        for(String k : keys) {
            System.out.println("Key is " + k);
        }
        System.out.println("==============");
        Set<Map.Entry<String, Integer>> entries = ms1.entrySet();

        for(Map.Entry<String, Integer> entry: entries) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}

package hashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable(10);
        Enumeration names;
        String str;
        double bal = 0;
        balance.put("akash",new Double(12.557));
        balance.put("nishu", new Double(34.3));
        balance.put("savita",new Double(334.3));
        names = balance.keys();
        double bal2 = (double) balance.get("nishu");
        balance.put("nishu" ,(bal2 + 1000) );

        while (names.hasMoreElements()){
            str = (String) names.nextElement();
            System.out.println(" Name : " + str + " balance: " + balance.get(str) + "$");

        }   System.out.println("You have done it bro");

    }

}

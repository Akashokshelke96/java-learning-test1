package Strings;

public class Exercise {
    public static void main(String[] args) {
        String str = "i have a large inventory of items " + "categories:apperal and slightly " + "categories:furniture and bed";
        printCategories(str);
        System.out.println(str);
    }

    private static void printCategories(String str) {
        System.out.println(str.indexOf("categories:"));
        int var = 0;
        while(true) {
            int found  = str.indexOf("categories:", var);
            if(found == -1) break;
            int start = found + 11;  //this is how we add index
            int end = str.indexOf(" ",start);
            System.out.println(str.substring(start,end));
            var = end + 1 ;
        }
     //   System.out.println(str.substring(34,66) + "  " + str.substring(66));

    }
}

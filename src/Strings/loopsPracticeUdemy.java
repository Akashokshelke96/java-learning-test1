package Strings;

public class loopsPracticeUdemy {
    public static void main(String[] args) {
        String string = "we have a larger categories of items" + "category:apparel and makeup" + "more in demand category:bikes along with category:furniture and ";
        printCategories(string);

    }

    public static void printCategories(String str) {
      int i = 0;
      while(true){
          int found = str.indexOf("category:" , i);
          if(found == -1) break;

          int start = found + 9;
          int end = str.indexOf(" " , start);
          System.out.println(str.substring(start,end));

          i = end + 1;
      }
    }
}

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int j = 0; j< Integer.MAX_VALUE; j+=2){
//            arrayList.add(j);
//
//        }
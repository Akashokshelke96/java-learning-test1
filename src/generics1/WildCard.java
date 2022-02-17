package generics1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("akash", "nishu" , "savita");
        List<Integer> arr2 = Arrays.asList(23,45,5,7,89,9,0,34,56,3);
//    printList(arr);
//    printList(arr2);
    List<SavingsAccount> arr3 = Arrays.asList(new SavingsAccount(5000),
            new SavingsAccount(8000));

    printList(arr3);
    List<CurrentAccount> arr4 = Arrays.asList(new CurrentAccount(50365),new CurrentAccount(564));
  //  printList(arr4); //this will show error as we have lower Bounded Savings Account in the methods below;


    }


//    public static <E> void printList(List<E> list){
//        for (int i = 0; i< list.size() ; i++){
//            System.out.println(list.get(i));
//
//        }
//    }
//    public static void printList(List<?> list){ //Using <?> instead of <E> etc also does the same work when we dont need to use <E> inside the methods as well
//        for(int i = 0; i< list.size(); i++){
//            System.out.println(list.get(i));
//
//        }
//
//    }
//    public static void printList(List<? extends Account> list){ //since String does not extends Account it will show error
//        for(int i = 0; i< list.size(); i++){             // we can used Account as List<SavingsAccount>
//            System.out.println(list.get(i));
//
//        }
//
//    }
    public static void printList(List<? extends SavingsAccount> list){ //since String does not extends Account it will show error
        for(int i = 0; i< list.size(); i++){             // we can used Account as List<SavingsAccount>
            System.out.println(list.get(i));

        }

    }

}

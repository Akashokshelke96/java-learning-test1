package generics;

public class Card {
    public static void main(String[] args) {
        Pair<String , Card> p = new Pair<>("kash",new Card());
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}

package generics;

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>("hello",69);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}

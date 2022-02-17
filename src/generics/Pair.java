package generics;

public class Pair<E1 , E2> {
    E1 first;
    E2 second;

    public E1 getFirst() {
        return this.first;
    }

    public E2 getSecond() {
        return this.second;
    }

    public Pair(E1 first, E2 second){

    }
}

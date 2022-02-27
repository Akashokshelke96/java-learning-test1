package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Sample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(34);
        queue.add(56);
        System.out.println(queue.peek());
       // queue.remove();
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.size());
       // System.out.println(queue.removeAll(queue));
      //  System.out.println(queue.peek());
    }
}

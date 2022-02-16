package stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//
//        Stack<Integer> stk = new Stack<>();
//        stk.push(2);
//        System.out.println(stk.peek());
//        stk.push(12);
//        stk.push((54));
//        System.out.println(stk.size());
//        System.out.println(stk.empty());
//        System.out.println(stk.search(12));
//        System.out.println(stk.peek());


     //stacks implementation as ArrayList
        MyStack stk = new MyStack();
        stk.push(12);
        stk.pop();
        stk.push(3);
        System.out.println(stk.top());
    }
}

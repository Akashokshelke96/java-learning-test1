package stacks;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> arr;

    public MyStack() {
        this.arr = new ArrayList<>();
    }

    public void push(int x) {
        arr.add(x);
    }

    public int top() {
        if (arr.size() > 0) {
            return arr.get(arr.size() - 1);
        }
        else {
            return -1;

        }
    }
    public  void pop(){
        if(arr.size() > 0 ) {
            arr.remove(arr.size() - 1);
        }
    }

}

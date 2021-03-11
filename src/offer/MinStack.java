package offer;

import java.util.Stack;

public class MinStack {
    Stack <Integer>a, b;
    /** initialize your data structure here. */
    public MinStack() {
        a=new Stack<>();
        b=new Stack<>();
    }

    public void push(int x) {
        a.add(x);
        if(b.empty()||b.peek()>=x){
            b.add(x);
        }

    }

    public void pop() {
        if(a.pop().equals(b.peek()))
            b.pop();

    }

    public int top() {
        return  a.peek();

    }

    public int min() {
        return  b.peek();

    }
}

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106071875
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class MinStack {
    //进行栈操作
    Stack<Integer> stack ;
    //优先队列实现堆
    Queue<Integer> prio;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
        prio=new PriorityQueue<>();

    }

    public void push(int x) {
        stack.push(x);
        prio.offer(x);

    }

    public void pop() {
        Integer tem=stack.pop();
         prio.remove(tem);

    }

    public int top() {
        return  stack.peek();

    }

    public int getMin() {
        return  prio.peek();

    }
    public static  void main(String[] args){
        MinStack minStack=new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
       minStack.pop();
        System.out.println(minStack.getMin());
    }
}
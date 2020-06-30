package daily;

import java.util.Stack;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107041816
public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer>res;
    public CQueue() {
     stack1=new Stack();
     res=new Stack();
    }
//加尾巴直接加
    public void appendTail(int value) {
       stack1.push(value);

    }
//res空，那就stack1直接倒过去，然后返回栈顶。否则直接返回栈顶
    public int deleteHead() {
  if(res.isEmpty()){
      while(!stack1.isEmpty()){
          res.push(stack1.pop());
      }
  }

        if(res.isEmpty()){
            return -1;
        }
      return res.pop();
    }
}

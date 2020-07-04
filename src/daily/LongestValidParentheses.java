package daily;

import java.util.Stack;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/107120434
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int maxres=0;
        Stack <Integer> stack=new Stack<>();
        //初始化
        stack.push(-1);
        for (int i=0;i<s.length();i++){
            //（直接加
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else {
                stack.pop();
                //空 没有匹配
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else {
                    maxres=Math.max(maxres,i-stack.peek());
                }
            }
        }
        return maxres;
    }

    public static  void main(String[] args){
        String s=")()())";
        LongestValidParentheses longestValidParentheses=new LongestValidParentheses();

        System.out.println(longestValidParentheses.longestValidParentheses(s));
    }
}

package daily;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107999555
public class IsValid {
    public boolean isValid(String s) {
        int len=s.length();
        if (len % 2 == 1) {
            return false;
        }
        //右括号往左括号的映射
        Map<Character, Character> map = new HashMap<Character, Character>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < len ; i++) {
            char c = s.charAt(i);
            //右括号
            if (map.containsKey(c)) {
                //栈空或者不匹配
                if (stack.isEmpty() || map.get(c)!=(stack.peek())) {
                    return false;
                }
                //这个点过去了，出栈
                stack.pop();
            //左括号
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        String str = "([)]";
        System.out.println(isValid.isValid(str));
    }

}

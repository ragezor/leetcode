package interviewsummary.string_test;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/103965811
 */
import java.util.*;
public class calculate {

        public int calculate(String s) {
            Deque<Integer> stack=new ArrayDeque<>();
            int result=0,num=0;//用来存储最终结果和当前处理数字
            char c='+';//用来记录符号位
            s=s.replaceAll(" ","");//处理空格

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){//如果当前数数字
                    num=num*10+s.charAt(i)-'0';//将数字转化成字符，num*10是因为比如说1234按位数处理每个字符的时候要考虑进位的问题
                }
                if(s.charAt(i)<'0'||i==s.length()-1){//如果处理完了或者现在的这个字符是符号（符号的ASCII码小于'0'；
                    switch(c){
                        case '+':
                            stack.push(num);//当前＋放进去就行
                            break;
                        case '-':
                            stack.push(-num);//当前＋，取负数放进去就行
                            break;
                        case '*':
                            stack.push((num)*stack.pop());//乘号除号就先处理了再放进入栈
                            break;
                        case '/':
                            stack.push(stack.pop()/(num));//除号注意被除数和除数
                            break;

                    }
                    num=0;//现在处理完符号，num归零，且更新符号
                    c=s.charAt(i);
                }
            }


            while(!stack.isEmpty()){//再出栈，直接全加起来就可以
                result+=stack.pop();
            }
            return result;

        }
    }



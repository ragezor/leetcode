package mid.others;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103418774
import  java.util.*;
public class evalRPN {

        public int evalRPN(String[] tokens) {
            List<Integer> number=new ArrayList<>();
            int index=0;
            for(String str:tokens){
                if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")){

                    index=number.size()-2;//出现符号的位置
                    int a=number.remove(index);//取出来
                    int b=number.remove(index);

                    switch(str.charAt(0)){
                        case '+':number.add(a+b);break;//计算结果，再存进去
                        case '-':number.add(a-b);break;
                        case '*':number.add(a*b);break;
                        case '/':number.add(a/b);break;

                    }
                }
                else{
                    number.add(Integer.valueOf(str));//如果是数就直接加进去
                }
            }
            return number.get(0);
        }
    }




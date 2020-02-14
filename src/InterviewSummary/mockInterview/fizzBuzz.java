package InterviewSummary.mockInterview;

import java.util.*;

/*
题干：写一个程序，输出从 1 到 n 数字的字符串表示。
如果 n 是3的倍数，输出“Fizz”；
如果 n 是5的倍数，输出“Buzz”；
如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
--------------------------------
总结：https://blog.csdn.net/qq_43491066/article/details/104179690
想法：
题很简单 直接遍历就行 重点就在如果数字和3，5都不是倍数 怎么返回它的字符串对应的数组 这里；两种常用的方法 +“” 或者Integer.toString

 */
public class fizzBuzz {


        public List<String> fizzBuzz(int n) {
            //result来存储
            List<String> result=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(i%3==0){
                    //如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
                    if(i%5==0){
                        result.add("FizzBuzz");
                    }
                    //如果 n 是3的倍数，不是5的倍数输出“Fizz”；
                    else{
                        result.add("Fizz");
                    }

                }
                else{
                    //如果 n 是5的倍数，不是3的倍数，输出“Buzz”；
                    if(i%5==0){
                        result.add("Buzz");
                    }
                    else{
                        //什么都不是返回对应的字符串
                        result.add(Integer.toString(i));
                    }
                }
            }
            return result;
        }
    }




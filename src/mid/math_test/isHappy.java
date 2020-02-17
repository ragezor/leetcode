package mid.math_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103333100
import  java.util.*;
public class isHappy {

        public boolean isHappy(int n) {
            List<Integer> list=new ArrayList<Integer>();
            list.add(n);
            while(n!=1){
                int temp=0;
                while(n!=0){//求每个数的平方和
                    temp+=(n%10)*(n%10);
                    n=n/10;
                }
                n=temp;
                if(list.contains(n)){//有
                    break;
                }
                else{
                    list.add(n);
                }

            }

            return n==1;}
    }




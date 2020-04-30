package daily;

import java.util.HashSet;
import java.util.Set;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/105856713
public class IsHappy {
    //getNext用于表示获得下一个数，即每位平方相加
    private  int getNext(int num){
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d*d;
            num=num/10;
        }
        return  sum;
    }
    //快慢指针
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getNext(n);
        while(fast!=1&&slow!=fast){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        //最终判断是不是1
        return  fast==1;


    }
    //hashset存
    public boolean isHappy2(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            n=getNext(n);
        }
        return  n==1;
    }

    public  static  void main(String[] args){
        IsHappy isHappy=new IsHappy();
        System.out.println("the number is"+19+" ");
        System.out.println("in method 1 ,the result is:"+isHappy.isHappy(19));
        System.out.println("in method 2 ,the result is:"+isHappy.isHappy2(19));
    }
}

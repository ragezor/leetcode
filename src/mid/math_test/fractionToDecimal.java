package mid.math_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103383085
import  java.util.*;
public class fractionToDecimal {
        public String fractionToDecimal(int numerator, int denominator) {
            if(numerator==0) {return "0";}//被除数为0的情况
            if(denominator==0){return String.valueOf(Integer.MAX_VALUE);}//除数为0的情况
            HashMap<Long,Integer> map= new HashMap<>();//用hashmap来存这个数在小数点后的位置和值
            List<Long> number=new ArrayList<>();//list来存整个数的每位
            int index=0;//现在进行到哪个位置
            int beginIndex=-1;//循环开始的位置
            StringBuilder builder = new StringBuilder();
            Long num=(long)numerator;//转换成long，下同
            Long denum=(long)denominator;
            if((num<0&&denum>0)||(num>0&&denum<0)){//如果异号，开头加负号
                builder.append('-');}
            num=Math.abs(num);//都取成正的，下同
            denum=Math.abs(denum);

            Long val=num/denum;//这一位的数
            builder.append(String.valueOf(val));//第一位直接加进去，其实可以不要list直接加sb
            num=(num%denum)*10;//余数×10作为被除数

            while(num!=0){
                if(!map.containsKey(num)){//如果hashmap里没有，证明没有出现过
                    map.put(num,index++);//加到hashmap
                    val=num/denum;
                    number.add(val);
                    num=(num%denum)*10;
                }else{
                    beginIndex=map.get(num);//有的话，在list里找到这个数的位置，作为循环开始的位置
                    break;
                }
            }
            for(int i=0;i<index;i++){
                if(i==0) {builder.append('.');}//加小数点
                if(i==beginIndex) {builder.append('(');}//循环体
                builder.append(number.get(i));//将list的每一位加到sb
            }
            if(beginIndex!=-1){
                builder.append(')');//循环结束，最后补一个）
            }
            return builder.toString();  }
    }




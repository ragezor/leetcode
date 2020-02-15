package InterviewSummary.stringTest;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103499473
import  java.util.*;
public class minWindow {

        public String minWindow(String s, String t) {
        /*先用一个hashmap存需要的字符串和它对应的数量
        用两个指针标记位置，首先右指针从0往后遍历，如果遇到的这个数存在于hashmap，那么就count++，hashmap--，直到count==t的长度，那么就考虑精简的事情

        */
            int left=0;
            int right=0;
            int count=0;
            int minleft=0;
            int minright=0;

            HashMap<Character,Integer> map=new HashMap<>();
            for(char c: t.toCharArray()){
                if(map.containsKey(c)){
                    map.replace(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            }
            int min=Integer.MAX_VALUE;

            //右指针向右
            for(;right<s.length();right++){
                char temp=s.charAt(right);
                if(map.containsKey(temp)){
                    if(map.get(temp)>0){//这个是s中重复，t其实不需要了
                        count++;
                    }
                    map.replace(temp,map.get(temp)-1);
                }
                while(count==t.length()){
                    if(right-left<min){
                        min=right-left;
                        minleft=left;
                        minright=right;
                    }
                    char c=s.charAt(left);
                    if(map.containsKey(c)){//同上边
                        if(map.get(c) >= 0)
                            count--;
                        map.replace(c,map.get(c)+1);
                    }
                    left++;
                }
            }



            if(min==Integer.MAX_VALUE){return "";}
            else{
                return s.substring(minleft,minright+1);
            }

        }
    }




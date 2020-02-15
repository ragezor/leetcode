package Mid.arraysAndString;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102764799
import  java.util.*;
public class lengthOfLongestSubstring {

        public int lengthOfLongestSubstring(String s) {

            int len=s.length();
            int start=0;
            int end=0;
            int sublen=0;
            Set<Character> set=new HashSet<>();

            while(start<len && end<len){
                if(set.contains(s.charAt(end))){
                    set.remove(s.charAt(start++));
                }else{
                    set.add(s.charAt(end++));
                    sublen=Math.max(sublen,end-start);
                }

            }

            return sublen;}
    }




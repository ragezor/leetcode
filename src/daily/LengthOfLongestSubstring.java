package daily;

import java.util.HashSet;
import java.util.Set;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105888122
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //set用来存储窗口内的元素
        Set<Character> set=new HashSet<>();
        //右指针最开始指向1，最长长度指向1，也就是单个字符
        int right=1,res=1;

        int n=s.length();
        //空判断
        if(s==null||s.length()==0){
            return 0;
        }
        //初始条件
        set.add(s.charAt(0));
        for(int i=0;i<n;i++)
        {
            //当右指针小于n且现在右指针指向的字符和窗口内的不重复
            while (right<n&&!set.contains(s.charAt(right))){
                //加入 右指针++
                set.add(s.charAt(right));
                right++;
            }
            //因为下一步左指针右移，所以remove
            set.remove(s.charAt(i));
            //dp
            res=Math.max(res,right-i);

        }
        return  res;

    }
    public static  void main(String[] args){
        LengthOfLongestSubstring lengthOfLongestSubstring=new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
       System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("bbbbbb"));
       System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));

    }
}

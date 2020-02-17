package interviewsummary.dynamicprogramming;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103660639
import  java.util.*;
public class wordBreak {

        public boolean wordBreak(String s, List<String> wordDict) {
            boolean [] dp=new boolean[s.length()+1];//用Boolean dp[]来存0到对应位置的字符串是否能被字典表达
            dp[0]=true;
            for(int i=1;i<=s.length();i++){
                for(int j=0;j<i&& !dp[i];j++){

                    String check=s.substring(j,i);
                    dp[i] = dp[j] && wordDict.contains(check);//j真且之间的在字典里，i为真
                }
            }
            return dp[s.length()];
        }



}

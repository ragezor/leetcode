package daily;


import java.util.Arrays;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106958743
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
     int len=s.length();
     boolean [] dp=new  boolean[len+1];
     dp[0]=true;
     for (int i=1;i<len+1;i++){
         for (int j=0;j<i&&!dp[i];j++){
             String tem=s.substring(j,i);
             dp[i]=dp[j]&&wordDict.contains(tem);
         }
     }
     return  dp[len];

    }

    public static  void main(String[] args){
        WordBreak wordBreak=new WordBreak();
        String s = "leetcode";

        List<String> wordDict= Arrays.asList("leet", "code");
        System.out.println(wordBreak.wordBreak(s,wordDict));
    }

}

package offer;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len=s.length();
        boolean [] dp=new boolean[len+1];
        dp[0]=true;
        for (int i = 1; i <len+1 ; i++) {
            for (int j = 0; j <i&&!dp[i] ; j++) {
                String tem=s.substring(j,i);
                dp[i]=dp[j]&&wordDict.contains(tem);
            }

        }
        return  dp[len];

    }
}

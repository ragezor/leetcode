package daily;

public class MinDistance {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/105341333
    public int minDistance(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int [][]dp=new int[len1+1][len2+1];
        //初始化 最初到0删完即可，下同，因为有0 所以注意是《=len
        for(int i=0;i<=len1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=len2;j++){
            dp[0][j]=j;
        }
        for (int i=1;i<=len1;i++){
            for (int j=1;j<=len2;j++){
                //一样
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else {
                    //不一样就增 删 替 最小值+1
                    dp[i][j]=Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[len1][len2];

    }
    public  static  void main(String[] args){
        MinDistance minDistance=new MinDistance();
        String word1 = "horse", word2 = "ros";
        System.out.println(minDistance.minDistance(word1,word2));
    }

}

package daily;

public class PredictTheWinner {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/108334501
    public boolean PredictTheWinner(int[] nums) {
        int len=nums.length;
        int [][] dp=new int[len][len];
        for (int i=0;i<len;i++){
            dp[i][i]=nums[i];
        }

        for (int i=len-2;i>=0;i--){
            for (int j=i+1;j<len;j++){
                dp[i][j]=Math.max(nums[i]-dp[i+1][j],nums[j]-dp[i][j-1]);
            }
        }
        return dp[0][len-1]>=0;

    }

}

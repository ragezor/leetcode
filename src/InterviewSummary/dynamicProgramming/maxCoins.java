package InterviewSummary.dynamicProgramming;
/*
题干：
现在要求你戳破所有的气球。每当你戳破一个气球 i 时，你可以获得 nums[left] * nums[i] * nums[right] 个硬币。 这里的 left 和 right 代表和 i 相邻的两个气球的序号。注意当你戳破了气球 i 后，气球 left 和气球 right 就变成了相邻的气球。
求所能获得硬币的最大数量。
总结链接：https://blog.csdn.net/qq_43491066/article/details/104086674
想法：动态规划
设 动态规划数组 dp[m][n]：nums[m…n]区间内 能戳破气球获得的最大值
取 m < k < n，假设nums[k] 是最后一个戳破的气球，则dp[m][n] = Math.max(dp[m][k]+dp[k][n]+nums[m]*nums[k]*nums[n])；

 */

public class maxCoins {
    public int maxCoins(int[] nums) {
        int[] coins = new int[nums.length+2];
        int dp[][] = new int[coins.length][coins.length];
        coins[0] = 1;
        coins[coins.length-1]=1;

        for(int i=0;i<nums.length;i++){
            coins[i+1] = nums[i];
        }

        for(int i=2;i<coins.length;i++){
            for(int j=0;j+i<coins.length;j++){
                for(int k=j+1;k<j+i;k++){
                    dp[j][j+i] = Math.max(dp[j][j+i],dp[j][k]+dp[k][j+i]+coins[j]*coins[k]*coins[j+i]);
                }
            }
        }
        return dp[0][coins.length-1];
    }

}

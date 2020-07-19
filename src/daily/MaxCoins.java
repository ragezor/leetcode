package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107445637
public class MaxCoins {
    public int maxCoins(int[] nums) {
        int[] coins = new int[nums.length + 2];
        int dp[][] = new int[coins.length][coins.length];
        coins[0] = 1;
        coins[coins.length - 1] = 1;

        for (int i = 0; i < nums.length; i++) {
            coins[i + 1] = nums[i];
        }

        for (int i = 2; i < coins.length; i++) {
            for (int j = 0; j + i < coins.length; j++) {
                for (int k = j + 1; k < j + i; k++) {
                    dp[j][j + i] = Math.max(dp[j][j + i], dp[j][k] + dp[k][j + i] + coins[j] * coins[k] * coins[j + i]);
                }
            }
        }
        return dp[0][coins.length - 1];
    }

    public static  void main(String[] args){
        int[] nums={3,1,5,8};
        MaxCoins maxCoins=new MaxCoins();
        System.out.println(maxCoins.maxCoins(nums));
    }
}


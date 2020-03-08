package daily;



import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104728324
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
//maxAmount就是不可能的状态 和末尾的判断是否大于amount结合
        int maxAmount = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, maxAmount);
        //初始化0
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
//对每个面额进行尝试
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        if (dp[amount] > amount) {
            return -1;
        }
        return dp[amount];
    }

    public static  void  main(String[] args){
        CoinChange coinChange=new CoinChange();
        int [] test={1,2,5};
        int amount=11;
        System.out.println(coinChange.coinChange(test,amount));
    }
}

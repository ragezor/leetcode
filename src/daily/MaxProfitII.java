package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109555622
public class MaxProfitII {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return  0;
        }
        //dp[][0]表示当天结束后手里没有 dp[][1]表示今天卖后手里有
        int dp[][]=new  int[prices.length][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for ( int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);

        }
        return dp[prices.length-1][0];

    }
    //贪心
    public int maxProfit2(int[] prices) {
        if(prices.length==0){
            return  0;
        }
        int n=prices.length;
        int res=0;
        for (int i = 0; i <n-1 ; i++) {
            if(prices[i]<prices[i+1]){
                res+=-prices[i]+prices[i+1];
            }
        }
        return  res;
    }
}

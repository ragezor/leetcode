package InterviewSummary.dynamicProgramming;

public class coinChange {

        public int coinChange(int[] coins, int amount) {
            if(amount==0){return 0;}
            int[] dp=new int[amount+1];
            for(int i=1;i<=amount;i++){
                dp[i]=999999;
                for(int coin:coins){
                    if(i>=coin){
                        dp[i]=Math.min(dp[i-coin]+1,dp[i]);
                    }
                }
            }

            if(dp[amount]==999999){
                return -1;
            }
            else{
                return dp[amount];
            }}
    }



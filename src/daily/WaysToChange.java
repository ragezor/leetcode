package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105702710
public class WaysToChange {
    public int waysToChange(int n) {
        //dp[i][j]表示取coins前i个数组成总和为j的方法个数
        int[][] dp=new  int[4][n+1];
        int []coins={1,5,10,25};
        //初始条件 用一个都为1
        for(int i=0;i<=n;i++){
            dp[0][i]=1;
        }
        for(int j=0;j<4;j++){
            dp[j][0]=1;
        }
        for (int i=1;i<4;i++){
            for (int j=1;j<=n;j++){
                //边界条件 必须j比单个面值大才加
                if(j>=coins[i]) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - coins[i]])%1000000007;
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[3][n];

    }
    public static  void main(String[] args){
        WaysToChange ways=new WaysToChange();
        System.out.println(ways.waysToChange(929782));
    }
}

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106732234
public class ClimbStairs {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        if(n==0){
            return  0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return  dp[n];


    }
    public static  void  main(String[] args){
        ClimbStairs climbStairs=new ClimbStairs();
        System.out.println(climbStairs.climbStairs(3));
    }

}

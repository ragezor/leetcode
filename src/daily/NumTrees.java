package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107364684
public class NumTrees {
    public int numTrees(int n) {
        int [] dp=new int[n+1];
        dp[0]=dp[1]=1;

        for (int i=2;i<=n;i++){
            for (int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }

        return  dp[n];
    }

    public static  void  main(String[] args){
        NumTrees numTrees=new NumTrees();
        System.out.println(numTrees.numTrees(3));
    }
}

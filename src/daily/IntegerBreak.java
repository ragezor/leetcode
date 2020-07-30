package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107682803
public class IntegerBreak {
    public int integerBreak(int n) {
     int []dp=new int[n+1];

     for (int i=2;i<=n;i++){
         int max=0;
         for (int j=1;j<i;j++){
             max=Math.max(max,Math.max(j*(i-j),j*dp[i-j]));
         }
         dp[i]=max;
     }
     return  dp[n];
    }

    public  static  void main(String[] args){
        IntegerBreak integerBreak=new IntegerBreak();
        System.out.println(integerBreak.integerBreak(10));
    }
}

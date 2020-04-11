package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105448435
public class SuperEggDrop {
        public int superEggDrop(int K, int N) {
            //一动一次只能1
            if (N == 1) {
                return 1;
            }
            int[][] dp = new int[N + 1][K + 1];
            //移动一次只能1
            for (int i = 1; i <= K; ++i) {
                dp[1][i] = 1;
            }
            int res=-1;
            //遍历所以找到超过的
            for (int i = 2; i <= N; ++i) {
                for (int j = 1; j <= K; ++j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1] + dp[i - 1][j];
                    if(dp[i][j]>=N){
                        res=i;
                        break;
                    }
                }
            }
            return res;
        }
        public static  void main(String[] args){
            SuperEggDrop superEggDrop=new SuperEggDrop();
            System.out.println(superEggDrop.superEggDrop(1,2));
        }

}

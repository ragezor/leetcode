package interviewsummary.others;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102733874
public class superEggDrop {

        /*
        若测试k次，能够确定结果的最大测量楼层范围为[0,dp[k][m]]，则称dp[k][m]为最大测量楼层，则问题就是就是找到一个最小的m使得dp[k][m]>=N
        转移方程dp[k][m] = dp[k-1][m-1] + dp[k][m-1] + 1
        原因：假设第一次是在X层测试，
                若碎了，则F<X,需要测试它下面的楼层，蛋的数量和次数减少1，它的最大测量楼层为dp[k-1][m-1],还需要测试的楼层范围为[0,X-1]
                若没碎，则F>=X,需要测试它上面的楼层，蛋的数量不变，次数减少1，它的最大测量楼层为dp[k][m-1],还需要测试的楼层范围为[X,dp[k][m]]
            若想达到最大测量层数，则分开的两个区间的长度都应该达到最大测量楼层+1。即X-1 = dp[k-1][m-1]，dp[k][m] - X = dp[k][m-1]
            化去X，得到dp[k][m] = dp[k-1][m-1] + dp[k][m-1] + 1
        注意左侧都是m，右侧都是m-1，可以只使用一列存储数据，K从大到小进行更新
        */
        public int superEggDrop(int K, int N) {
            int[] dp = new int[K+1]; //int型会自动初始化为0
            int m = 0;
            //从底层开始找
            while (dp[K]<N){
                m++;
                for (int i = K; i >= 1; i--)
                {
                    dp[i] = dp[i] + dp[i-1] +1;
                }
            }
            return m;
        }
    }




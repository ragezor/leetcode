package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107150543
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid[0] == null) {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            //第一列 没障碍物就只有一条路
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            //第一行
            if (obstacleGrid[0][j] == 1) {
                break;
            }
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //位置上有障碍物，不能通往它
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    //动态规划
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }



    public static  void main(String[] args){
        UniquePathsWithObstacles uniquePathsWithObstacles=new UniquePathsWithObstacles();
        int [][] nums={
                {0,0,0},
                {0,1,0},
                {0,0,0}
    };
        System.out.println( uniquePathsWithObstacles.uniquePathsWithObstacles(nums));
    }


}

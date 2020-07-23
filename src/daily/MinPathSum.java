package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107529911
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        //第一列，都是从上一行向下达到的
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        //第一行，都是从上一列向右达到的
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
//正常动态规划
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    public static  void main(String[] args){
        MinPathSum minPathSum=new MinPathSum();
        int[][]grid={
                {1,3,1},
                {1,5,1},
                {4,2,1}
    };

        System.out.println(minPathSum.minPathSum(grid));
    }

}

package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107295437
public class CalculateMinimumHP {
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; ++i) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[n][m - 1] = dp[n - 1][m] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = Math.max(Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j], 1);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] test = {{-2, -3, 3}, {-5, -10, 1, 10, 30, -5}};
        CalculateMinimumHP calculateMinimumHP = new CalculateMinimumHP();
        System.out.println(calculateMinimumHP.calculateMinimumHP(test));
    }

}

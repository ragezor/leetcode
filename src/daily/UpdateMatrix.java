package daily;
import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105530512
public class UpdateMatrix {
    public int[][] updateMatrix(int[][] matrix) {
        //0处理
        if (matrix == null || matrix.length == 0) {
            return null;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        //初始化 0为0 其余的为最大值
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = 10001;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i - 1 >= 0) {
                    //上
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                }
                if (j - 1 >= 0) {
                    //左
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i <= m - 2) {
                    //下
                    dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
                }
                if (j <= n - 2) {
                    //右
                    dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                }

            }
        }
        return dp;

    }

    public static void main(String[] args) {
        UpdateMatrix updateMatrix = new UpdateMatrix();
        int[][] test1 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] res = updateMatrix.updateMatrix(test1);
        for (int[] tem:res
             ) {
            System.out.println(Arrays.toString(tem));

        }
    }
}

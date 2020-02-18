package bytedance.dynamicplanning_greed;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/104372778
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        //res表示最长边长
        int res = 0;
        if (matrix.length == 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i + 1][j], dp[i][j + 1]), dp[i][j]) + 1;
                    res = Math.max(res, dp[i + 1][j + 1]);
                }
            }
        }
        return res * res;
    }


    public static void main(String[] args) {
        MaximalSquare m1 = new MaximalSquare();
        char[][] test = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println("最大正方形的面积为" + m1.maximalSquare(test));
    }
}

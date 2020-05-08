package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105990058
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return max;
        }
        int r = matrix.length, c = matrix[0].length;
        int[][] dp = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                        max = Math.max(dp[i][j], max);
                    }

                }

            }
        }
        return max * max;

    }

    public static void main(String[] args) {
        MaximalSquare maximalSquare = new MaximalSquare();
        char[][] matrix = {{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};

        System.out.println(maximalSquare.maximalSquare(matrix));


    }
}

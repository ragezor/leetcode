package interviewsummary.array_test;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/103815617
 */
public class gameOfLife {

    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        final int[] dx = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
        final int[] dy = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < 8; k++) {
                    //计算周围八个细胞的存活情况
                    if (((i + dx[k]) >= 0) && ((i + dx[k]) < m) &&
                            ((j + dy[k]) >= 0) && ((j + dy[k]) < n) &&
                            ((board[i + dx[k]][j + dy[k]] == 1) || ((board[i + dx[k]][j + dy[k]] == 3)))) {
                        sum = sum + 1;
                    }
                }
                if (board[i][j] == 1) {
                    if (sum < 2 || sum > 3) //此情况下，存活的细胞死亡
                        board[i][j] = 3;
                } else {
                    if (sum == 3)  //此情况下，死亡的细胞复活
                        board[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2)
                    board[i][j] = 1;
                else if (board[i][j] == 3)
                    board[i][j] = 0;
            }
        }
    }
}




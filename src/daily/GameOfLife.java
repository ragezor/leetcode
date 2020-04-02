package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105270925
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        //方向
        int[] dx = {1, 1, 1, -1, -1, -1, 0, 0};
        int[] dy = {1, -1, 0, 1, -1, 0, 1, -1};
        int x, y;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //记录周围活细胞数量
                int sum = 0;
                for (int k = 0; k < 8; k++) {
                    x = i + dx[k];
                    y = j + dy[k];
                    //注意边界
                    if (x >= 0 && x < m && y >= 0 && y < n && ((board[x][y] == 1) || board[x][y] == 3)) {
                        sum++;
                    }
                }
                if (board[i][j] == 1) {
                    //除了23的都变死
                    if (sum < 2 || sum > 3) {
                        board[i][j] = 3;
                    }
                } else {
                    //三个的复活
                    if (sum == 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }
//再更改一遍
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
                else if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
            }
        }

    }

    public  static  void main(String[] args){
        GameOfLife gameOfLife=new GameOfLife();
        int [][]test={{0,1,0},
                      {0,0,1},
                      {1,1,1},
                      {0,0,0}};

        gameOfLife.gameOfLife(test);
        for (int [] res:test
             ) {
            System.out.println(Arrays.toString(res));

        }
    }
}

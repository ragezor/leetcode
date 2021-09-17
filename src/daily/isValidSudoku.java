package daily;

public class isValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] row=new int[9][9];
        int[][] column=new int[9][9];
        int[][][] sub=new int[3][3][9];
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                char tem=board[i][j];
                if (tem != '.') {
                    int index=tem-'0'-1;
                    row[i][index]++;
                    column[j][index]++;
                    sub[i/3][j/3][index]++;
                    if (row[i][index] > 1 || column[j][index] > 1 || sub[i / 3][j / 3][index] > 1) {
                        return false;
                    }

                }

            }
        }
        return  true;
    }
}

package daily;

public class Solve {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/107928412
    public void solve(char[][] board) {

        if(board==null||board.length==0){
            return;
        }
        int m=board.length;
        int n=board[0].length;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                boolean isEdge=(i==0||j==0||i==m-1||j==n-1);
                if(isEdge&&board[i][j]=='O'){//边界的'O'
                    helper(board,i,j,m,n);//递归
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){//除了边界的'O'替换
                    board[i][j]='X';
                }
                if(board[i][j]=='*'){//边界的'O'再换回来
                    board[i][j]='O';
                }
            }
        }


    }

    public  void helper(char[][]board,int i,int j,int m,int n){
        if(i<0||j<0||i>=m||j>=n||board[i][j]=='X'||board[i][j]=='*'){
            return;
        }
        board[i][j]='*';
        helper(board,i+1,j,m,n);
        helper(board,i-1,j,m,n);
        helper(board,i,j+1,m,n);
        helper(board,i,j-1,m,n);
    }

}

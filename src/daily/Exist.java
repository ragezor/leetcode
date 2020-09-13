package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108558491
public class Exist {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = find(board, word, visited, i,j, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(char[][] board,String word,boolean[][]flag,int i,int j,int index){
        int cl=board.length;
        int rl=board[0].length;
        if(word.length()==index)//每个字符都被判断了
            return true;
        if(i<0||i>=cl||j>=rl||j<0)//越界
            return false;
        if(flag[i][j]||word.charAt(index)!=board[i][j])//被访问过或者不匹配
            return false;
        flag[i][j]=true;//访问了
        boolean judge=find(board,word,flag,i-1,j,index+1)||find(board,word,flag,i+1,j,index+1)||find(board,word,flag,i,j-1,index+1)||find(board,word,flag,i,j+1,index+1);//上下左右再查找
        flag[i][j]=false; // 重载字符访问状态
        return judge;

    }
}

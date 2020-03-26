package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105121185
public class NumRookCaptures {
    public int numRookCaptures(char[][] board) {
        //上下左右四个方向
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        //计数
        int count=0;
        for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                //找到车
                if(board[i][j]=='R'){
                    for(int k=0;k<4;k++){
                        int x=i,y=j;
                        while (true){
                            x+=dx[k];
                            y+=dy[k];
                            //注意边界判断
                            if(x<0||y<0||x>=8||y>=8||board[x][y]=='B'){
                                break;
                            }
                            if(board[x][y]=='p'){
                                count++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return  count;

    }
    public  static  void  main(String[] args){
        NumRookCaptures numRookCaptures=new NumRookCaptures();
        char[][] test= {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        System.out.println(numRookCaptures.numRookCaptures(test));

    }
}

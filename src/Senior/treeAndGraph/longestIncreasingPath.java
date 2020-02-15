package Senior.treeAndGraph;
//总结地址
public class longestIncreasingPath {

        public int longestIncreasingPath(int[][] matrix) {
            //空处理
            if(matrix ==null||matrix.length==0||matrix[0].length==0){
                return 0;
            }


            int max=0;
            int row=matrix.length;
            int col=matrix[0].length;
            int[][] dp=new int[row][col];//记录这个点出发递增最长路径

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    max=Math.max(max,dfs(matrix,dp,row,col,i,j));//递归遍历每个点
                }
            }
            return max;
        }

        private int [][] paths={{0,1},{0,-1},{1,0},{-1,0}};//对应四个方向，避免多重if

        private  int dfs(int[][] matrix,int [][] dp,int row,int col,int i,int j){
            if(dp[i][j]>0){//处理过就别处理了
                return dp[i][j];
            }
            int max=1;
            for(int[] path:paths){//四个方向
                int x=i+path[0];
                int y=j+path[1];

                if(x>=0&&x<row&&y>=0&&y<col&&matrix[x][y]>matrix[i][j]){
                    int len=dfs(matrix,dp,row,col,x,y)+1;//下一个点
                    max=Math.max(max,len);//找大的
                }
            }
            dp[i][j]=max;
            return max;
        }
    }




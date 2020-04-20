package daily;

public class NumIslands {
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105628929
    private void dfs(char[][] grid,int x,int y){
        //边界条件或者为'0'，注意是'0'不是整数
            if(x<0||y<0||x>=grid.length||y>=grid[0].length||grid[x][y]=='0'){
                return;
            }
            //否则就是1 ，将它置为'0'
            grid[x][y]='0';
            //四个方向
            dfs(grid,x+1,y);
            dfs(grid,x-1,y);
            dfs(grid,x,y+1);
            dfs(grid,x,y-1);

        }
        public int numIslands(char[][] grid) {
        //count用来计数
            int count=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    //每一个1，++，然后递归变0
                    if(grid[i][j]=='1'){
                        count++;
                        dfs(grid,i,j);
                    }
                }
            }
            return  count;

    }

    public static  void main(String [] args){
        NumIslands numIslands=new NumIslands();
        char [][]grid={{'1','1','1','1','0'},
                       {'1','1','0','1','0'},
                       {'1','1','0','0','0'},
                       {'0','0','0','0','0'}};

        System.out.println(numIslands.numIslands(grid));
    }
}

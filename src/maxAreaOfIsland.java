public class maxAreaOfIsland {
    /*
    *这道题递归加一个动态规划即可
    * 注意边界处理就很简单
    * 也要注意递归时 处理过的点置为0
    */
        public  int maxAreaOfIsland(int[][] grid) {
            int maxarea=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        maxarea=Math.max(maxarea,count(grid,i,j));
                    }
                }

            }
            return maxarea;
        }
        public int count(int[][]grid,int i,int j){
            if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0){
                return 0;
            }
            else{
                grid[i][j]=0;
                return 1+count(grid,i-1,j)+count(grid,i+1,j)+count(grid,i,j-1)+count(grid,i,j+1);
            }
        }
     public static  void main(String[] args) {
         int[][] grid1 = {{1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}};

         System.out.println("这个岛屿为:");
         for (int i = 0; i < grid1.length; ++i) {
             for (int j = 0; j < grid1[0].length; ++j) {
                 System.out.print(grid1[i][j]);
             }
             System.out.println("\n");
         }
         maxAreaOfIsland max1 = new maxAreaOfIsland();
         int res = max1.maxAreaOfIsland(grid1);
         System.out.println("它岛屿的最大面积为："+res);;

     }
}


package bytedance.array_search;
/*
题干
给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。
找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)

示例 1:
[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
对于上面这个给定矩阵应返回 6。注意答案不应该是11，因为岛屿只能包含水平或垂直的四个方向的‘1’。

示例 2:

[[0,0,0,0,0,0,0,0]]
对于上面这个给定的矩阵, 返回 0。

 想法：

    *这道题递归加一个动态规划即可
    * 注意边界处理就很简单
    * 也要注意递归时 处理过的点置为0
    *总结地址https://blog.csdn.net/qq_43491066/article/details/104293143
    */


public class maxAreaOfIsland {

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


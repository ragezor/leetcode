package daily;

import java.util.ArrayDeque;
import java.util.Queue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105180434
public class MaxDistance {
    public int maxDistance(int[][] grid) {
        //实现四个方向
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        Queue<int[]> queue=new ArrayDeque<>();
        int m=grid.length;
        int n=grid[0].length;
        //陆地入队
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        //ocean用来确定有没有海洋
        boolean ocean=false;
        int[] tem=null;
        // 从各个陆地开始，一圈一圈的遍历海洋，最后遍历到的海洋就是离陆地最远的海洋。
        while(!queue.isEmpty()){
            tem=queue.poll();
            int x=tem[0],y=tem[1];
            for(int k=0;k<4;k++){
                int newX=x+dx[k];
                int newY=y+dy[k];
                if (newX < 0 || newX >= m || newY < 0 || newY >= n || grid[newX][newY] != 0) {
                    continue;
                }
                grid[newX][newY]=grid[x][y]+1;
                ocean=true;
                queue.offer(new int []{newX,newY});
            }



        }
        if(tem==null||!ocean){
            return -1;
        } // 返回最后一次遍历到的海洋的距离。
        return grid[tem[0]][tem[1]] - 1;
    }

    public static  void main(String[] args){
        MaxDistance maxDistance=new MaxDistance();
        int[][]test={{1,0,1},{0,0,0},{1,0,1}};
        System.out.println(maxDistance.maxDistance(test));
    }
}

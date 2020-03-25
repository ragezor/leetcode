package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105090384
public class SurfaceArea {
    public int surfaceArea(int[][] grid) {
        int n=grid.length;
        //正方体数量
        int cubeNum=0;
        //面数量
        int face=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    //记录正方体数量
                    cubeNum+=grid[i][j];
                    // 面数量
                    face+=grid[i][j]-1;
                }
                if(i>0){
                    //侧面数量 下同
                    face+=Math.min(grid[i][j],grid[i-1][j]);
                }
                if(j>0){
                    face+=Math.min(grid[i][j-1],grid[i][j]);
                }

            }
        }
        return  cubeNum*6-face*2;
    }

    public  static  void main(String [] args){
        SurfaceArea surfaceArea= new SurfaceArea();
        int [][]test={{1,1,1},{1,0,1},{1,1,1}};
        int res=surfaceArea.surfaceArea(test);
        System.out.println(res);

    }
}
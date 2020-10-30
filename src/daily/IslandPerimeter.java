package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109378180
public class IslandPerimeter {
    static  int[] x = {0, -1, 0, 1};
    static  int[] y = {1, 0, -1, 0};

    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int tem = 0;
                    for (int k = 0; k < 4; k++) {
                        int tx = i+x[k];
                        int ty = j+y[k];

                        if (tx < 0 || tx >= m || ty < 0 || ty >= n || grid[tx][ty]==0) {
                            tem+=1;
                        }

                    }
                    ans += tem;

                }
            }
        }
        return ans;
    }

    public static  void main(String[] args){
        IslandPerimeter islandPerimeter=new IslandPerimeter();
        int [][]is={{0,1,0,0},
                {1,1,1,0},
        {0,1,0,0},
        {1,1,0,0}};
        System.out.println(islandPerimeter.islandPerimeter(is));
    }

}

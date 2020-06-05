package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106564721
public class SpiralOrder {

    public int[] spiralOrder(int[][] matrix) {
//空处理
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        //行，列，总数
        int row = matrix.length;
        int col = matrix[0].length;
        int total = row * col;
        //存结果
        int[] res = new int[total];
        //记录访问
        boolean[][] visited = new boolean[row][col];
        int x = 0, y = 0, flag = 0, direct = 0;
        while (x >= 0 && y >= 0 && x < row && y < col) {
            //访问过
            if (visited[x][y]) {
                break;
            }
            //放入数组
            res[flag] = matrix[x][y];
            //数组下标++
            flag = flag + 1;
            //更新访问情况
            visited[x][y] = true;

            switch (direct) {

                case 0:
                    //最右边或者马上到新边界
                    if (y == col - 1 || visited[x][y + 1]) {
                        //向下
                        x++;
                        direct = 1;
                    } else {
                        //否则向右
                        y++;
                    }
                    break;


                case 1:
                    if (x == row - 1 || visited[x + 1][y]) {
                        y--;
                        direct = 2;
                    } else {
                        x++;
                    }
                    break;

                case 2:
                    if (y == 0 || visited[x][y - 1]) {
                        x--;
                        direct = 3;
                    } else {
                        y--;
                    }
                    break;

                case 3:
                    if (x == 0 || visited[x - 1][y]) {
                        y++;
                        direct = 0;
                    } else {
                        x--;
                    }
                    break;


            }
        }


        return res;

    }


    public static void main(String[] args) {
        SpiralOrder spiralOrder = new SpiralOrder();
        int[][] nums = {{1}};
        int[] res = spiralOrder.spiralOrder(nums);
        System.out.println(Arrays.toString(res));

    }
}

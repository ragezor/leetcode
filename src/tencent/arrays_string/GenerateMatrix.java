package tencent.arrays_string;
//总结地址https://blog.csdn.net/qq_43491066/article/details/104474616
public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        /*
         * @Description:
         * @Author: ragezor
         * @Date: 2020/2/24 11:35 上午
         * @Param [n] 
         * @return int[][]
         * x,y对应矩阵坐标
         * res用来存储这个矩阵
         * flag用来记录已经访问过的点
         * direct 0123对应方向右下左上
         * tem用来存储从1到n*n的数
         **/
        int x = 0;
        int y = 0;
        boolean[][] flag = new boolean[n][n];
        int[][] res = new int[n][n];
        //0123 右下左上
        int direct = 0;
        int tem = 1;
        while (x >= 0 && y >= 0 && x < n && y < n) {
            if (flag[x][y]) {
                break;
            }
            res[x][y] = tem;
            tem++;
            flag[x][y] = true;
            switch (direct) {
                case 0:
                    if (y == n - 1 || flag[x][y + 1]) {//走到右边界，注意有新的右边界
                        x++;//就向下走一步，并且改变方向
                        direct = 1;
                    } else {
                        y++;
                    }
                    break;


                case 1:
                    if (x == n - 1 || flag[x + 1][y]) {//走到下边界注意有新的下边界
                        y--;
                        direct = 2;
                    } else {
                        x++;
                    }
                    break;


                case 2:
                    if (y == 0 || flag[x][y - 1]) {//走到左边界注意有新的左边界
                        x--;//向上走
                        direct = 3;
                    } else {
                        y--;
                    }
                    break;

                case 3:
                    if (x == 0 || flag[x - 1][y]) {
                        y++; //如果向上走到头就右走
                        direct = 0;
                    } else {
                        x--;
                    } //向上走
                    break;


            }
        }

        return res;
    }
    public  static  void main(String []args){
        GenerateMatrix generateMatrix=new GenerateMatrix();

        int[][] test=generateMatrix.generateMatrix(2);
        for(int i=0;i<2;i++){
            System.out.print("\n");
            for (int j=0;j<2;j++){
                System.out.print(test[i][j]);

            }
        }

    }


}

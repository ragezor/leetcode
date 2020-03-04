package daily;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104649361
public class OrangesRotting {
    //pos记录这个橘子的位置和时间
    class Pos {
        int x, y, time;

        public Pos(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        //行
        int r = grid.length;
        //列
        int c = grid[0].length;
        //时间
        int time = 0;
        //待腐烂🍊个数
        int count = 0;
        //便于方向
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        //队列存橘子位置
        Queue<Pos> queue = new LinkedList<>();
        //得到count和坏橘子放入队列
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
                if (grid[i][j] == 2) {
                    queue.add(new Pos(i, j, time));
                }
            }
        }
        //出队列
        while (!queue.isEmpty()) {
            Pos pos = queue.poll();
            time = pos.time;
            for (int k = 0; k < 4; k++) {   //一个腐烂，四周受害
                int newX = pos.x + direction[k][0];
                int newY = pos.y + direction[k][1];
                if (newX >= 0 && newX < r && newY >= 0 && newY < c && grid[newX][newY] == 1) {
                    grid[newX][newY] = 2;  //标记腐烂
                    count--;
                    queue.add(new Pos(newX, newY, pos.time + 1)); //腐烂周期+1
                }
            }
        }


        if (count == 0) {
            //都腐烂
            return time;
        } else {
            return -1;
        }
    }

    public void printt(int[][] test, OrangesRotting orangesRotting) {
        /*
         * @Description:打印矩阵并返回腐烂时间
         * @Author: ragezor
         * @Date: 2020/3/4 11:29 上午
         * @Param [test, orangesRotting]
         * @return void
         **/
        System.out.println("矩阵为：");
        int minute = orangesRotting.orangesRotting(test);
        for (int[] ints : test) {
            System.out.println(Arrays.toString(ints));
        }
        if (minute == -1) {
            System.out.println("该矩阵有橘子永不腐烂");
        } else {
            System.out.println("该矩阵腐烂最短时间是" + minute);
        }


    }


    public static void main(String[] args) {
        OrangesRotting orangesRotting = new OrangesRotting();
        int[][] test1 = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] test2 = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int[][] test3 = {{0, 2}};
        //System.out.println("该矩阵腐烂最短时间是" + orangesRotting.orangesRotting(test1));
        orangesRotting.printt(test1, orangesRotting);
        orangesRotting.printt(test2, orangesRotting);
        orangesRotting.printt(test3,orangesRotting);


    }
}


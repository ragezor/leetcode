package Exam;

import java.util.Scanner;

public class Matrix {
    public static  void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        scanner.close();
        int [][] res=new int[n][m];
            int x = 0;
            int y = 0;
            boolean[][] flag = new boolean[n][m];
            //0123 右下左上
            int direct = 0;
            int trm = 1;
            while (x >= 0 && y >= 0 && x < n && y < m) {
                if (flag[x][y]) {
                    break;
                }
                res[x][y] = trm;
                trm++;
                flag[x][y] = true;
                switch (direct) {
                    case 0:
                        if (y == m - 1 || flag[x][y + 1]) {//走到右边界，注意有新的右边界
                            x++;//就向下走一步，并且改变方向
                            direct = 1;
                        } else {
                            y++;
                        }
                        break;


                    case 1:
                        if (x ==n - 1 || flag[x + 1][y]) {//走到下边界注意有新的下边界
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


        System.out.println(res[r-1][c-1]);

        }



       }

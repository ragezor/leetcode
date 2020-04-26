package Exam;


import java.util.Scanner;
import java.util.Arrays;


public class Main {
    static class Node {
        int x;
        int y;
        int h;
    }

    public static void main(String[] args) {
        //输入
        Node[] nodes = new Node[1002];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            nodes[i]=new Node();
            nodes[i].x = sc.nextInt();
            nodes[i].y = sc.nextInt();
            nodes[i].h = sc.nextInt();
        }
        sc.close();
        //初始化数组
        double[][] map = new double[n + 2][n + 2];
        double[] mins = new double[n + 2];	//这个最后是用来保存最小值的
        double MAX = 0x7f7f7f7f;
        for (int i = 0; i <= n+1; i++) {
            for (int j = 0; j <=n+1; j++) {


                map[i][j]=MAX;

            }
            mins[i] = MAX;
        }
        //先找到每个值的最短路

        for (int i = 1; i <= n-1; i++) {
            for (int j = i + 1; j <= n; j++) {
                double	x = (nodes[i].x - nodes[j].x) * (nodes[i].x - nodes[j].x);
                double	y = (nodes[i].y - nodes[j].y) * (nodes[i].y - nodes[j].y);
                double	h = (nodes[i].h - nodes[j].h) * (nodes[i].h - nodes[j].h);
                double temp=Math.sqrt(x+y)+h;
                map[i][j]=Math.min(map[i][j],temp );
                map[j][i]=map[i][j];
            }
        }
        //然后图算法公式
        boolean[] vis = new boolean[n+2];
        mins[1]=0;
        for (int i = 1; i <n; i++) {
            int tempX=0;
            for (int j = 1; j <=n; j++) {
                if(!vis[j] &&(tempX==0|| mins[j]<mins[tempX])){
                    tempX=j;
                }
            }
            vis[tempX]=true;
            for (int j = 1; j <=n; j++) {
                if(!vis[j]){
                    mins[j]=Math.min(mins[j], map[tempX][j]);
                }
            }
        }
        double result=0.0;
        for (int i = 2; i <=n; i++) {
            result+=mins[i];
        }
        System.out.println(String.format("%.2f", result));
    }


}




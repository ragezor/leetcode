package Exam;
import  java.util.Scanner;
public class Tree {
    static  class  Node{
        int x,y,r;
    }
    static  boolean[] vis=new boolean[31];
    static  boolean[][] bool=new  boolean[31][31];
    static  Node[]node=new Node[31];
    static int n = 0;
    static int max = -1;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            node[i] = new Node();
            node[i].x = sc.nextInt();
            node[i].y = sc.nextInt();
            node[i].r = sc.nextInt();
        }
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                bool[i][j] = ((node[i].x-node[j].x)*(node[i].x-node[j].x) + (node[i].y-node[j].y)
                        *(node[i].y-node[j].y) > (node[i].r+node[j].r)*(node[i].r+node[j].r));
                bool[j][i] = bool[i][j];
            }
        }
        dfs(1);
        System.out.println(max);
    }

    private static void dfs(int step){
        if(step > n){
            int sum = 0;
            for(int i=1;i<=n;i++){
                if(vis[i]){
                    sum += (node[i].r * node[i].r);
                }
            }
            max = Math.max(sum, max);
            return;
        }
        vis[step] = false;
        dfs(step + 1);

        //下面是左剪枝，就是说前面结点选中且当前结点与前面结点有冲突的时候，当前结点不应该被选择，后面的就不应该继续执行
        for (int i = 1; i < step; i++) {
            if (vis[i] && !bool[i][step]) {
                return;
            }
        }
        vis[step] = true;
        dfs(step + 1);
    }
}




package daily;

public class MovingCount {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/105384507
    public int movingCount(int m, int n, int k) {
        //记录是否访问过
        boolean[][] visited=new boolean[m][n];
        return  dfs(0,0,m,n,k,visited);
    }
    public  int dfs(int x,int y,int m,int n,int k,boolean[][] visited){
        //边界或者大于k或者访问过
        if(x>=m||x<0||y>=n||y<0||sum(x,y)>k||visited[x][y]){
            return 0;
        }
        visited[x][y]=true;
        //四个方向 其实两个就可以
        return 1+dfs(x+1,y,m,n,k,visited)+dfs(x-1,y,m,n,k,visited)+dfs(x,y+1,m,n,k,visited)+dfs(x,y-1,m,n,k,visited);
    }

    public int sum(int x,int y){
        return  x/100+y/100+x%10+y%10+x/10+y/10;
    }

    public static  void main(String[] args){
        MovingCount movingCount=new MovingCount();
        System.out.println(movingCount.movingCount(2,3,1));
        System.out.println(movingCount.movingCount(3,1,0));
    }
}

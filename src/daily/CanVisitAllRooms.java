package daily;

import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108314969
public class CanVisitAllRooms {
    int num;
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        num=0;
        visited=new boolean[n];
        dfs(rooms,0);
        return  num==n;

    }

    public void dfs(List<List<Integer>> rooms,int n){
        num++;
        visited[n]=true;
        for (int tem:rooms.get(n)
             ) {
            if(!visited[tem]){
                dfs(rooms,tem);
            }


        }
    }


}

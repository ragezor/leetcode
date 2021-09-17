package daily;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AllPathsSourceTarget {
    List<List<Integer>> ans=new ArrayList<>();
    Deque<Integer> stack=new LinkedList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.addLast(0);
        dfs(graph,0,graph.length-1);
        return  ans;

    }

    public   void dfs (int[][] graph ,int x,int n){
        if(x==n){
            ans.add(new ArrayList<>(stack));
        }

        for (int y : graph[x]) {
            stack.offerLast(y);
            dfs(graph, y, n);
            stack.pollLast();
        }

    }
}

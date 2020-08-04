package daily;

import java.util.*;

public class CanFinish {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/107779378
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        boolean flag = false;
        int[] indegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int des = prerequisites[i][0];
            int src = prerequisites[i][1];
            List<Integer> lst = adj.getOrDefault(src, new ArrayList<Integer>());
            lst.add(des);
            adj.put(src, lst);
            indegree[des]++;

        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int i = 0;
        while (!q.isEmpty()) {
            int node = q.remove();
            i++;
            if (adj.containsKey(node)) {

                for (Integer neighbor : adj.get(node)) {
                    indegree[neighbor]--;
                    if (indegree[neighbor] == 0) {
                        q.add(neighbor);
                    }
                }
            }
        }
        if (i == numCourses) {
            flag = true;
        }
        return flag;

    }

    public static  void main(String[] args){
        CanFinish canFinish=new CanFinish();
        int[][] nums={{1,0}};
        System.out.println(canFinish.canFinish(2,nums));
    }
}

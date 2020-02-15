package Senior.treeAndGraph;
import  java.util.*;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/104028623
 */
public class findOrder {

        public int[] findOrder(int numCourses, int[][] prerequisites) {


            Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
            int[] indegree = new int[numCourses];
            int[] topologicalOrder = new int[numCourses];

            // 邻接表的创建
            for (int i = 0; i < prerequisites.length; i++) {
                int dest = prerequisites[i][0];
                int src = prerequisites[i][1];
                List<Integer> lst = adjList.getOrDefault(src, new ArrayList<Integer>());
                lst.add(dest);
                adjList.put(src, lst);

                // 记录入度
                indegree[dest] += 1;
            }

            // 入度为0的入队列
            Queue<Integer> q = new LinkedList<Integer>();
            for (int i = 0; i < numCourses; i++) {
                if (indegree[i] == 0) {
                    q.add(i);
                }
            }

            int i = 0;
            // 知道q为空
            while (!q.isEmpty()) {
                int node = q.remove();
                topologicalOrder[i++] = node;

                // 入度--
                if (adjList.containsKey(node)) {
                    for (Integer neighbor : adjList.get(node)) {
                        indegree[neighbor]--;

                        // If in-degree of a neighbor becomes 0, add it to the Q
                        if (indegree[neighbor] == 0) {
                            q.add(neighbor);
                        }
                    }
                }
            }

            // 查看是否上了所有课
            if (i == numCourses) {
                return topologicalOrder;
            }

            return new int[0];
        }
    }




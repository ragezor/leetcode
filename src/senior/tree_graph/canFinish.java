package senior.tree_graph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103569882
import  java.util.*;
public class canFinish {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            // 初始化图
            Map<Integer, List<Integer>> map = new HashMap<>();
            // 存储每个结点的入度
            int[] indegree = new int[numCourses];
            for (int i = 0; i < prerequisites.length; i++) {
                int second = prerequisites[i][0];
                int first = prerequisites[i][1];
                if (!map.containsKey(first))
                    map.put(first, new ArrayList<>());
                map.get(first).add(second);
                // 入度加一，从first->second
                indegree[second]++;
            }
            // 存储所有入度为0的结点
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < numCourses; i++) {
                if (indegree[i] == 0)
                    q.offer(i);
            }
            // 用来计算拓扑排序的结点个数
            int count = 0;
            while (!q.isEmpty()) {
                // 获取第一格入度为0的结点
                int val = q.poll();
                count++;
                // 判断很关键
                if (!map.containsKey(val))
                    continue;
                // 获取val的临结点
                List<Integer> tmp = map.get(val);
                for (int i = 0; i < tmp.size(); i++) {
                    // 把所有的以val为开头的入度减一
                    int idx = tmp.get(i);
                    indegree[idx]--;
                    // 如果入度为0，则把该结点加入队列中
                    if (indegree[idx] == 0)
                        q.offer(idx);
                }
            }
            return count == numCourses;
        }





}


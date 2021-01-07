package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/112333049
public class FindCircleNum {

        public int findCircleNum(int[][] isConnected) {
            int provinces = isConnected.length;
            boolean[] visited = new boolean[provinces];
            int circles = 0;
            for (int i = 0; i < provinces; i++) {
                if (!visited[i]) {
                    dfs(isConnected, visited, provinces, i);
                    circles++;
                }
            }
            return circles;
        }

        public void dfs(int[][] isConnected, boolean[] visited, int provinces, int i) {
            for (int j = 0; j < provinces; j++) {
                if (isConnected[i][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    dfs(isConnected, visited, provinces, j);
                }
            }
        }
    }


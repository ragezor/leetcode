package mid.tree_graph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102851344
public class numIslands {

        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }

            int rows = grid.length;
            int cols = grid[0].length;
            int count = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // 注意char
                    if (grid[i][j] == '1') {
                        count++;
                        dfsSearch(grid, i, j, rows, cols);
                    }
                }
            }

            return count;
        }

        // 每遇到'1'后, 开始向四个方向 递归搜索. 搜到后变为'0',
        // 因为相邻的属于一个island. 然后开始继续找下一个'1'.
        private void dfsSearch(char[][] grid, int i, int j, int rows, int cols) {
            if (i < 0 || i >= rows || j < 0 || j >= cols) {
                return;
            }

            if (grid[i][j] != '1') {
                return;
            }

            grid[i][j] = '0';
            dfsSearch(grid, i + 1, j, rows, cols);
            dfsSearch(grid, i - 1, j, rows, cols);
            dfsSearch(grid, i, j + 1, rows, cols);
            dfsSearch(grid, i, j - 1, rows, cols);
        }
    }




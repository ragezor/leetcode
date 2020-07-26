package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107588959
public class LongestIncreasingPath {
    public int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int rows, columns;


    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        rows = matrix.length;
        columns = matrix[0].length;
        int ans = 0;
        int[][] memo = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = -0; j < columns; j++) {
                ans = Math.max(ans, dfs(matrix, i, j, memo));
            }
        }
        return ans;
    }

    public int dfs(int[][] matrix, int row, int column, int[][] memo) {
        if (memo[row][column] != 0) {
            return memo[row][column];
        }
        memo[row][column] = 1;
        for (int[] dir : dirs) {
            int newRow = row + dir[0], newColumn = column + dir[1];
            if (newRow >= 0 && newRow < rows && newColumn >= 0 && newColumn < columns && matrix[newRow][newColumn] > matrix[row][column]) {
                memo[row][column] = Math.max(memo[row][column], dfs(matrix, newRow, newColumn, memo) + 1);
            }
        }
        return memo[row][column];
    }

    public static  void main(String[] args){
        LongestIncreasingPath longestIncreasingPath=new LongestIncreasingPath();
        int[][] nums=
                {
        {9,9,4},
        {6,6,8},
        {2,1,1}
    };

        System.out.println(new LongestIncreasingPath().longestIncreasingPath(nums));
    }
}

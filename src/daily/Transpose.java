package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/114062321
public class Transpose {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int [] []res=new int[n][m];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                res[j][i]=matrix[i][j];

            }

        }
        return  res;

    }
}

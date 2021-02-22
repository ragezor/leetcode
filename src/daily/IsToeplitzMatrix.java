package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/113930869
public class IsToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }



    public  static  void main(String[] args){
        IsToeplitzMatrix isToeplitzMatrix=new IsToeplitzMatrix();
        int [][]matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean flag=isToeplitzMatrix.isToeplitzMatrix(matrix);
        if(flag){
            System.out.println("yes");
        }
        else {
            System.out.println("false");
        }
    }
}

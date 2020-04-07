package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105358382
public class Rotate {
    public void rotate(int[][] matrix) {
     int n=matrix.length;
     //先轴对称
     for (int i=0;i<n-1;i++){
         for (int j=i+1;j<n;j++){
             int tem=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=tem;
         }
     }
     int mid=n/2;
     //再每行以中点对称

     for (int i=0;i<n;i++){
         for (int j=0;j<mid;j++){
             int res=matrix[i][j];
             matrix[i][j]=matrix[i][n-1-j];
             matrix[i][n-1-j]=res;
         }
     }

    }
    public  static  void main(String[] args) {
        Rotate rotate = new Rotate();
        int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][]test2={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] test3={{1,2},{3,4}};
        rotate.rotate(test3);
        for (int[] ints : test3) {
            for (int num : ints
            ) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}

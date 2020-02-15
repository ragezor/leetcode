package Senior.sortAndSearch;
/*
*总结地址：：https://blog.csdn.net/qq_43491066/article/details/104075395
 */

public class kthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int l = matrix[0][0];
        int r = matrix[n-1][n-1];
        while(l < r){
            int mid = l + (r-l)/2;
            int temp = lowerThanMidCount(matrix, mid);
            if(temp < k){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return l;
    }

    private int lowerThanMidCount(int [][] matrix, int mid){
        int n = matrix.length;
        int i = 0;
        int j = n-1;
        int count = 0;

        while(i<n && j>=0){
            if(matrix[i][j] <= mid){
                i++;
                count += j+1;
            }else{
                j--;
            }
        }
        return count;
    }
}



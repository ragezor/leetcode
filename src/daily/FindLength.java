package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107062736
public class FindLength {
    public int findLength(int[] A, int[] B) {
        int lenA = A.length, lenB = B.length;
        int res = 0;
        int[][] dp = new int[lenA + 1][lenB + 1];
        for (int i = lenA - 1; i >= 0; i--) {
            for (int j = lenB - 1; j >= 0; j--) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                res = Math.max(res, dp[i][j]);

            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindLength findLength = new FindLength();
        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};
        System.out.println(findLength.findLength(A, B));
    }

}

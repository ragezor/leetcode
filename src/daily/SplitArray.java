package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107584969
public class SplitArray {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <=n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        int[] sub = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sub[i + 1] = sub[i] + nums[i];
        }
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=Math.min(i, m); j++) {
                for (int k = 0; k < i; k++) {
                    //最后相当于还是两段比长度
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[k][j - 1], sub[i] - sub[k]));
                }
            }
        }
        return dp[n][m];


    }

    public static void main(String[] args) {
        SplitArray splitArray = new SplitArray();
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray.splitArray(nums, m));


    }

}

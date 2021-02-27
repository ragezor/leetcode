package offer;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int dp = nums[0], res = dp;
        for(int i = 1; i < nums.length; i++) {
            dp = dp <= 0 ? nums[i] : dp + nums[i];
            res = Math.max(res, dp);
        }
        return res;
    }
}

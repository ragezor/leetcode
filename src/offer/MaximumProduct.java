package offer;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/112860201
public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return  Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n - 3] * nums[n - 2] );

    }
}

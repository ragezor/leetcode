package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/110160140
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length-1;i++) {
            max=Math.max(nums[i+1]-nums[i],max);

        }
        return  max;
    }
}

package offer;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        return  len%2==0? nums[(len/2)]:nums[(len-1)/2];

    }
}

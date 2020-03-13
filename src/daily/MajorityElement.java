package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104836675

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        return nums[len/2];

    }
    public  static  void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement.majorityElement(nums));
    }
}

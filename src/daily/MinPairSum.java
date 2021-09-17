package daily;



import java.util.Arrays;

public class MinPairSum {
    public int minPairSum(int[] nums) {
        int left=0,right=nums.length-1;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        while (left<right){
            max=Math.max(nums[left]+nums[right],max);
            left++;
            right--;
        }
        return  max;
    }
    public  static  void main(String [] args) {
        MinPairSum minPairSum = new MinPairSum();
        int[] nums = {3, 5, 2, 3};
        System.out.println(minPairSum.minPairSum(nums));
    }
}

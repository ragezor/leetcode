package offer;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int [] res=new int[2];
        while (l!=r){
            if(nums[l]+nums[r]<target){
                l++;
            }
            else  if(nums[l]+nums[r]>target){
                r--;
            }
            else {
                res[0]=nums[l];
                res[1]=nums[r];
                break;
            }
        }
        return  res;
    }
    public  static  void main(String[] args){
        TwoSum twoSum=new TwoSum();
       int[]nums = {2,7,11,15};
       int target = 9;
        System.out.println(Arrays.toString(twoSum.twoSum(nums,target)));
    }
}

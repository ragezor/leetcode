package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106938454
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left,right;
        int close=Integer.MAX_VALUE;
        int len=nums.length;
        int sum=0;
        for (int i=0;i<len-2;i++){
            left=i+1;
            right=len-1;
            while(left<right){
                int tmp=nums[i]+nums[left]+nums[right];
                int difference=Math.abs(tmp-target);
                if(difference<close){
                    close=difference;
                    sum=tmp;
                }
                if (tmp>target){
                    right--;
                }
                else if (tmp<target){
                    left++;
                }
                else{
                    return  tmp;
                }
            }
        }
        return  sum;
    }
    public  static  void main(String[] args){
        ThreeSumClosest threeSumClosest= new ThreeSumClosest();
        int[]nums = {1,1,1,0};

        int target =-100;
        System.out.println(threeSumClosest.threeSumClosest(nums,target));

    }
}

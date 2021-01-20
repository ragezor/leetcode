package offer;

public class Exchange {
    public int[] exchange(int[] nums) {
        int left=0,right=nums.length-1;
        while (left<right){
            if((nums[left] & 1) != 0){
                left++;
                continue;
            }
            if((nums[right] & 1) !=1 ){
                right--;
                continue;
            }
            swap(nums,left,right);
        }
        return  nums;
    }

    public  void swap(int[] nums,int left,int right){
        int  tem=nums[left];
        nums[left]=nums[right];
        nums[right]=tem;
    }
}

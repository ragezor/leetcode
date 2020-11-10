package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109591290
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }






    public void swap(int [] nums,int i,int j){
        int tem=nums[i];
        nums[i]=nums[j];
        nums[j]=tem;
    }

    public void reverse(int [] nums ,int start){
        int end=nums.length-1;
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

}

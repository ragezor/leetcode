package tencent.arrays_string;
//总结地址上传到https://blog.csdn.net/qq_43491066/article/details/104455899
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for(int right=1;right<nums.length;right++){
            if(nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
            }
        }
        return left+1;
    }
}

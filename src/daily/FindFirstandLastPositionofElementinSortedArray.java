package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/110453910
public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int left = binarysearch(nums, target,true);
        int right = binarysearch(nums,target,false)-1;
        //检测得到的两个值是否符合要求，因为数组中可能不存在target。
        if(left <= right && right < nums.length && nums[left] == target && nums[right] == target){
            return new int[]{left,right};
        }
        return new int[]{-1,-1};
    }

    //二分查找
    public int binarysearch(int[] nums, int target, boolean lower){
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while(left <= right){
            int mid = (right + left) / 2;
            //如果是left(lower==true)，那么就找第一个出现的Target。
            //如果是right，那么就找第一个大于target的值。
            if(nums[mid] > target || (lower && nums[mid] >= target)){
                right = mid - 1;
                ans = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}

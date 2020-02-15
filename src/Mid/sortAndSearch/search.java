package Mid.sortAndSearch;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102970456
public class search {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length<1) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {//边界条件
            int mid = left + (right - left) / 2;//mid位置
            if (nums[mid] == target) return mid;
            //大的长
            if (nums[mid] >= nums[left]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            //小的长
            if (nums[mid] <= nums[right]) {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }


}

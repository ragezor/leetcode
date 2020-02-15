package Mid.sortAndSearch;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103274217
import  java.util.*;
public class findKthLargest {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            int len=nums.length;
            if(len==0){
                return 0;
            }
            return nums[len-k];
        }
    }


}

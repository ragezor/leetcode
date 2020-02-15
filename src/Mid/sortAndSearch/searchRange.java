package Mid.sortAndSearch;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/103305944
public class searchRange {

        public int[] searchRange(int[] nums, int target) {
            int left=0;
            int right=nums.length-1;
            int[] res={-1,-1};
            //分别找两个位置
            while(left<=right){
                if(nums[left]==target){
                    res[0]=left;
                    break;
                }
                else{
                    left++;
                }
            }
            while(left<=right){
                if(nums[right]==target){
                    res[1]=right;
                    break;
                }
                else{
                    right--;
                }
            }
            return res;}
    }




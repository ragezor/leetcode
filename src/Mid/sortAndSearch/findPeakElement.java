package Mid.sortAndSearch;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103299312
public class findPeakElement {
        public int findPeakElement(int[] nums) {
            int len=nums.length;
            if(len==1){//长度为1，那么0坐标这个数一定为峰
                return 0;
            }
            if(nums[0]>nums[1]){//因为nums[-1]为无穷小，如果nums[0]比nums[1]大，也是驼峰
                return 0;
            }
            if(nums[len-1]>nums[len-2]){//因为nums[len]为无穷小，如果nums[len-1]比nums[len-2]大，也是驼峰
                return len-1;
            }
            int l=1;
            int r=len-2;
            return bisearch(nums,l,r);//二分法

        }
        public int bisearch(int[] nums,int l,int r){
            if(l>=r){
                return r;
            }
            int mid=(l+r)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[mid-1]){
                return bisearch(nums,l,mid-1);
            }
            else{
                return bisearch(nums,mid+1,r);
            }
        }
    }




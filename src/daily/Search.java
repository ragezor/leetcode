package daily;

public class Search {
    //总结地址；https://blog.csdn.net/qq_43491066/article/details/105787213
    public int search(int[] nums, int target) {
        //low high双指针用于二分法
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //找到条件
            if(nums[mid]==target){
                return  mid;
            }
            //target在前半段，注意等于
            if(target>=nums[0]){
                //mid在后半段，全设为正无穷
                if(nums[mid]<nums[0]){
                    nums[mid]=Integer.MAX_VALUE;
                }
            }
            //target在后半段
            else {
                //mid在前半段，全设为负无穷，注意等于
                if(nums[mid]>=nums[0]){
                    nums[mid]=Integer.MIN_VALUE;
                }
            }
//二分法
            if(nums[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        return -1;

    }

    public static  void main(String[] args){
        Search search=new Search();
        int [] nums={4,5,6,7,0,1,2};
        int [] n={1,3};
        int target1=0 ,target2=3;
        System.out.println(search.search(nums,target1));
        System.out.println(search.search(nums,target2));
        System.out.println(search.search(n,3));
    }
}

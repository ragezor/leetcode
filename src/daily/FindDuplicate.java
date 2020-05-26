package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106350143
public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        //先处理，当然也可以do while
        int slow=nums[0];
        int fast=nums[nums[0]];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        //把乌龟重新放到起点
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return  slow;

    }
    public static  void  main(String[] args){
        FindDuplicate findDuplicate=new FindDuplicate();
        int [] nums={1,3,4,2,2};
        int[] nums2={2,5,9,6,9,3,8,9,7,1};
        System.out.println(findDuplicate.findDuplicate(nums));
        System.out.println(findDuplicate.findDuplicate(nums2));
    }
}

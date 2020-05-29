package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106418756
public class Rob {
    public int rob(int[] nums) {
        int len=nums.length;
        //空
        if(len==0){
            return  0;
        }
        //只有一个
        if(len==1){
            return  nums[0];
        }
        //有俩
        if(len==2){
            return  Math.max(nums[0],nums[1]);
        }
        //动态规划，不能相邻
        int [] dp=new int[len];
        dp[0]=nums[0];
        dp[1]= Math.max(nums[1],nums[0]);
        for (int i=2;i<len;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }

        return  dp[len-1];
    }

    public static  void main(String[] args){
        Rob rob=new Rob();
        int[] nums1={1,2,3,1};
        int[] nums2={2,7,9,3,1};
        System.out.println(rob.rob(nums1));
        System.out.println(rob.rob(nums2));
    }
}

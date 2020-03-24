package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105068854
public class Massage {
    public int massage(int[] nums) {
        //空判断
        if(nums==null||nums.length==0){
            return  0;
        }
        //就一个的话最大就是它
        if(nums.length==1){
            return  nums[0];
        }
        //dp[i]表示前i个预约的最长时间，dp[i][0]表示i没有接受预约，dp[i][1]表示接受了预约
        int[][] dp=new int[nums.length][2];
        dp[0][0]=0;
        dp[0][1]=nums[0];
        for (int i=1;i<nums.length;i++){
            //如果dp[i]时没有接受这个预约，那么上一次可以接受也可以不接受
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
            //如果dp[i]接受了这个预约，那么上一次必须没有预约
            dp[i][1]=dp[i-1][0]+nums[i];

        }
        return Math.max(dp[nums.length-1][1],dp[nums.length-1][0]);

    }
    public  static  void main(String [] args){
        Massage massage =new Massage();
        int [] test1={1,2,3,1};
        int [] test2={2,7,9,3,1};
        System.out.println(Arrays.toString(test1));
        System.out.println(massage.massage(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println(massage.massage(test2));

    }
}

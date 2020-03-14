package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104866640
import java.util.Arrays;

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
       int[] dp= new int[nums.length];
       int res=0;
        Arrays.fill(dp, 1);
       for(int i=0;i<nums.length;i++){
           for(int j=0;j<i;j++){
               if(nums[j]<nums[i]){
                  dp[i]= Math.max(dp[i], dp[j] + 1);
               }


           }
           res = Math.max(res, dp[i]);
       }
       return  res;
    }

    public  static  void main(String[] args){
        LengthOfLIS lengthOfLIS=new LengthOfLIS();
        int [] nums={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS.lengthOfLIS(nums));
    }

}

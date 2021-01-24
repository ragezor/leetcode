package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/113091131
public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int start=0;
        int ans=0;
        for (int i=0;i<n;i++){
            if(i>0&&nums[i-1]>=nums[i]){
                start=i;
            }
            ans=Math.max(ans,i-start+1);
        }
        return  ans;
    }
}

package daily;
//总结地址：https://editor.csdn.net/md?articleId=106996074
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
    if(s==0||nums.length==0){
           return 0;
        }
    int res=Integer.MAX_VALUE;
    int satrt=0,end=0,sum=0;
    while(end<nums.length){
        sum+=nums[end];
        while(sum>=s){
            res=Math.min(res,end-satrt+1);
            sum-=nums[satrt];
            satrt++;
        }
        end++;

    }

    return  res==Integer.MAX_VALUE? 0:res;
    }

    public static void main(String[] args){
        MinSubArrayLen subArrayLen=new MinSubArrayLen();
        int s = 7;
        int[]nums = {2,3,1,2,4,3};
        System.out.println(subArrayLen.minSubArrayLen(s,nums));
    }

}

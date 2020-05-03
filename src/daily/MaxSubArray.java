package daily;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/105901642
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
    int sum=0;
    int res=nums[0];
        for (int n:nums
             ) {
            if(sum>0){
                sum+=n;

            }
            else {
                sum=n;
            }
            res=Math.max(res,sum);

        }
        return  res;
    }
    public  static  void main(String[] args){
        MaxSubArray maxSubArray =new MaxSubArray();
        int [] num={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray.maxSubArray(num));
    }
}

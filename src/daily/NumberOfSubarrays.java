package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105654938
public class NumberOfSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length, res = 0, feed = 0, arr[] = new int[len + 2];
        for(int i = 0; i < len; i ++) {
            // 奇数记录位置
            if((nums[i] & 1) == 1) {
                arr[++feed] = i;
            }
        }
        // left border
        arr[0] = -1;
        // right border
        arr[feed + 1] = len;
        for(int i = 1; i + k < feed + 2; i ++) {
            res += (arr[i] - arr[i - 1]) * (arr[i + k] - arr[i + k - 1]);
        }
        return res;
    }


    public static  void main(String [] args){
        NumberOfSubarrays numberOfSubarrays=new NumberOfSubarrays();
        int []nums = {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays.numberOfSubarrays(nums,k));
    }
}

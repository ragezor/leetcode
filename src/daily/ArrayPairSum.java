package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/113823308
import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for (int i = 0; i <nums.length ; i+=2) {
           ans+=nums[i];
        }
        return  ans;

    }
}

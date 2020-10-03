package daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/108907685
public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }



    public  static  void main(String[] args){
        TwoSum2 twoSum2=new TwoSum2();
        int [] nums={2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum2.twoSum(nums,9)));
    }
}

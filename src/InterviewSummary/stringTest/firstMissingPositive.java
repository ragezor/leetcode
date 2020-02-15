package InterviewSummary.stringTest;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103463835
public class firstMissingPositive {


    public int firstMissingPositive(int[] nums) {
        List<Integer> list = new ArrayList<>();//用来存nums里的正数
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            } else {//加正数进去
                list.add(nums[i]);
                len++;
            }
        }
        int k = 1;
        while (k <= len) {
            if (!list.contains(k)) {//无
                return k;
            } else {//含有，那他就不是
                k++;
            }
        }
        return k;
    }

}


package daily;

import java.util.HashSet;
import java.util.Set;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106583851
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        //set存所有num
        Set<Integer> set = new HashSet<>();
        //res存最长长度
        int res = 0;
        //set存入
        for (int n : nums
        ) {
            set.add(n);
        }
        //遍历set
        for (int num : set
        ) {
            //如果num可以作为起点
            if (!set.contains(num - 1)) {
                int current_num = num;
                int now_consective = 1;
//res最大可以是
                while (set.contains(current_num + 1)) {
                    current_num++;
                    now_consective++;
                }
                res = Math.max(res, now_consective);
            }

        }
        return res;

    }

    public static void main(String[] args) {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive.longestConsecutive(nums));
    }
}

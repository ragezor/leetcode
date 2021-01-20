package offer;

import java.util.HashSet;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums
        ) {
            if (set.contains(num)) {
                res = num;
                break;
            } else {
                set.add(num);
            }

        }
        return res;
    }


}

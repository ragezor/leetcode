package offer;

import java.util.HashSet;
import java.util.Set;

public class IsStraight {
    public boolean isStraight(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Set<Integer>  repeat=new HashSet<>();
        for (int n: nums
             ) {
            if(n==0){
                continue;
            }
            max=Math.max(max,n);
            min=Math.min(min,n);
            if (repeat.contains(n)){
                return false;
            }
            repeat.add(n);

        }
          return max - min < 5;
    }
}

package offer;

import java.util.HashMap;
import java.util.Map;

public class Search {
    public int search(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int n:nums
             ) {
            map.put(n,map.getOrDefault(n,0)+1);

        }
        if(map.containsKey(target)){
            return  map.get(target);
        }
        return  0;

    }
}

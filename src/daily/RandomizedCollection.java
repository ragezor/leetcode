package daily;

import java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109398502
public class RandomizedCollection {

    Map<Integer, Set<Integer>> idx;
    List<Integer> nums;
    /** Initialize your data structure here. */
    public RandomizedCollection() {

        idx=new HashMap<>();
        nums=new ArrayList<>();


    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        nums.add(val);
        Set<Integer> set= idx.getOrDefault(val,new HashSet<Integer>());
        set.add(nums.size()-1);
        idx.put(val,set);
        return  set.size()==1;

    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!idx.containsKey(val)) {
            return false;
        }
        Iterator<Integer> it = idx.get(val).iterator();
        int i = it.next();
        int lastnum = nums.get(nums.size() - 1);
        nums.set(i, lastnum);
        idx.get(val).remove(i);
        idx.get(lastnum).remove(nums.size() - 1);
        if (i < nums.size() - 1) {
            idx.get(lastnum).add(i);
        }
        if (idx.get(val).size() == 0) {
            idx.remove(val);
        }
        nums.remove(nums.size() - 1);
        return true;
    }



    /** Get a random element from the collection. */
    public int getRandom() {
            return nums.get((int) (Math.random() * nums.size()));
    }
}


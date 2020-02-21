package bytedance.data;

import java.util.HashMap;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/104425498

class AllOne {

    HashMap<String, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public AllOne() {
        map = new HashMap<>();

    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        if (key.length() == 0) {
            return;
        }
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
        return;

    }

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {
        if (!map.containsKey(key)) {
            return;
        }
        int val = map.get(key);
        if (val == 1) {
            map.remove(key);
        } else {
            map.put(key, val - 1);
        }
        return;

    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        if (map.size() == 0) {
            return "";
        }
        int max = Integer.MIN_VALUE;
        String maxKey = "";
        for (String key : map.keySet()
        ) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }

        }
        return maxKey;
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey() {
        if (map.size() == 0)
            return "";
        int min = Integer.MAX_VALUE;
        String minKey = "";
        for (String key : map.keySet()) {
            if (map.get(key) < min) {
                min = map.get(key);
                minKey = key;
            }
        }
        return minKey;

    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
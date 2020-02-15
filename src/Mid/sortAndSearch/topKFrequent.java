package Mid.sortAndSearch;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103263373
import  java.util.*;
public class topKFrequent {

        public List<Integer> topKFrequent(int[] nums, int k) {
            if(nums==null || nums.length == 0)
                return new ArrayList();

            // 使用HashMap，统计每个元素出现的次数，元素为键，元素出现的次数为值
            HashMap<Integer,Integer> map = new HashMap();
            for(int num : nums){
                if (map.containsKey(num)) {
                    //重复出现
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }

            // 遍历map，用最小堆保存频率最大的k个元素
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return map.get(a) - map.get(b);
                }
            });
            //如果pq还没被装满，那么直接装，装满了如果现在取到的这个元素比pq的最小值大，那么就换掉它
            for (Integer key : map.keySet()) {
                if (pq.size() < k) {
                    pq.add(key);
                } else if (map.get(key) > map.get(pq.peek())) {
                    pq.poll();
                    pq.add(key);
                }
            }
            // 取出最小堆中的元素
            List<Integer> res = new ArrayList<>();
            while (!pq.isEmpty()) {
                res.add(pq.poll());
            }
            return res;
        }
    }




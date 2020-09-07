package daily;


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108440795

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0){
            return  null;
        }
        int[] ans = new int[k];
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums
        ) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }

        }
        //小根堆
        PriorityQueue<Integer> heap = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return count.get(o1) - count.get(o2);
            }
        });
        for (Integer i : count.keySet()
        ) {
            //没满 直接加
            if (heap.size() < k) {
                heap.add(i);
                //满了 比堆里最小的大 才加
            } else if (count.get(i) > count.get(heap.peek())){
                    heap.poll();
                    heap.add(i);
                }
            }



        for (int i = k - 1; i >= 0; i--) {
            ans[i] = heap.poll();
        }
        return ans;

    }

    public static  void main(String[] args){
        TopKFrequent topKFrequent=new TopKFrequent();
        int []nums = {3,0,1,0};
        int k = 1;
        System.out.println(Arrays.toString(topKFrequent.topKFrequent(nums,k)));
    }
}

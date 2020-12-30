package daily;

import java.util.Comparator;
import java.util.PriorityQueue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/111996792
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer>heap=new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i: stones
             ) {
            heap.add(i);

        }
        while (heap.size()>1){
            int y=heap.poll();
            int x=heap.poll();

           if(y>x){
                heap.add(y-x);
            }
        }
        if(heap.size()==1){
            return  heap.poll();
        }
        return  0;

    }


    public static  void main(String [] args){
        LastStoneWeight lastStoneWeight=new LastStoneWeight();
        int [] nums=new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeight.lastStoneWeight(nums));
    }
}

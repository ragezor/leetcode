package daily;

import java.util.PriorityQueue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107016529
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int len=nums.length;
        PriorityQueue<Integer>  Maxheap=new PriorityQueue<>(len,(a,b)->b-a);
        for(int num:nums){
            Maxheap.add(num);
        }
        for (int i=1;i<k;i++){
            Maxheap.poll();
        }

        return  Maxheap.peek();
    }

    public  static  void main(String[] args){
        FindKthLargest findKthLargest=new FindKthLargest();
        int[] num={3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest.findKthLargest(num,k));
    }
}

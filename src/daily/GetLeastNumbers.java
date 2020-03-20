package daily;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104985326
public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        Queue<Integer> heap=new PriorityQueue<>(11, (o1, o2) -> o2-o1);
        for (int num: arr
             ) {
          if(heap.size()<k){
              heap.offer(num);
          }

          else if(heap.size()>0&&heap.peek()>num){
              heap.poll();
              heap.offer(num);
          }
        }
        int [] res=new int[k];
        for (int i=0;i<k;i++){
            if(heap.peek()!=null)
            res[i]=heap.poll();
        }
      return  res;

    }
    public  static  void main(String[] args){
        GetLeastNumbers getLeastNumbers=new GetLeastNumbers();
        int []arr={3,2,1};
        System.out.println(Arrays.toString(getLeastNumbers.getLeastNumbers(arr,2)));
    }
}

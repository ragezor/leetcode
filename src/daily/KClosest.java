package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109578456
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosest {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> heap= new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });
        for ( int i=0;i<K;i++){
            heap.offer(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }
        for ( int i=K;i<points.length;i++){
            int dist=points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if(dist<heap.peek()[0]){
                heap.poll();
                heap.offer(new int[]{dist,i});
            }
        }

        int [][] ans=new int[K][2];
        for (int i=0;i<K;i++){
            ans[i]=points[heap.poll()[1]];
        }
        return  ans;



    }

    public  static  void main(String[] args){

        KClosest kClosest=new KClosest();
        int [][]points=new int[][]{{1,3},{-2,2},{2,-2}};
        int [][]res=kClosest.kClosest(points,2);
        for (int []s:res
             ) {
            System.out.println(Arrays.toString(s));

        }

    }

}

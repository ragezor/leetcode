package daily;
import java.util.*;
import java.util.Comparator;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105553051
public class MergingInterval {
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        //空判断
        if (intervals==null||intervals.length == 0) return res.toArray(new int[0][]);
       //按照左端点升序排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for(int i=0;i<intervals.length;i++){
            //左右端点
            int left=intervals[i][0];
            int right=intervals[i][1];
            //合并区间 right取大的
            while(i<intervals.length-1&&intervals[i+1][0]<=right){
                i++;
                right=Math.max(right,intervals[i][1]);
            }
            res.add(new int []{left,right});
        }
        return  res.toArray(new int[0][]);
    }
    public  static  void main(String[] args){
        MergingInterval mergingInterval=new MergingInterval();
        int [][] test=new  int [][]{{1,3},{2,6},{8,10},{15,18}};
        int [][]result=mergingInterval.merge(test);
        for (int [] ints: result
             ) {
            System.out.println(Arrays.toString(ints));

        }
    }
}

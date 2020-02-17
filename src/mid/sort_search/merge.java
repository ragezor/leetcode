package mid.sort_search;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102962686
import  java.util.*;
public class merge {

        public int[][] merge(int[][] intervals) {
            List <int[]> res=new ArrayList<>();
            if(intervals==null){//判断空
                return res.toArray(new int[0][]);
            }
            Arrays.sort(intervals,(a,b)->a[0]-b[0]);
            int i=0;
            int left=0;//左边界
            int right=0;//右边界
            while(i<intervals.length){
                left=intervals[i][0];//为每个数组的第一个
                right=intervals[i][1];//为每个数组的第二个
                while(i<intervals.length-1&&right>=intervals[i+1][0]){//后一个的第一个必须小于之前的有边界
                    i++;
                    right=Math.max(right,intervals[i][1]);//右边界更新为两个数组第二个数中的大的
                }
                res.add(new int[]{left,right});//加到数组
                i++;
            }
            return res.toArray(new int[0][]);
        }
    }




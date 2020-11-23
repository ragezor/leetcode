package daily;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinArrowShots {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/109982323
    public int findMinArrowShots(int[][] points) {
        if(points.length==0){
            return   0;
        } Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                if (point1[1] > point2[1]) {
                    return 1;
                } else if (point1[1] < point2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int pos=points[0][1];
        int ans=1;
        for (int [] balloon:points
             ) {
            if(balloon[0]>pos){
                pos=balloon[1];
                ans++;
            }

        }
        return  ans;


    }
}

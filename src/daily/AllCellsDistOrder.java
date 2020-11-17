package daily;

import java.util.Arrays;
import java.util.Comparator;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109734719
public class AllCellsDistOrder {

        public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
            int[][] ret = new int[R * C][];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    ret[i * C + j] = new int[]{i, j};
                }
            }
            Arrays.sort(ret, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return (Math.abs(a[0] - r0) + Math.abs(a[1] - c0)) - (Math.abs(b[0] - r0) + Math.abs(b[1] - c0));
                }
            });
            return ret;
        }
    }




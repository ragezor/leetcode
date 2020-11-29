package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/110304462
public class LargestPerimeter {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }
}

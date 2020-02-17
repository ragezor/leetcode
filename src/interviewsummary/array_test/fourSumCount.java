package interviewsummary.array_test;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103791406
public class fourSumCount {


    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();//存sum和它对应次数
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);//更新次数
                } else {
                    map.put(sum, 1);
                }
            }
        }
        for (int l = 0; l < C.length; l++) {
            for (int m = 0; m < D.length; m++) {
                int target = -(C[l] + D[m]);
                if (map.containsKey(target)) {//存在－target即可更新count
                    count += map.get(target);
                }
            }
        }
        return count;
    }

}


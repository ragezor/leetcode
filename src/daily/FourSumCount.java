package daily;

import java.util.HashMap;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/110219606
public class FourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A
        ) {
            for (int b : B
            ) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        for (int c : C
        ) {
            for (int d : D
            ) {
                if(map.containsKey(-(c+d))){
                    ans+=map.get(-(c+d));
                }
            }
        }
        return  ans;


    }
}

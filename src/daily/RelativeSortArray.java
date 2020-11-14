package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109686213
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int upper = 0;
        for (int x : arr1) {
            upper = Math.max(upper, x);
        }
        int[] map1 = new int[upper + 1];
        int len1 = arr1.length;
        if (len1 == 0) {
            return null;
        }
        int[] ans = new int[len1];
        int index = 0;

        Arrays.fill(map1, 0);
        for (int i : arr1
        ) {
            map1[i]++;

        }

        for (int a2 : arr2
        ) {
            int count = map1[a2];
            for (int i = 0; i < count; i++) {
                ans[index] = a2;
                index++;
                map1[a2]--;
            }


        }
        for (int i = 0; i < upper+1; i++) {
            int tem = map1[i];
            if (tem != 0) {
                for (int j = 0; j < tem; j++) {
                    ans[index] = i;
                    index++;
                }
            }
        }
        return ans;


    }
}

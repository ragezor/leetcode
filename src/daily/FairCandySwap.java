package daily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/113498622
public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumA - sumB) / 2;
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : A) {
            rec.add(num);
        }
        int[] ans = new int[2];
        for (int y : B) {
            int x = y + delta;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;


    }

    public  static  void main(String []args){
        FairCandySwap fairCandySwap=new FairCandySwap();
        int []A = {1,1}, B = {2,2};
        int []res=fairCandySwap.fairCandySwap(A,B);
        System.out.println(Arrays.toString(res));

    }
}

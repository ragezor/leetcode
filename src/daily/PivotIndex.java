package daily;

import java.util.Arrays;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;

    }

    public  static  void main(String [] args){
        PivotIndex pivotIndex=new PivotIndex();
        int []nums= {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex.pivotIndex(nums));
    }
}

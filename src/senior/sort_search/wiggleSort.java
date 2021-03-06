package senior.sort_search;
import  java.util.*;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/104068359
 */
public class wiggleSort {
    /**
     * 先排序再穿插
     * O(nlogn)+O(n)=O(nlogn)
     * @param nums
     */
    public void wiggleSort(int[] nums) {
        //排序
        Arrays.sort(nums);
        int len=nums.length,i = 0;
        int[] smaller=new int[len%2==0?len/2:(len/2+1)],bigger=new int[len/2];
        //复制
        System.arraycopy(nums,0,smaller,0,smaller.length);
        System.arraycopy(nums,smaller.length,bigger,0,len/2);
        //穿插
        for (; i < len / 2; i++) {
            nums[2*i]=smaller[smaller.length-1-i];
            nums[2*i+1]=bigger[len/2-1-i];
        }
        if (len%2!=0) nums[2*i]=smaller[smaller.length-1-i];
    }
}


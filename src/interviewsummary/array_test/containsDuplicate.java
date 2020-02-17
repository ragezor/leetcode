package interviewsummary.array_test;
import java.util.*;
/*
题干：给定一个整数数组，判断是否存在重复元素。
如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
想法：排序 遍历 后一个和前一个有重复的就return true
总结地址：https://blog.csdn.net/qq_43491066/article/details/104122910
 */
public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;

    }

}

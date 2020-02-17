package interviewsummary.digitaloperation;
/*
题干：
给定一个包含 0, 1, 2, …, n 中 n 个数的序列，找出 0 … n 中没有出现在序列中的那个数。

想法：
因为只有一个数没有 所以遍历整个数组求和 再用原本的和减去即可 注意n和等差数列项数等的关系即可
这道题有多个方法，给出我的总结的地址：
https://blog.csdn.net/qq_43491066/article/details/104166640
 */
public class missingNumber {
    public int missingNumber(int[] nums) {
        //原本n+1个数
        int n=nums.length;
        //数组的和
        int sumnum=0;
        for( int ele: nums){
            sumnum+=ele;
        }
        return ((1 + nums.length) * nums.length / 2) - sumnum;
    }

}

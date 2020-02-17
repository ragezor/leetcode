package interviewsummary.array_test;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/103800204
 */
public class maxArea {
    class Solution {
        public int maxArea(int[] height) {
            int maxarea=0;
            int l=0;//左指针
            int r=height.length-1;

            while(l<r){
                maxarea=Math.max(maxarea,Math.min(height[l],height[r])*(r-l));//动态规划
                if(height[l]<height[r]){
                    l++;
                }
                else{
                    r--;
                }
            }
            return maxarea;
        }
    }


}

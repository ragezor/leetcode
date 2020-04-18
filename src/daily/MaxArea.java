package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105594125
public class MaxArea {
    public int maxArea(int[] height) {
        //左右指针
        int left=0;
        int right=height.length-1;
        //最大面积 用于动态规划
        int area=0;
        while(left<right){
            //最大面积等于现在的最大面积和之前的最大值
            //现在的最大面积等于矮的那个乘️他们之间的距离
            area=Math.max(area,Math.min(height[left],height[right])*(right-left));
            if(height[left]<=height[right]){
                //矮的动
                left++;
            }
            else {
                right--;
            }
        }
        return  area;
    }
    public static  void  main(String[] args){
        MaxArea maxArea=new MaxArea();
        int [] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea.maxArea(height));
    }
}

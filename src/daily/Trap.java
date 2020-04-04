package daily;

public class Trap {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/105314312
    public int trap(int[] height) {
         /*
          * @Description:leftright分别维护向左的最高值和向右的最高值
          * @Author: ragezor
          * @Date: 2020/4/4 6:17 下午
          * @Param [height]
          * @return int
          **/
        int len=height.length;
        int [] left=new int[len];
        int[] right=new int[len];
        int res=0;
        //维护leftright
        for (int i=1;i<len;i++){
            left[i]=Math.max(left[i-1],height[i-1]);
            right[len-1-i]=Math.max(right[len-i],height[len-i]);
        }
        //再遍历一遍用两边的小值减去height（如果height更低的话
        for(int j=0;j<len;j++){
            if(left[j]>height[j]&&right[j]>height[j]){
                res+=Math.min(left[j],right[j])-height[j];
            }
        }

        return res;
    }
    public static  void main(String[] args){
        Trap trap=new Trap();
        int [] test={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap.trap(test));
    }
}

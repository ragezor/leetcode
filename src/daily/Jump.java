package daily;

import java.util.Arrays;

public class Jump {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/105913504
    public int jump(int[] nums) {
        //数组长度、边界、能够到达的最远位置
        int len=nums.length,bounds=0,maxPosition=0,step=0;
        //最后一个位置不访问
        for (int i=0;i<len-1;i++){
            //每个位置的能够到达的最远位置
            maxPosition=Math.max(maxPosition,nums[i]+i);
            //到了上一次的边界
            if(i==bounds){
                //赋值边界 跳一步
                bounds=maxPosition;
                step++;
            }
        }
        return  step;

    }
    public static  void main(String[] args){
        Jump jump=new Jump();
        int [] nums={2,3,1,1,4};
        int res=jump.jump(nums);
        System.out.println("数组是"+ Arrays.toString(nums)+"需要至少跳"+res+"次");
    }
}

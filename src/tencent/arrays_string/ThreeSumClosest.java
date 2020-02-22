package tencent.arrays_string;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104440693
public class ThreeSumClosest {

     
    public int threeSumClosest(int[] nums, int target) {
        /*
         * @Description:如果nums的长度为0当然返回0，排序，left，right分别作为左右指针，遍历整个数组
         *比较以获得最接近的
         * @Author: ragezor
         * @Date: 2020/2/22 11:08 上午
         * @Param [nums, target] 
         * @return int
         **/
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int sum=0;
        //temMin用来存暂时的差值最小值
        int temMin=Integer.MAX_VALUE;
        int left;
        int right;
        for(int i=0;i< nums.length-2;i++){
            left=i+1;
            right=nums.length-1;
            while(left<right){
                int tmp=nums[i]+nums[left]+nums[right];
                int difference=Math.abs(tmp-target);
                if(difference<temMin){
                    temMin=difference;
                    sum=tmp;
                }
                if (tmp>target){
                    right--;
                }
                else if (tmp<target){
                    left++;
                }
                else{
                    return  tmp;
                }
            }
        }

  return sum;
    }
    public static  void main(String[] args){
        ThreeSumClosest threeSumClosest=new ThreeSumClosest();
        int [] test={-1,2,1,-4};
        System.out.println(threeSumClosest.threeSumClosest(test,1));
    }

}

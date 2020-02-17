package mid.arrays_string;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103169553
public class increasingTriplet {

        public boolean increasingTriplet(int[] nums) {
            int min=Integer.MAX_VALUE;//最小值
            int mid=Integer.MAX_VALUE;//中间值
            if(nums.length<3){//不满三个肯定不符合
                return false;
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=min){//找到当前的最小值
                    min=nums[i];
                }
                else if( nums[i]<=mid){//elseif  意味着大于min的最小值
                    mid=nums[i];
                }
                else{//都不是 那就是大于min
                    return true;
                }
            }

            return false;}
    }




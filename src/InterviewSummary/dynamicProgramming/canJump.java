package InterviewSummary.dynamicProgramming;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103327507
public class canJump {
        public boolean canJump(int[] nums) {
            int index=0;//当前位置
            int longgest=0;//可到达的最远距离
            for(int i=0;i<nums.length&&index<=longgest;i++){
                longgest=Math.max(longgest,index+nums[i]);
                index++;
            }
            return (longgest>=nums.length-1);
        }
    }



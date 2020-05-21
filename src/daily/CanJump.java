package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105575543
public class CanJump {
    public boolean canJump(int[] nums) {
     int len=nums.length;
     //右边能到的最远距离
     int right=0;
     for(int i=0;i<len;i++ ){
         //现在i这个位置必须可以到达
         if (i<=right){
             right=Math.max(right,i+nums[i]);
         }
         //最远距离超过最右的点即可
         if(right>=len-1){
             return  true;
         }
     }
     return  false;
    }
    public  static  void main(String[] args){

        CanJump canJump=new CanJump();
        int [] test1={2,3,1,1,4};
        int [] test2={3,2,1,0,4};
        System.out.println(canJump.canJump(test1));
        System.out.println(canJump.canJump(test2));
    }
}

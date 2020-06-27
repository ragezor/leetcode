package daily;
//总结地址https://blog.csdn.net/qq_43491066/article/details/106978507
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
    int n=nums.length;
    //负数更新为n+1
     for (int i=0;i<n;i++){
         if(nums[i]<=0){
             nums[i]=n+1;
         }
     }
     //正数对应位置转换为负数
     for (int i=0;i<n;i++){
         int num=Math.abs(nums[i]);
         if(num<=n){
             nums[num - 1] = -Math.abs(nums[num - 1]);
         }
     }
//返回第一个正数，实行标记
     for (int i=0;i<n;i++){
         if (nums[i] > 0) {
             return i + 1;
         }
     }
     return  n+1;

}
public  static  void main(String[] args){
        FirstMissingPositive firstMissingPositive=new FirstMissingPositive();
        int[] nums={1,2,0};
    System.out.println(firstMissingPositive.firstMissingPositive(nums));
}
}

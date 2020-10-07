package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108947182
public class SortColors {
    public void sortColors(int[] nums) {
     int i=0;
     int less=-1;
     int more=nums.length;
     while(i<more){
         if(nums[i]<1){
             swap(nums,++less,i++);
         }
         else if (nums[i]>1){
             swap(nums,--more,i);
         }
         else {
             i++;
         }
     }
    }
    public void swap(int []nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

}

package daily;

public class FindMagicIndex {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/107706728
    public int findMagicIndex(int[] nums) {
     int index=0,len=nums.length;
     while(index<len){
         if(nums[index]==index){
             return  index;
         }
        else if (nums[index]>index) {
             index=nums[index];
         }
        else {
            index++;
         }
     }
     return  -1;
    }

    public static  void main(String[] args){
        int []nums = {0, 2, 3, 4, 5};
        FindMagicIndex findMagicIndex=new FindMagicIndex();
        System.out.println(findMagicIndex.findMagicIndex(nums));
    }
}

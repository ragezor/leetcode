package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109799850
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index=0;

        if(nums.length==0){
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==0){

                continue;
            }
            else {
                nums[index]=nums[i];
                index++;
            }

        }
        for(int j=index;j<nums.length;j++){
            nums[j]=0;
        }

    }
}

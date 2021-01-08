package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/112377978
public class Rotate2 {
    public void rotate(int[] nums, int k) {

        int len=nums.length;
        int [] newarr=new int[len];
        for (int i = 0; i <len ; i++) {
            newarr[(i+k)%len]=nums[i];
        }
        System.arraycopy(newarr, 0, nums, 0, len);
    }
}

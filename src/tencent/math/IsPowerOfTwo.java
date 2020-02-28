package tencent.math;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/104551752
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;

    }
    public static  void main(String[] args){
        IsPowerOfTwo isPowerOfTwo=new IsPowerOfTwo();

        int[] nums={2,256,128,11,6543,3131};
        for (int num:nums
             ) {
            if(isPowerOfTwo.isPowerOfTwo(num)){
                System.out.println(num+"是2的幂");
            }
            else {
                System.out.println(num+"不是2的幂");
            }

        }

    }
}


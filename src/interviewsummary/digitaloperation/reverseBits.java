package interviewsummary.digitaloperation;
/*
题干：
颠倒给定的 32 位无符号整数的二进制位。
这道题有点复杂 还是建议直接看我的总结：https://blog.csdn.net/qq_43491066/article/details/104152771
 */

public class reverseBits {
    public int reverseBits(int n) {
        int res = 0;
        int count = 0;
        while (count < 32) {
            res <<= 1;  //res 左移一位空出位置
            res |= (n & 1); //得到的最低位加过来
            n >>= 1;//原数字右移一位去掉已经处理过的最低位
            count++;
        }
        return res;
    }

}

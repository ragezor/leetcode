package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108179114
public class RangeBitwiseAnd {
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m < n) {
            m = m >> 1;
            n = n >> 1;
            shift++;
        }
        return m << shift;
    }

    public static void main(String[] args) {
        RangeBitwiseAnd rangeBitwiseAnd = new RangeBitwiseAnd();
        System.out.println(rangeBitwiseAnd.rangeBitwiseAnd(5, 7));
    }

}

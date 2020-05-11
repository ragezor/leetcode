package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106049076
public class MyPow {
    public double quickMul(double x, long N) {
        if(N==0){
            return  1.0;
        }
        double y = quickMul(x, N / 2);
        return  N%2==0 ? y*y:y*y*x;
    }
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }


}

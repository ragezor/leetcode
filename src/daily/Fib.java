package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/112171128
public class Fib {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else  if(n==1){
            return 1;
        }
        return  fib(n-1)+fib(n-2);

    }
}

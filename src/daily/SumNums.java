package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106490424
public class SumNums {
    public int sumNums(int n) {
        boolean flag=n>0&& (n+=sumNums(n-1))>0;
        return  n;

    }

    public static  void main(String args[]){
        SumNums sumNums=new SumNums();
        System.out.println(sumNums.sumNums(9));

    }
}

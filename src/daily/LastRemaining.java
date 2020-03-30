package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105193715
public class LastRemaining {
    public int lastRemaining(int n, int m) {
        //最后坐标为0
        int res=0;
        for(int i=2;i<=n;i++){
            //上一轮等于加上m%这一轮的环长度，又因为倒数第二轮长度为2，所以i从2开始
            res=(res+m)%i;
        }
        return  res;

    }
    public static  void main(String[] args){
            LastRemaining lastRemaining=new LastRemaining();
        System.out.println(lastRemaining.lastRemaining(5,3));}
}

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106015879
public class MySqrt {
    public int mySqrt(int x) {
        int left=1;
        int right=x;
        int mid,res;
        if(x<=1){
            return x;
        }
        while(left<=right){
            mid=left+(right-left)/2;
            res=x/mid;
            if(res==mid){
                return  mid;
            }
            else if(res>mid){
                left=mid+1;
            }
            else {
                right=mid-1;
            }

        }
        return  right;

    }
    public  static  void main(String [] args){
        MySqrt mySqrt=new MySqrt();
        System.out.println(mySqrt.mySqrt(2147395599));
        System.out.println(mySqrt.mySqrt(4));

    }
}

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105011756
public class CanMeasureWater {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x==0||y==0){
            return  x+y==z||z==0;
        }
        if(x+y<z){
            return  false;
        }
        return  z%gcd(x,y)==0;


    }
    public   static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public  static  void main(String[] args){
        CanMeasureWater canMeasureWater=new CanMeasureWater();
        System.out.println(canMeasureWater.canMeasureWater(3,5,4));
    }
}

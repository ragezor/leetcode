package tencent.extra;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104606558
public class Nim {
    public boolean canWinNim(int n) {
        return (n%4!=0);

    }

    public static  void  main(String [] args){
            Nim nim=new Nim();
            int [] test={1,2,3,4,5,6,7,8,9,10,11,12,13};
        for (int num:test
             ) {
            if(nim.canWinNim(num)){
                System.out.println(num+"块石头的时候能赢");
            }
            else {
                System.out.println(num+"块石头的时候不能赢");
            }

        }
    }

}

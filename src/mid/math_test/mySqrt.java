package mid.math_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103364268
public class mySqrt {

        public int mySqrt(int x) {
            int i;
            for(i=0;i<=x;i++){
                if(i*i>x||i*i<0){//防止溢出，超过整数的最大值
                    break;
                }
            }
            return i-1;
        }
    }




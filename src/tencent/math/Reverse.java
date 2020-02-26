package tencent.math;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104512668

public class Reverse {

        public int reverse(int x) {
            //每一位的数
            int pop=0;
            //累计数
            int res=0;
            while(x!=0){
                pop=x%10;
                x=x/10;
                //越界
                if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                res=res*10+pop;

            }

            return res;
        }

        public static  void  main(String[] args){
            Reverse reverse=new Reverse();
            int[] test={1,12,123,1234,12345,2147483647,-2147483648};
            for (int test1:test
                 ) {
                System.out.println(test1+"的反转是"+reverse.reverse(test1));
            }
        }
}

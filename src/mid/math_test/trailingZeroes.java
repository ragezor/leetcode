package mid.math_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103355867
public class trailingZeroes {

        public int trailingZeroes(int n) {
            int count=0;
            while(n!=0){
                n/=5;
                count+=n;
            }

            return count;}
    }




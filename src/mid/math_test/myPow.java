package mid.math_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103080836
public class myPow {

        public double myPow(double x, int n) {
            if(n < 0){
                // n为负返回倒数
                return 1/pow(x, -n);
            } else {
                // n为正直接返回结果
                return pow(x, n);
            }
        }

        private double pow(double x, int n){
            // 递归终止条件
            if(n == 0){
                return 1.0;
            }
            if(n == 1){
                return x;
            }
            double val = pow(x, n/2);
            // 根据奇数还是偶数返回不同的值
            if(n % 2 == 0){
                return val * val;
            } else {
                return val * val * x;
            }
        }
    }




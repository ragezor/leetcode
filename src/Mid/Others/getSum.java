package Mid.Others;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103401393
public class getSum {
        public int getSum(int a, int b) {
            int result=a^b;//按位取异或
            int forward=(a&b)<<1;
            if(forward!=0){//判断是否需要进位
                return getSum(result,forward);
            }

            return result;
        }
    }





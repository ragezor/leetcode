package tencent.math;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/104540968
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if ( x < 10) {
            return true;
        } else {

            int result = 0;
            int tmp = x;
            while (tmp > 0) {
                result *= 10;
                result += tmp%10;
                tmp = tmp/10;
            }
            return result == x;
        }

        }


        public static  void  main(String[] args){
        IsPalindrome isPalindrome=new IsPalindrome();
            System.out.println( isPalindrome.isPalindrome(10));
        }


}

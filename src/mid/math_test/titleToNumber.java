package mid.math_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103079647
public class titleToNumber {
    class Solution {
        public int titleToNumber(String s) {
            int res=0;
            int len=s.length();
            if(len==0){
                return 0;
            }
            for(int i=0;i<len;i++){
                int temp=s.charAt(i)-'A'+1;
                res=res*26+temp;
            }
            return res;}
    }


}

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104973478
public class LongestPalindrome {
    public int longestPalindrome (String s) {
        int[] res =new int [52];
        int result=0;
        int odd=0;
        for (char c:s.toCharArray()
             ) {
            if(c>='a'){
                res[c-'a']++;
            }
            else {
                res[c-'A'+26]++;
            }

        }
        for (int a:res
             ) {
            if (a % 2 != 0) {
                odd++;
            }
            result+=a;

        }
        if (odd!=0){
            return result-odd+1;
        }


        return  result;
    }

    public  static  void main(String [] args){
        LongestPalindrome longestPalindrome=new LongestPalindrome();
        String str="zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
        System.out.println(longestPalindrome.longestPalindrome(str));
    }
}

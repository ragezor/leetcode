package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106209802
public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        boolean res = true;
        //空不是
        if (s == null || s.equals("")) {
            return false;
        }
        int l = 0, r = s.length() - 1;
        //双指针
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                //跳过这个数，两个方向一个符合即可
                res = isPalindrome(l + 1, r, s) || isPalindrome(l, r - 1, s);
                break;
            }
            l++;
            r--;
        }
        return res;
    }
//判断是否是回文
    public boolean isPalindrome(int l, int r, String s) {
        boolean res = true;
        //单自负
        if (r == l) {
            return true;
        }
        //双指针向中间
        while (l <= r) {
            //不匹配就不是回文
            if (s.charAt(l) != s.charAt(r)) {
                res = false;
                break;
            }
            l++;
            r--;
        }
        return res;
    }

    public static  void main(String[] args){
        ValidPalindrome validPalindrome=new ValidPalindrome();
        System.out.println(validPalindrome.validPalindrome("aba"));
        System.out.println(validPalindrome.validPalindrome("abc"));

    }
}

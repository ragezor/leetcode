package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106659381
public class IsPalindrome {
    //法一、双指针
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        int len = str.length();
        int l = 0;
        int r = len - 1;
        while (l != r && l < len && r >= 0) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;


    }
    //字符串反转
    public boolean isPalindrome2(int x) {
        if(x<0){
            return  false;
        }
        String str = String.valueOf(x);
        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        String res=sb.toString();
        return  str.equals(res);

    }
    //每一位反转
    public boolean isPalindrome3(int x) {
        if(x<0){
            return  false;
        }
        else if(x>0&&x<10){
            return  true;
        }
        else {
             int res=0;
             int tem=x;
             while(tem>0){
                 res*=10;
                 res+=tem%10;
                 tem/=10;
             }
             return res==x;
        }
    }


    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome3(1121));
    }
}

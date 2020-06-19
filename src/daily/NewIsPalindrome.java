package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106852124
public class NewIsPalindrome {
    public boolean isPalindrome(String s) {
        char [] chars=s.toCharArray();
        int left=0,right=chars.length-1;
        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(chars[left])){
                left++;
            }
            while(left<right&&!Character.isLetterOrDigit(chars[right])){
                right--;
            }
            if(left<right){
                if (Character.toLowerCase(chars[left])!=Character.toLowerCase(chars[right])){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static  void  main (String[] args){
        NewIsPalindrome newIsPalindrome=new NewIsPalindrome();
        String s="A man, a plan, a canal: Panama";
        String s2="race a car";
        System.out.println("字符串是"+s+" :"+newIsPalindrome.isPalindrome(s));
        System.out.println("字符串是"+s2+" :"+newIsPalindrome.isPalindrome(s2));

    }
}

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107604351
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return  i==s.length();
    }

    public static void main(String[] args){
        IsSubsequence is=new IsSubsequence();
      String  s = "abc", t = "ahbgdc";
        System.out.println(is.isSubsequence(s,t));
    }

}

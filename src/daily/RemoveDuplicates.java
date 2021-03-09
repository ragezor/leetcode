package daily;

public class RemoveDuplicates {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/114576495
    public String removeDuplicates(String S) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }


    public  static  void main(String[] args){
        RemoveDuplicates removeDuplicates=new RemoveDuplicates();
        String s="abbaca";
        String  res=removeDuplicates.removeDuplicates(s);
        System.out.println(res);
    }


}

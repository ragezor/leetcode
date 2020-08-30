package daily;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/108307367
public class ReverseWords2 {
    public String reverseWords(String s) {

        if (s.length() == 0 || s == null) {
            return "";
        }
        if (s == " ") {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        String[] strings = s.split(" ");
        for (String tem : strings
        ) {
            StringBuffer stringBuffer1 = new StringBuffer(tem);
            stringBuffer1.reverse();
            String str = stringBuffer1.toString();
            stringBuffer.append((str));
            stringBuffer.append(" ");

        }
        String s1 = stringBuffer.toString().trim();
        return s1;
    }


    public static void main(String[] args) {
        ReverseWords2 reverseWords2 = new ReverseWords2();
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords2.reverseWords(s));
    }

}

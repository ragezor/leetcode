package daily;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105428116
public class ReverseWords {
    public String reverseWords(String s) {
        //去除前后
        s=s.trim();
        //split转成list，\\s表示   空格,回车,换行等空白符,+号表示一个或多个的意思
        List<String>  list=Arrays.asList(s.split("\\s+"));
        //反转
        Collections.reverse(list);
        //join
        return  String.join(" ",list);


    }
    public  static  void main(String[] args){
        ReverseWords reverseWords=new ReverseWords();
        String s ="the      sky is blue";
        System.out.println(reverseWords.reverseWords(s));
    }
}

package tencent.arrays_string;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104456927
public class ReverseWords {
    public String reverseWords(String s) {
        /*
         * @Description:
         * @Author: ragezor
         * @Date: 2020/2/23 11:37 上午
         * @Param [s] 
         * @return java.lang.String
         **/
        if(s.length()==0||s==null){
            return  null;
        }
        if(s==" "){
            return  "";
        }
        StringBuffer s1=new StringBuffer();
        String []  sub=s.split(" ");
        for (String tem:sub
             ) {
            StringBuffer stringBuffer=new StringBuffer(tem);
            stringBuffer.reverse();
            String str=stringBuffer.toString();

            s1.append(str);
            s1.append(" ");

        }
       String string= s1.toString().trim();

        return  string;

    }
    public static  void main(String [] args){
        ReverseWords reverseWords=new ReverseWords();
        String test="Let's take LeetCode contest";
        String s2=reverseWords.reverseWords(test);
        System.out.println(s2);
    }
}


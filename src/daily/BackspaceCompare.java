package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109153854
public class BackspaceCompare {
    public boolean backspaceCompare(String S, String T) {
        return  build(S).equals(build(T));

    }

    public String build(String S){
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if (c != '#') {
                stringBuffer.append(c);
            }
            else{
                if(stringBuffer.length()>0){
                    stringBuffer.deleteCharAt(stringBuffer.length()-1);
                }
            }
        }
        return  stringBuffer.toString();

    }

    public  static  void main(String[] args){
        BackspaceCompare backspaceCompare= new BackspaceCompare();
        String S = "ab#c", T = "ad#c";
        System.out.println(backspaceCompare.backspaceCompare(S,T));
    }
}

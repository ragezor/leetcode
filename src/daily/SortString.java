package daily;

public class SortString {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/110130567
    public String sortString(String s) {
        int [] count=new int[26];
        for (int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        StringBuffer stringBuffer=new StringBuffer();
        while (stringBuffer.length()<s.length()){
            for (int i = 0; i <26 ; i++) {
                if(count[i]!=0){
                    stringBuffer.append((char)('a'+i));
                    count[i]--;
                }
            }
            for (int j=25;j>=0;j--){
                if(count[j]!=0){
                    stringBuffer.append((char)('a'+j));
                    count[j]--;
                }
            }
        }
        return  stringBuffer.toString();

    }
    public  static  void main(String[] args){
        SortString sortString=new SortString();
        String s = "aaaabbbbcccc";
        System.out.println(sortString.sortString(s));
    }


}

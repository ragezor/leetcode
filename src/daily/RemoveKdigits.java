package daily;
//总结地址：https://editor.csdn.net/md?articleId=109699872
public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        if(num.length()==k){
            return "0";
        }
        StringBuffer stringBuffer=new StringBuffer(num);

        while(k>0){
            int index=0;
            for (int i=1;i<stringBuffer.length();i++){
                if(stringBuffer.charAt(i)>=stringBuffer.charAt(i-1)){
                    index=i;
                }
                else {
                    break;
                }
            }
            stringBuffer.deleteCharAt(index);
            k--;

        }
        while(stringBuffer.length()>1&&stringBuffer.charAt(0)=='0'){
            stringBuffer.deleteCharAt(0);
        }
        return  stringBuffer.length()<1? "0": stringBuffer.toString();



    }
}

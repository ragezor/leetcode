package daily;

import java.util.HashMap;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104893250
public class CompressString {
    public String compressString(String S) {
        StringBuilder stringBuffer =new StringBuilder();
        int len=S.length();
        //空判断
        if(len==0){
            return S;
        }
        //字符和对应出现次数
        HashMap<Character,Integer> hashMap= new HashMap<>();
        char [] arr= S.toCharArray();
        //首位单独处理
        hashMap.put(arr[0],1);
        for (int i=1;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                //连续情况
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else {
                //非连续情况就先把之前连续的放进stringbuffer
                stringBuffer.append(arr[i-1]);
                stringBuffer.append(hashMap.get(arr[i-1]));
                hashMap.clear();
                hashMap.put(arr[i],1);
            }
        }
        //首位手动处理
        if(hashMap.containsKey(arr[len-1])){
            stringBuffer.append(arr[len-1]);
            stringBuffer.append(hashMap.get(arr[len-1]));
        }
        else {
            stringBuffer.append(arr[len-1]);
            stringBuffer.append(1);
        }

        int tem=stringBuffer.length();
        if(tem<len){
            return  stringBuffer.toString();
        }


return  S;
    }

    public  static  void main(String[] args){
        CompressString compressString=new CompressString();
        String S="bbbac";
        System.out.println(compressString.compressString(S));
    }
}

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106759425
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
   int len=strs.length;
   //0处理
   if(len==0){
       return  "";
   }

   String pre=strs[0];
        for (String str:strs
             ) {
            //不以它开头
            while(!str.startsWith(pre)){
                pre=pre.substring(0,pre.length()-1);
            }

        }
        return  pre;
    }

    public static  void main(String[] args){
        LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
        String [] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}

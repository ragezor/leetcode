package bytedance.string_test;
/*
题干：
给定一个字符串，逐个翻转字符串中的每个单词。
示例 1：
输入: "the sky is blue"
输出: "blue is sky the"

想法：使用Java的split函数 将每一个单词分割出来 然后再倒叙加入stringbuilder 最后去掉首位多余的“ ”即可
总结地址：https://blog.csdn.net/qq_43491066/article/details/104245228
 */
public class reverseWords {
    public String reverseWords(String s) {
        String[] strs=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=strs.length-1;i>=0;i--){
            if(strs[i].length()>0){
                res.append(strs[i]);
                res.append(" ");
            }
        }
        return res.toString().trim();
    }

}

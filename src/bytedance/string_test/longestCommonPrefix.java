package bytedance.string_test;
/*
题干：
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 “”。
示例 1:
输入: ["flower","flow","flight"]
输出: "fl"

想法：这个前缀到底是啥子嘛表达飞求不清晰的
我去查了下 意思就是说前缀的前边一定为空
也就是说你要么最前边有相同的
要么没有
于是想到了Java的statrsWith方法
首先取数组里第一个为前缀
再从后向前截取字符串
什么时候是前缀了什么时候停
总结地址：https://blog.csdn.net/qq_43491066/article/details/104207602
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        /*
         *len 长度
         *pre 前缀
         */
        int len=strs.length;
        if(len==0){
            return "";
        }
        String pre=strs[0];

        for(int i=0;i<len;i++){
            //从后往前截取
            while(!strs[i].startsWith(pre)){
                pre=pre.substring(0,pre.length()-1);
            }
        }

        return pre;
    }
}



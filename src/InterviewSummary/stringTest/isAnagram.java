package InterviewSummary.stringTest;
/*
*题干 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
*想法
* leetcode的题干真的是憨批全集
就不能说清楚什么是“字母异位词”？
说白了就是者两个字符串的组成单词情况相同
都是由相同的字符组成的
那么就很简单了
又因为都是小写
直接用数组保存每个字符26个字母对应的个数
其中数组的0位置对应’a’
同理
很简单 看代码就懂了
* 总结地址：https://blog.csdn.net/qq_43491066/article/details/104122334
 */
public class isAnagram {
    public boolean isAnagram(String s, String t) {
        /*
         *sCount存储s的对应的个数
         *tCount存储t的对应的个数
         *
         */
        int [] sCount=new int[26];
        int [] tCount=new int[26];
        for(char chars : s.toCharArray()){
            sCount[chars-'a']++;
        }
        for(char chart : t.toCharArray()){
            tCount[chart-'a']++;
        }

        for(int i=0;i<26;i++){
            if(sCount[i]!=tCount[i]){
                return false;
            }
        }
        return true;
    }


}

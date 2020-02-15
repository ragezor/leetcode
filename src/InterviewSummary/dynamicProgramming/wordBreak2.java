package InterviewSummary.dynamicProgramming;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103680900
import  java.util.*;
public class wordBreak2 {

        //hashmap存已经求得的，提高效率
        private Map<String,List<String>> map=new HashMap<>();
        public List<String> wordBreak(String s,List<String> wordDict){
            //res存储每一钟情况的结果
            List<String> res=new ArrayList<>();

            if(s.length()==0){//s为空返回空
                res.add("");
                return res; }
            if(map.containsKey(s)){//已经求过直接返回
                return map.get(s);
            }

            for(String word:wordDict){//遍历开始
                if(s.startsWith(word)){//如果可以的话，s的开头肯定是wordlist里的一个字符串，所以遍历的事worddict
                    List<String> tmpList=wordBreak(s.substring(word.length()),wordDict);//截取开头以后的s，进行递归
                    for(String tmp:tmpList){//把已经确定有的加入res
                        res.add(word+(tmp.equals("")?"":" "+tmp));//没有就是"" 有就是加的空格 " "
                    }
                }
            }
            map.put(s,res);//放入hashmap
            return res;


        }






}

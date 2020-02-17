package mid.back;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102876153
import  java.util.*;
public class letterCombinations {

        public List<String> letterCombinations(String digits) {
            //数组num用来对应数字和案件
            String[] num={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            //用来存储最终的结果
            List<String> res=new ArrayList<>();
            if(digits.isEmpty())
                return res;
            //加上头节点
            res.add("");
            //遍历每个输入的字母
            for(char c:digits.toCharArray()){
                //c-'0' 高效获得c的位置
                res=combine(num[c-'0'],res);
            }
            return res;
        }
        //剩下的字母组合
        private List<String> combine(String str, List<String> list){
            List<String> res = new ArrayList<>();

            for(char c : str.toCharArray()){
                for(String s : list){
                    res.add(s+c);
                }
            }

            return res;
        }

    }




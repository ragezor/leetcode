package senior.back;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/104060509
 */
public class isMatch {

        public boolean isMatch(String s, String p) {
            /*用sp和pp分别纪录s和p当前要进行匹配的位置；match纪录s中匹配到的位置，用于让sp下次从这里开始；star纪录*出现的位置，pp从*的下一个位置出发。
             */
            int sp = 0;
            int pp = 0;
            int star = -1;
            int match = 0;
            while(sp < s.length()){
                //当前p的字符和s相同或者是'?'那就是正常匹配
                if(pp < p.length() &&(s.charAt(sp) == p.charAt(pp) || p.charAt(pp) == '?')){
                    sp++;
                    pp++;
                }//当前p的字符是'*' 那么更新star的位置，更新match位置，pp++
                else if(pp < p.length() && p.charAt(pp) == '*'){
                    star = pp;
                    match = sp;
                    pp++;
                }else if(star != -1){
                    //是*之前那么*可以匹配一切，更新即可
                    match++;
                    sp = match;
                    pp = star + 1;
                }else return false;
            }
            while(pp < p.length() && p.charAt(pp) == '*'){
                //最后还有*进行更新，使其匹配空
                pp++;
            }
            return p.length() == pp;
        }
    }



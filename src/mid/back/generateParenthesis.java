package mid.back;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102880762
import  java.util.*;
public class generateParenthesis {

        public List<String> generateParenthesis(int n) {
            List<String> res=new ArrayList();
            // str用来暂时存每个分支的（）
            String str=new String();
            generate(res,str,n,n);
            return res;

        }
        public void generate(List<String> list,String str,int left,int right){//都为0，说明（）用完了，该return了
            if(left==0&&right==0){
                list.add(str);
                return;
            }//还剩左括号，直接放
            if(left>0){
                generate(list,str+'(',left-1,right);
            }//右括号数量大于左括号才能放
            if(right>left){
                generate(list,str+')',left,right-1);
            }
        }
    }


package daily;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105407921
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        //res存储结果
        List<String> res=new ArrayList<>();
        dfs(n,n,"",res);
        return  res;

    }
    //dfs递归函数
    private void dfs(int left,int right,String  str,List<String> res){
        //左右都没了 加入res
        if(left==0&&right==0){
            res.add(str);
            return;
        }
        //还有左括号没有加 那就加
        if(left>0){
            dfs(left-1,right,str+"(",res);
        }
        //右括号一定在左括号后
        if(right>left){
            dfs(left,right-1,str+")",res);
        }

    }

    public  static  void main(String[] args){
        GenerateParenthesis  generateParenthesis=new GenerateParenthesis();
        System.out.println(generateParenthesis.generateParenthesis(4));
    }

}

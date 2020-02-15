package Senior.Back;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103621101
import  java.util.*;
public class removeInvalidParentheses {

        private Set<String> set;//存结果
        private String input;
        public List<String> removeInvalidParentheses(String s) {
            input=s;
            set=new HashSet<>();

            int left=0,right=0;
            //遍历记录左右括号数
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='('){
                    left++;
                }
                else if(c==')'){
                    if(left==0){
                        right++;
                    }
                    else{
                        left--;
                    }
                }
            }

            helper(0, "", 0, 0, left, right);//递归
            return new ArrayList<>(set);



        }
        private void helper(int index, String valid, int leftCount, int rightCount, int leftRem, int rightRem) {
            if(index==input.length()){
                if(leftRem==0&&rightRem==0){//递归出口条件
                    set.add(valid);
                }
                return ;
            }


            char c=input.charAt(index);
            if (c == '(') {
                if (leftRem > 0) {
                    //左括号且左括号待删除，则删除，跳过它
                    helper(index + 1, valid, leftCount, rightCount, leftRem - 1, rightRem);
                }//否则，加进去
                helper(index + 1, valid + c, leftCount + 1, rightCount, leftRem, rightRem);
            } else if (c == ')') {
                if (rightRem > 0) {//右括号且需要删除跳过
                    helper(index + 1, valid, leftCount, rightCount, leftRem, rightRem - 1);
                }
                if (rightCount < leftCount) {//右括号且右括号更多
                    helper(index + 1, valid + c, leftCount, rightCount + 1, leftRem, rightRem);
                }
            } else {//否则，加
                helper(index + 1, valid + c, leftCount, rightCount, leftRem, rightRem);
            }
        }




}

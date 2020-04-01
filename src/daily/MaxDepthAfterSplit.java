package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105240513
public class MaxDepthAfterSplit {
    public int[] maxDepthAfterSplit(String seq) {
        //存储答案的数组
        int [] res=new int[seq.length()];
        //遍历的位置
        int index=0;
        for (char c:seq.toCharArray()
             ) {
            //'('的话 偶数放0 奇数放1
            if(c=='('){
                if(index%2==0){
                    res[index]=0;
                }
                else {
                    res[index]=1;
                }
            }
            //')'反之

            else{
                if(index%2==0){
                    res[index]=1;
                }
                else {
                    res[index]=0;
                }

            }
            index++;

        }
        return  res;

    }
    public static  void main(String[] args){
       MaxDepthAfterSplit maxDepthAfterSplit=new MaxDepthAfterSplit();
        String seq = "(()())";
        System.out.println(Arrays.toString(maxDepthAfterSplit.maxDepthAfterSplit(seq)));
    }
}

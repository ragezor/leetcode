package tencent.flashback;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104588267
public class GrayCode {
    public List<Integer> grayCode(int n) {

        ArrayList<Integer> res=new ArrayList<>();
        for(int i = 0; i < 1 << n; i++){
            res.add(i ^ (i >> 1));
        }
        return res;

    }

    public static  void main(String[] args){
        GrayCode grayCode=new GrayCode();
        System.out.println(grayCode.grayCode(3));
    }
}

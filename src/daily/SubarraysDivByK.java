package daily;

import java.util.HashMap;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106375503
public class SubarraysDivByK {
    public int subarraysDivByK(int[] A, int K) {
        //子列和  ，结果，模，相同个数
        int sum=0,count=0,mod,same;
        HashMap<Integer,Integer> map=new HashMap<>();
        //初始化
        map.put(0,1);
        for (int num:A
             ) {
            //子列和
            sum+=num;
            //负数需要纠正
            mod=(sum % K + K) % K;
            //模相同的个数
            same=map.getOrDefault(mod,0);
            count+=same;
            map.put(mod,same+1);



        }
        return  count;

    }


    public static  void main(String[] args){

        int []A = {4,5,0,-2,-3,1};
        int K=5;
        SubarraysDivByK subarraysDivByK=new SubarraysDivByK();
        System.out.println(subarraysDivByK.subarraysDivByK(A,K));
    }

}

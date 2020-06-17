package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106802187
public class MaxScoreSightseeingPair {
    public int maxScoreSightseeingPair(int[] A) {
        if(A==null){
            return 0;
        }
        int res=0,max=A[0];
        for (int j=1;j<A.length;j++){
            res=Math.max(res,max+A[j]-j);
            max=Math.max(max,A[j]+j);

        }
        return  res;
    }

    public static  void main(String[] args){
        MaxScoreSightseeingPair maxScoreSightseeingPair=new MaxScoreSightseeingPair();
        int [] test={8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair.maxScoreSightseeingPair(test));
    }

}

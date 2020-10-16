package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109116059
public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i <A.length ; i++) {
            A[i]=(int)Math.pow(A[i],2.0);

        }
        Arrays.sort(A);
        return  A;

    }

    public  static  void main(String[]args){
        SortedSquares sortedSquares=new SortedSquares();
        int [] nums={-4,-1,0,3,10};
        int []ans=sortedSquares.sortedSquares(nums);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }


}

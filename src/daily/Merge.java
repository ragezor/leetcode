package daily;

import java.util.Arrays;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/104629671
public class Merge {
    public void merge(int[] A, int m, int[] B, int n) {
        while(m>0&&n>0){
            //大的先放 然后更新指针
            if(A[m-1]>B[n-1]){
                A[m+n-1]=A[m-1];
                m--;
            }
            else{
                A[m+n-1]=B[n-1];
                n--;
            }
        }
        //B还没放完的情况，A没放完不用处理
        while(n>0){
            A[n - 1] = B[n - 1];
            n--;

        }

    }

    public  static  void main(String [] args){
        Merge merge=new Merge();
        int[] A={1,2,3,0,0,0};
        int[] B={3,6,9};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        merge.merge(A,3,B,3);
        System.out.println(Arrays.toString(A));
    }



}

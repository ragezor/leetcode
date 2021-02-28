package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/114210582
public class IsMonotonic {
    public boolean isMonotonic(int[] A) {
         boolean zeng=true,jian=true;
        for (int i = 0; i <A.length-1 ; i++) {
            if(A[i]<A[i+1]){
                jian=false;
            }
            if(A[i]>A[i+1]){
               zeng=false;
            }

        }
        return  zeng||jian;

    }
}

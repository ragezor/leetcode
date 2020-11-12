package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109643274
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int len=A.length;
        if(len==0){
            return  null;
        }
        int []ans=new int[len];
        int i=0, j=1;
        for (int a:A
             ) {
            if ((a&1)==1){
                ans[j]=a;
                j+=2;
            }
            else {
                ans[i]=a;
                i+=2;
            }

        }
        return  ans;


    }

}

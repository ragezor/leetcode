package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109269707
public class LongestMountain {

    public int longestMountain(int[] A) {
        int len= A.length;
        if(A==null||len==0){
            return  0;
        }
        int[] left=new int[len];
        for (int i=1;i<len;i++){
            left[i]=A[i-1]<A[i]? left[i-1]+1:0;
        }
        int[] right=new int[len];
        for (int i=len-2;i>=0;i--){
            right[i]=A[i+1]<A[i]? right[i+1]+1:0;
        }
        int ans = 0;
        for (int i = 0; i < len; ++i) {
            if (left[i] > 0 && right[i] > 0) {
                ans = Math.max(ans, left[i] + right[i] + 1);
            }
        }
        return ans;


    }
}

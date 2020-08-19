package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108093056
public class CountSubstrings {
    public int countSubstrings(String s) {
        int n=s.length(), res=0;
        for(int i=0;i<2*n-1;i++){
            int l=i/2,r=i/2+i%2;
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)){
                r++;
                l--;
                res++;
            }
        }
        return  res;

    }
}

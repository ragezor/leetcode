package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106187542
public class MaxProduct {
    public int maxProduct(int[] nums) {
        //分别表示到现在这个结尾的最大值最小值
        int imax=1,imin=1;
        //max表示最大值
        int max=Integer.MIN_VALUE;
        for (int n:nums
             ) {
            //负数就转换最值
            if(n<0){
                int tem=imin;
                imin=imax;
                imax=tem;
            }
            imax=Math.max(imax*n,n);
            imin=Math.min(imin*n,n);
            max=Math.max(max,imax);
        }
        return max;

    }

    public static  void main(String[] args){
        MaxProduct maxProduct=new MaxProduct();
        int[] nums={2,3,-2,4};
        System.out.println(maxProduct.maxProduct(nums));
    }
}

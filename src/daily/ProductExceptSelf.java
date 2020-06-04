package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106539783
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        //左右数组
        int [] left=new int[len];
        int [] right=new int[len];
        int []res=new int[len];
        //单独维护0和len-1
        left[0]=1;
        for (int i=1;i<len;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[len-1]=1;
        for (int j=len-2;j>=0;j--){
            right[j]=right[j+1]*nums[j+1];
        }
        //新数组
        for (int k=0;k<len;k++){
            res[k]=left[k]*right[k];
        }
        return  res;

    }


    public static  void main(String[] args){
        ProductExceptSelf productExceptSelf=new ProductExceptSelf();
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf.productExceptSelf(nums)));

    }
    }

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105726984
public class ReversePairs {
    int res=0;
    public int reversePairs(int[] nums) {
        if(nums==null||nums.length==0){
            return  0;
        }
        int low=0,high=nums.length-1;
        int [] B=new int[nums.length];
        mergeSort(nums,low,high,B);
        return res;

    }
    void mergeSort(int [] nums,int low,int high,int[]B){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(nums,low,mid,B);
            mergeSort(nums,mid+1,high,B);
            mergeCount(nums,low,mid,high,B);
        }


        }
    void mergeCount(int[] nums,int low,int mid,int high,int[] B){//详细归并过程
        int i,j,k;
        //将原数组复制到临时数组B中
        if (high + 1 - low >= 0) System.arraycopy(nums, low, B, low, high + 1 - low);
        for(i=mid,j=high,k=high;i>=low&&j>=mid+1;k--){//双指针i，和j起始位置都是各自小组的末尾，循环结束条件就是有一组走完了
            if(B[i]>B[j]){//前一组的指针数大于后一组的指针数
                nums[k]=B[i--];//大的值扔进数组
                res=res+j-mid;//逆序数增加，j-mid是后一组剩余数目
            }else{
                nums[k]=B[j--];
            }
        }
        //下面循环只会执行一个，因为上面循环退出条件是有一组走完了，下面循环就是将没走完的依次复制到原数组
        while(i>=low)nums[k--]=B[i--];
        while(j>=mid+1)nums[k--]=B[j--];
    }

    public static  void main (String[] args){
        ReversePairs reversePairs=new ReversePairs();
        int [] res={7,5,6,4};
        System.out.println(reversePairs.reversePairs(res));
    }



}

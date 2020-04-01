package daily;

import java.util.Arrays;

public class SortArray {
    public int[] sortArray(int[] nums) {
        quickSort(0,nums.length-1,nums);
        return  nums;

    }
    public void quickSort(int left,int right,int[] nums){
        if(left>=right){
            return;
        }
        int low=left;
        int high=right;

        while(low<high){
            while(nums[high]>nums[left]&&low<high){
                high--;
            }
            while(nums[low]<nums[left]&&low<high){
                low++;
            }

            if(low<high) {
                swap(nums, low, high);
            }

        }
        swap(nums,left,low);
        quickSort(left,high-1,nums);
        quickSort(high+1,right,nums);
    }
    public void swap(int[] nums,int left,int right){
        int tem=nums[left];
        nums[left]=nums[right];
        nums[right]=tem;
    }

    public  static  void main(String[] args){
        SortArray sortArray =new SortArray();
        int[] test={1,3,6,10,4};
        int[] test2={5,2,3,1};
     System.out.println(Arrays.toString(sortArray.sortArray(test)));

        System.out.println("done");
    }
}

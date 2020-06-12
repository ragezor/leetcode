package daily;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106711268
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
             if(nums==null){
                 return  null;
             }
             if(nums.length<3){
                 return  new ArrayList<>();

             }
             Arrays.sort(nums);
             HashSet<List<Integer>> set=new HashSet<>();
             for (int i=0;i<nums.length;i++){
                 int j=i+1;
                 int k=nums.length-1;

                 while(j<k){

                     if (nums[i]+nums[j]+nums[k]==0){
                         List<Integer> list=new ArrayList<>();
                         list.add(nums[i]);
                         list.add(nums[j]);
                         list.add(nums[k]);
                         set.add(list);
                         while(j<k&&nums[j]==nums[j+1]){
                             j++;
                         }
                         while(j<k&&nums[k]==nums[k-1]){
                             k--;
                         }
                         j++;
                         k--;
                     }
                     else if(nums[i]+nums[j]+nums[k]>0){
                         k--;
                     }
                     else {
                         j++;
                     }

                 }
             }
             return new ArrayList<>(set);
    }



}

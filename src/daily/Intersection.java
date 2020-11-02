package daily;

import java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109449679
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {

        if(nums1==null||nums2==null){
            return  null;
        }
        Set<Integer> ans=new HashSet<>();
        Set <Integer> set=new HashSet<>();
        for (int n:nums1
             ) {
            set.add(n);

        }
        for (int num:nums2
             ) {
            if(set.contains(num)){
                ans.add(num);
            }

        }
        int index=0;
        int [] res=new int[ans.size()];
        for (int tem: ans
             ) {
            res[index++]=tem;
        }
        return  res;
    }

    public static  void main(String [] args){
        Intersection intersection=new Intersection();
        int []nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersection.intersection(nums1,nums2)));
    }

}

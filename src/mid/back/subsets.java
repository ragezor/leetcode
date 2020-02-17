package mid.back;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102912087
import  java.util.*;
public class subsets {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res=new ArrayList<>();//存放结果
            List<Integer> l=new ArrayList<>();//遍历数组存放结果，也就是每一个分支
            if(nums==null){
                return null;
            }
            // Arrays.sort(nums);
            helper(l,res,nums,0);//递归函数
            return res;
        }
        //参数是两个list，现在还没加入到l的数组的位置和数组
        private void helper(List<Integer> l,List<List<Integer>> res,int[] nums,int pos){
            //因为java传的是引用，如果直接把list add进去，之后list变化后add进去的对象也会发生变化，这里相当于拍个快照add进去
            res.add(new ArrayList<Integer>(l));
            for(int i=pos;i<nums.length;i++){
                l.add(nums[i]);//把没有加入的int加入l
                helper(l,res,nums,i+1);//往下
                l.remove(l.size()-1);//回退到另一个
            }
        }
    }





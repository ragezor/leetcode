package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107282652
public class CountSmaller {
    public List<Integer> countSmaller(int[] nums) {
        Integer [] res=new Integer[nums.length];
        Arrays.fill(res,0);
        List<Integer> list = new ArrayList<>();
        TreeNode root = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            root = insert(root, new TreeNode(nums[i]), res, i);
        }
        return Arrays.asList(res);

    }

    public TreeNode insert(TreeNode root,TreeNode node,Integer [] res,int i){
        if(root==null){
            root=node;
            return  root;
        }
        if(root.val>=node.val){
            root.count++;
            root.left=insert(root.left,node,res,i);
        }
        else {
            res[i]+=root.count+1;
            root.right=insert(root.right,node,res,i);
        }
        return  root;
    }
    public  static void main(String[] args){
        CountSmaller countSmaller=new CountSmaller();
       int[] nums= {5,2,6,1};
        List<Integer>res=countSmaller.countSmaller(nums);
        System.out.println(res.toString());
    }

    }





    class TreeNode {
        int val;
        int count;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
            count = 0;
        }


}

package daily;

import java.util.LinkedList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107741584
public class Flatten {
    public static  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }
    public void flatten(TreeNode root) {
        List<TreeNode> list=new LinkedList<>();
        helper(list,root);
        int size=list.size();
        for (int i=1;i<size;i++){
            TreeNode pre=list.get(i-1);
            TreeNode cur=list.get(i);
            pre.right=cur;
            pre.left=null;
        }

    }

    public  void helper(List<TreeNode> list,TreeNode root){
        if(root!=null) {
            list.add(root);
            helper(list, root.left);
            helper(list, root.right);
        }
    }

    public  static  void main(String[] args){
        Flatten flatten=new Flatten();
        TreeNode root=new TreeNode(1);
         root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);;
        root.right=new TreeNode(5);
        root.right.right=new TreeNode(6);

        flatten.flatten(root);
        while(root.left!=null){
            System.out.println("错了");
        }
        while(root.right!=null){
            System.out.println(root.val);
            root=root.right;
        }
        System.out.println(root.val);

    }
}

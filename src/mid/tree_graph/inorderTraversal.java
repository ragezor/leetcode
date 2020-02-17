package mid.tree_graph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102825820
import  java.util.*;
public class inorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            inorderTraversal(root,list);
            return list;
        }
        private void inorderTraversal(TreeNode treenode, List<Integer> list){
            if(treenode!=null){
                inorderTraversal(treenode.left,list);
                list.add(treenode.val);
                inorderTraversal(treenode.right,list);
            }
        }

    }




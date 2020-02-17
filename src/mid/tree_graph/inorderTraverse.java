package mid.tree_graph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103223046
import  java.util.*;
public class inorderTraverse{

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


        public void inorderTraverse(TreeNode root,List list){
            if(root!=null){
                inorderTraverse(root.left,list);//左
                list.add(root.val);//根
                inorderTraverse(root.right,list);//右

            }
        }
        public int kthSmallest(TreeNode root, int k) {
            if(root==null){//空判断
                return 0;
            }
            List<Integer> list=new ArrayList<Integer>();
            inorderTraverse(root,list);
            return list.get(k-1);//第k小是k-1位置

        }




}

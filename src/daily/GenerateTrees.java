package daily;

import java.util.LinkedList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107490483
public class GenerateTrees {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
     }
  }


    public List<TreeNode> generateTrees(int n) {
      if (n==0){
          return new LinkedList<TreeNode>();
      }
      return  generateTrees(1,n);
    }
    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if(start>end){
            allTrees.add(null);
            return   allTrees;
        }
        for (int i=start;i<=end;i++){
            List<TreeNode> leftTrees=generateTrees(start,i-1);
            List<TreeNode> rightTrees = generateTrees(i + 1, end);

            for (TreeNode left:leftTrees){
                for (TreeNode right:rightTrees
                     ) {
                    TreeNode cur=new TreeNode(i);
                    cur.left=left;
                    cur.right=right;
                    allTrees.add(cur);

                }
            }
        }

return  allTrees;
    }


}

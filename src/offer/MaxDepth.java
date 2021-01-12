package offer;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null){
         return  0;
        }
//        int left_dep=root.left==null ?0: maxDepth(root.left)+1;
//        int right_dep=root.right==null ?0: maxDepth(root.right)+1;
        return  Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
}

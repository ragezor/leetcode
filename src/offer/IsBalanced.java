package offer;

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return (Math.abs(depth(root.left, 1) - depth(root.right, 1)) < 2) && (isBalanced(root.left) && isBalanced(root.right));



    }

    public int depth(TreeNode root, int curDepth){
        if(root==null){
            return  curDepth;
        }
        curDepth++;

        return  Math.max(depth(root.left,curDepth),depth(root.right,curDepth));
    }
}

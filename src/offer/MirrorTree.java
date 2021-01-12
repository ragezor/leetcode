package offer;



public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return  null;
        }
        TreeNode tem=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(tem);
        return  root;

    }


}

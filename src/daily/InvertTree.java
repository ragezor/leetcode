package daily;

public class InvertTree {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/108614068
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return  root;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return  root;

    }
}

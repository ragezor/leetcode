package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108702388
public class ConvertBST {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);


        }
        return root;

    }
}

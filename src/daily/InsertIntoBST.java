package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108879166
public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        if (val > root.val) {

            root.right = insertIntoBST(root.right, val);

        }
        return root;
    }
}
package daily;

import java.util.ArrayList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108572101
public class InorderTraversal {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorder(root.left);
        }
        ans.add(root.val);
        if (root.right != null) {
            inorder(root.right);
        }
    }
}

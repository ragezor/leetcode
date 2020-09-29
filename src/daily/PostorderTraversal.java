package daily;

import java.util.ArrayList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108861316
public class PostorderTraversal {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        post(root);
        return ans;

    }

    public void post(TreeNode root) {

        if (root == null) {
            return;
        }
        if (root.left != null) {
            postorderTraversal(root.left);
        }
        if (root.right != null) {
            postorderTraversal(root.right);
        }
        ans.add(root.val);


    }

}


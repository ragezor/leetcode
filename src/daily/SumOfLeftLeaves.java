package daily;

public class SumOfLeftLeaves {
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108676479
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root);


    }

    public int dfs(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            sum += isLeaf(root.left) ? root.left.val : dfs(root.left);
        }
        if (root.right != null && !isLeaf(root.right)) {
            sum += dfs(root.right);
        }
        return sum;

    }

    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}




package daily;

public class MaxPathSum {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/106890866
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
//MaxRes来存最大值
    int MaxRes = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        count(root);
        return MaxRes;

    }

    public int count(TreeNode root) {
//空就返回0
        if (root == null) {
            return 0;
        }
        //只要大于0的贡献值
        int LeftCount = Math.max(0, count(root.left));
        int RightCount = Math.max(0, count(root.right));
//更新最大值
        MaxRes=Math.max(MaxRes,root.val+LeftCount+RightCount);
        //更新贡献值  ，注意贡献值和最大值的区别，最大值是要取左右子树的，贡献值只用取大的那个
        return root.val + Math.max(LeftCount, RightCount);
    }

    public static void main(String[] args) {
        MaxPathSum maxPathSum = new MaxPathSum();
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxPathSum.maxPathSum(root));
    }
}

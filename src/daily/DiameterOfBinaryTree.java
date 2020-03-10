package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104773711
public class DiameterOfBinaryTree {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //叶子结点深度为1

    int path = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return path;
    }

    public int helper(TreeNode tem) {
        if (tem == null) {
            return 0;
        }
        int left = helper(tem.left);
        int right = helper(tem.right);
        path = Math.max(left + right, path);//更新最长路径 是否是左子树深+右子树深度
        return Math.max(left, right) + 1;//更新根节点深度

    }


    public static void main(String[] args) {
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right =new TreeNode(3) ;
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameterOfBinaryTree.diameterOfBinaryTree(root));
    }
}




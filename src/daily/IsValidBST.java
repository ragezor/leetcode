package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105929352
public class IsValidBST {
    public static class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

        public boolean helper(TreeNode node, Integer lower, Integer upper) {
            if (node == null) return true;

            int val = node.val;
            if (lower != null && val <= lower) return false;
            if (upper != null && val >= upper) return false;

            if (! helper(node.right, val, upper)) return false;
            if (! helper(node.left, lower, val)) return false;
            return true;
        }

        public boolean isValidBST(TreeNode root) {
            return helper(root, null, null);
        }



    public static  void main(String[] args){
        IsValidBST isValidBST =new IsValidBST();
        TreeNode root=new TreeNode(5);
        root.left= new TreeNode(1);
        root.right=new TreeNode(4);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(6);
        System.out.println(isValidBST.isValidBST(root));

    }

}

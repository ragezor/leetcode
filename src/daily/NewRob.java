package daily;

import java.util.HashMap;
import java.util.Map;
//总结地址https://blog.csdn.net/qq_43491066/article/details/107811827
public class NewRob {
    public  static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    Map<TreeNode, Integer> f = new HashMap<>();
    Map<TreeNode, Integer> g = new HashMap<>();

    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        f.put(root, root.val + g.getOrDefault(root.left, 0) + g.getOrDefault(root.right, 0));
        g.put(root, Math.max(g.getOrDefault(root.left, 0), f.getOrDefault(root.left, 0)) + Math.max(g.getOrDefault(root.right, 0), f.getOrDefault(root.right, 0)));
    }


    public static  void main(String[] args){
        NewRob rob=new NewRob();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=null;
        root.right.right=new TreeNode(1);
        root.left.left=null;
        root.left.right=new TreeNode(3);


        System.out.println(rob.rob(root));
    }

}

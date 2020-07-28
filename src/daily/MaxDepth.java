package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107627772
public class MaxDepth {

      public  static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public int maxDepth(TreeNode root) {
        if(root==null){
            return  0;
        }
          return  dfs(root);

    }

    public  int dfs(TreeNode node){

        int left=0,right=0;
          if(node.left!=null){
               left=dfs(node.left);
          }
        if(node.right!=null){
            right=dfs(node.right);
        }
        return  (Math.max(left,right)+1);

    }

    public static  void main(String[] args){
          MaxDepth maxDepth=new MaxDepth();
          TreeNode root=new TreeNode(3);
          root.left=new TreeNode(9);
          root.right=new TreeNode(20);
         root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(maxDepth.maxDepth(root));
    }



}

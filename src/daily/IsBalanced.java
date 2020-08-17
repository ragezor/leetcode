package daily;

public class IsBalanced {
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108048741
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return  true;
        }
        return  isBalanced(root.left)&&isBalanced(root.right)&&Math.abs(height(root.right)-height(root.left))<=1;

    }

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return  Math.max(height(root.left),height(root.right))+1;
    }

}

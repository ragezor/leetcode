package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109020987
public class GetMinimumDifference {
    int ans=Integer.MAX_VALUE;
    int pre=-1;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return  ans;

    }
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        if(pre==-1){
            pre=root.val;
        }
        else {
            ans=Math.min(ans,root.val-pre);
            pre=root.val;
        }
        dfs(root.right);
    }
}

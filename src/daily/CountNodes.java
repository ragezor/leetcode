package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/110038272
public class CountNodes {
    public int countNodes(TreeNode root) {
        return  dfs(root);

    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
       return  dfs(root.left)+dfs(root.right)+1;
    }
}

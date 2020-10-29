package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109361039
public class SumNumbers {
    public int sumNumbers(TreeNode root) {
        return  dfs(root,0);

    }
    public int dfs(TreeNode root,int PreSum){
        if(root==null){
            return  0;
        }
        int sum=PreSum*10+root.val;
        if (root.left==null&&root.right==null){
            return  sum;
        }
        else {
            return  dfs(root.left,sum)+dfs(root.right,sum);
        }

    }
}

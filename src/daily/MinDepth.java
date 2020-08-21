package daily;

public class MinDepth {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/108141613
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.right==null&&root.left==null){
            return  1;
        }
        int mindepth=Integer.MAX_VALUE;
        if(root.left!=null){
            mindepth=Math.min(mindepth,minDepth(root.left));
        }
        if(root.right!=null){
            mindepth=Math.min(mindepth,minDepth(root.right));
        }
        return  mindepth+1;

    }
}

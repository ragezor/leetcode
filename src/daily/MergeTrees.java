package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108745424
public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
       if(t1==null){
           return t2;
       }
        if(t2==null){
           return t1;
       }
       TreeNode node=new TreeNode(t1.val+t2.val);
        node.left=mergeTrees(t1.left,t2.left);
        node.right=mergeTrees(t1.right,t2.right);
        return  node;

    }
}

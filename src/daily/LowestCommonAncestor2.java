package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108820722
public class LowestCommonAncestor2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while(true){
            if(p.val<root.val&&q.val<root.val){
                root=root.left;
            }
           else if(p.val>root.val&&q.val>root.val){
                root=root.right;
            }
           else {
               return root;
            }
        }
    }
}

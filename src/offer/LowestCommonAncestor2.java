package offer;

public class LowestCommonAncestor2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor=root;
        while (true){
            if(ancestor.val>p.val&&ancestor.val>q.val){
                ancestor=ancestor.left;
            }
            else  if(ancestor.val<p.val&&ancestor.val<q.val){
                ancestor=ancestor.right;
            }
            else {
                break;
            }
        }
        return  ancestor;
    }
}

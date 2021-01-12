package offer;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null||root==p||root==q){
            return  root;
        }
        TreeNode lef=lowestCommonAncestor(root.left,p,q);
        TreeNode righ=lowestCommonAncestor(root.right,p,q);
        if(lef==null){
            return  righ;
        }
        if(righ==null){
            return  lef;
        }
        return  root;


    }
}

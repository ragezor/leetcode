package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107855332
public class IsSameTree {
    public static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return  true;
        }
        if(p==null||q==null){
            return  false;
        }
        if(p.val!=q.val){
            return  false;
        }

        return isSameTree(p.left,q.left)&&isSameTree(p.right ,q.right);

    }

    public static  void main(String[] args){
        IsSameTree isSameTree=new IsSameTree();
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        System.out.println(isSameTree.isSameTree(node,node));
    }
}

package daily;
//总结地址:https://blog.csdn.net/qq_43491066/article/details/105967937
public class IsSubtree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isSubtree(TreeNode s, TreeNode t) {
        //t为空 永远是
        if(t==null){
            return  true;
        }
        //s为空永远不说
        if(s==null){
            return false;
        }
        //子树是，或者一样
        return  isSubtree(s.left,t)||isSubtree(s.right,t)||isSame(s,t);
    }
    private  boolean isSame(TreeNode s, TreeNode t){
        //都空
        if(s==null&&t==null){
            return  true;
        }
        //一个空
       else    if(s==null||t==null){
            return  false;
        }
       //值不同
        if(s.val!=t.val){
            return  false;
        }
        //递归
        return isSame(s.right,t.right)&&isSame(s.left,t.left);
    }

    public static  void main(String[]args){
        IsSubtree subtree=new IsSubtree();
        TreeNode s1=new TreeNode(3);
        s1.right=new TreeNode(5);
        s1.left=new TreeNode(4);
        s1.left.left=new TreeNode(1);
        s1.left.right=new TreeNode(2);

        TreeNode t1=new TreeNode(4);
        t1.left=new TreeNode(1);
        t1.right=new TreeNode(2);
        System.out.println(subtree.isSubtree(s1,t1));
    }
}
package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106451517
public class IsSymmetric {
      public static class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public boolean isSymmetric(TreeNode root) {
          return  check(root,root);

    }
//左右两个指针
    public boolean check(TreeNode l,TreeNode r){
          //全空
          if(l==null&&r==null){
              return  true;
          }
          //一个空
          if(l==null||r==null){
              return  false;
          }
          //左右对应值相等，且左右自动对称
          return l.val==r.val&&check(l.left,r.right)&&check(l.right,r.left);
    }

    public static  void main(String[] args){
          IsSymmetric isSymmetric=new IsSymmetric();
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.right=new TreeNode(2);
          root.left.left=new TreeNode(3);
          root.left.right=new TreeNode(4);
          root.right.left=new TreeNode(4);
          root.right.right= new TreeNode(3);

        System.out.println(isSymmetric.isSymmetric(root));
    }
}

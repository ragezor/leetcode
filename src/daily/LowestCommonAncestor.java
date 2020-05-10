package daily;

import java.util.HashMap;
import java.util.HashSet;
import  java.util.Set;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/106032563
public class LowestCommonAncestor {
    //map存对应的父节点
    HashMap<Integer,TreeNode> map=new HashMap<>();
    //set存访问过的节点
    Set<Integer> visited=new HashSet<>();


    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //空处理
        if(root==null){
            return null;
        }
        //root就是目标
        if(root==p||root==q){
            return  root;
        }
        //左右递归
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right= lowestCommonAncestor(root.right,p,q);
        //左空返回右子树
        if(left==null){
            return  right;
        }
        //右空返回左子树
        else if(right==null){
            return  left;
        }
        //两边都有就是找到了
        else {
            return  root;
        }

    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        //往上找，把p的放进去
        while(p!=null){
            visited.add(p.val);
            p=map.get(p.val);
        }
        //q的值在p的父亲里
        while (q!=null){
            if(visited.contains(q.val)){
                return  q;
            }
            q=map.get(q.val);
        }
        return  null;

    }

    //dfs 把父节点对应搞定
    public void  dfs(TreeNode root){
        if(root.left!=null){
            map.put(root.left.val,root);
            dfs(root.left);
        }
        if(root.right!=null){
            map.put(root.right.val,root);
            dfs(root.right);
        }

    }

        public   static  void main(String[] args){
        TreeNode node=new TreeNode(3);
        node.left=new TreeNode(5);
        node.left.left=new TreeNode(6);
        node.left.right=new TreeNode(2);
        node.left.right.left=new TreeNode(7);
        node.left.right.right=new TreeNode(4);
        node.right=new TreeNode(1);
        node.right.left=new TreeNode(0);
        node.right.right=new TreeNode(8);

        LowestCommonAncestor lowestCommonAncestor=new LowestCommonAncestor();
            TreeNode res=lowestCommonAncestor.lowestCommonAncestor(node,node.left,node.left.right.right);
            TreeNode res2=lowestCommonAncestor.lowestCommonAncestor2(node,node.left,node.left.right.right);

            System.out.println(res==null? null:res.val);
            assert res != null;
            System.out.println(res2==null? null:res.val);

        }

}

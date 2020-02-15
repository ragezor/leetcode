package Senior.treeAndGraph;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/104003944
 */

public class maxPathSum {

    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

        int res=Integer.MIN_VALUE;//初始化
        public int maxPathSum(TreeNode root) {
            helper(root);//递归
            return res;
        }
        private int helper(TreeNode node){
            if(node==null) return 0;
            int left=Math.max(helper(node.left),0);//左子树正数
            int right=Math.max(helper(node.right),0);//右子树正数
            res=Math.max(res,left+right+node.val);//更新res
            return Math.max(left,right)+node.val;//非根节点则左右路径大的那个加根节点
        }
    }




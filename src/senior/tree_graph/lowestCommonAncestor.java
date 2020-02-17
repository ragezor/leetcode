package senior.tree_graph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103547192
public class lowestCommonAncestor {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

/*注意p,q必然存在树内, 且所有节点的值唯一!!!
        递归思想, 对以root为根的(子)树进行查找p和q, 如果root == null || p || q 直接返回root
        表示对于当前树的查找已经完毕, 否则对左右子树进行查找, 根据左右子树的返回值判断:
        1. 左右子树的返回值都不为null, 由于值唯一左右子树的返回值就是p和q, 此时root为LCA
        2. 如果左右子树返回值只有一个不为null, 说明只有p和q存在与左或右子树中, 最先找到的那个节点为LCA
        3. 左右子树返回值均为null, p和q均不在树中, 返回null
*/


        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) return root;//空处理
            if (root == p || root == q) return root;//如果根节点是要找的，那就返回这个root


            TreeNode left = lowestCommonAncestor(root.left, p, q);//分别找左右子树
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            if (left == null) {//左空，说明都在右子树，下同理
                return right;
            } else if (right == null) {
                return left;
            } else {//左右都有，那就是这个root
                return root;
            }


        }
    }





package tencent.search_sort;
import util.TreeNode;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104571228
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /*
         * @Description:递归
         * @Author: ragezor
         * @Date: 2020/2/29 11:33 上午
         * @Param [root, p, q]
         * @return util.TreeNode
         **/
        if (root == null || p == null || q == null) {
            return null;
        }
        while (root != null) {
            //都在右
            if (p.getVal() > root.getVal() && q.getVal() > root.getVal()) {
                root = root.getRight();
                //都在左
            } else if (p.getVal() < root.getVal() && q.getVal() < root.getVal()) {
                root = root.getLeft();
                //在两边
            } else {
                return root;
            }
        }
        return null;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        /*
         * @Description:非递归
         * @Author: ragezor
         * @Date: 2020/2/29 11:33 上午
         * @Param [root, p, q]
         * @return util.TreeNode
         **/
        if (root == null || p == null || q == null) {
            return null;
        }
        if (p.getVal() > root.getVal() && q.getVal() > root.getVal()) {
            return lowestCommonAncestor2(root.getRight(), p, q);
        } else if (p.getVal() < root.getVal() && q.getVal() < root.getVal()) {
            return lowestCommonAncestor2(root.getLeft(), p, q);
        } else return root;

    }

    public static void main(String[] args) {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        TreeNode root = new TreeNode(6);
        TreeNode left1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(0);
        TreeNode left3 = new TreeNode(4);
        TreeNode left4 = new TreeNode(3);
        TreeNode left5 = new TreeNode(5);
        TreeNode right1 = new TreeNode(8);
        TreeNode right2 = new TreeNode(7);
        TreeNode right3 = new TreeNode(9);

        root.setLeft(left1);

        root.setRight(right1);
        left1.setLeft(left2);
        left1.setRight(left3);
        left3.setLeft(left4);
        left3.setRight(left5);

        right1.setLeft(right2);
        right1.setRight(right3);

        System.out.println("非递归：" + "节点" + left1.getVal() + "和节点" + right2.getVal() + "的最近公共祖先是" + lowestCommonAncestor.lowestCommonAncestor(root, left1, right2).getVal());


        System.out.println("递归：" + "节点" + left1.getVal() + "和节点" + right2.getVal() + "的最近公共祖先是" + lowestCommonAncestor.lowestCommonAncestor2(root, left1, right2).getVal());

    }
}


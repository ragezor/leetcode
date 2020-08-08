package daily;
import java.util.ArrayList;
import java.util.List;
//总结地址：https://editor.csdn.net/md?articleId=107877194
public class RecoverTree {
    public class TreeNode {
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

    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        inorder(root, list);
        int[] swapped = findTwoSwapped(list);
        recover(root, 2, swapped[0], swapped[1]);


    }

    public void inorder(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);

    }

    public int[] findTwoSwapped(List<TreeNode> list) {
        int n = list.size();
        int x = -1, y = -1;
        for (int i = 0; i < n - 1; ++i) {
            if (list.get(i + 1).val < list.get(i).val) {
                y = list.get(i + 1).val;
                if (x == -1) {
                    x = list.get(i).val;
                } else {
                    break;
                }
            }
        }
        return new int[]{x, y};
    }

    public void recover(TreeNode root, int count, int x, int y) {
        if (root != null) {
            if (root.val == x || root.val == y) {
                root.val = root.val == x ? y : x;
                if (--count == 0) {
                    return;
                }
            }
            recover(root.right, count, x, y);
            recover(root.left, count, x, y);
        }
    }


}

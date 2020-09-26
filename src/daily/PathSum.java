package daily;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108807985
public class PathSum {
    List<List<Integer>> res = new LinkedList<>();
    Deque<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return res;

    }

    public void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            res.add(new ArrayList<>(path));
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
        path.removeLast();
    }


}

package offer;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {

        private List<List<Integer>> ret;

        public List<List<Integer>> levelOrder(TreeNode root) {
            ret = new ArrayList<>();
            dfs(0, root);
            return ret;
        }

        private void dfs(int depth, TreeNode root) {
            if (root == null) {
                return;
            }
            if (ret.size() == depth) {
                ret.add(new ArrayList<>());
            }
            ret.get(depth).add(root.val);
            dfs(depth + 1, root.left);
            dfs(depth + 1, root.right);
        }
    }


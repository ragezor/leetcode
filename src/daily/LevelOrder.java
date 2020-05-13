package daily;
import  java.util.*;
public class LevelOrder {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/106093442
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root==null) {
                return new ArrayList<List<Integer>>();
            }

            List<List<Integer>> res = new ArrayList<List<Integer>>();
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            //将根节点放入队列中，然后不断遍历队列
            queue.add(root);
            while(queue.size()>0) {
                //获取当前队列的长度，这个长度相当于 当前这一层的节点个数
                int size = queue.size();
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                //将队列中的元素都拿出来(也就是获取这一层的节点)，放到临时list中
                //如果节点的左/右子树不为空，也放入队列中
                for(int i=0;i<size;++i) {
                    TreeNode t = queue.remove();
                    tmp.add(t.val);
                    if(t.left!=null) {
                        queue.add(t.left);
                    }
                    if(t.right!=null) {
                        queue.add(t.right);
                    }
                }
                //将临时list加入最终返回结果中
                res.add(tmp);
            }
            return res;
        }
    }




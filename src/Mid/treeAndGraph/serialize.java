package Mid.treeAndGraph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103036225
import  java.util.*;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
public class serialize {



        private TreeNode node;

        public String serialize(TreeNode root) {
            node = root;
            return null;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            return node;
        }
    }


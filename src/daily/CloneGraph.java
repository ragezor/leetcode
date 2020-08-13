package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/107950854
public class CloneGraph {
    HashMap<Node, Node> visited = new HashMap<>();

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node clone = new Node(node.val, new ArrayList<>());
        visited.put(node, clone);
        for (Node neighbor : node.neighbors
        ) {
            clone.neighbors.add(neighbor);
        }

        return clone;

    }


}

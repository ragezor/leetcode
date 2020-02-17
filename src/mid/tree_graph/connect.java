package mid.tree_graph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102833812
public class connect {

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

        public Node connect(Node root) {

            if(root==null){
                return root;
            }
            if(root.left!=null){//最小左子树除外，因为它没有子了
                root.left.next=root.right;
                if(root.next!=null){//它的爸爸连上了它才能去连
                    root.right.next=root.next.left;
                }
            }

            connect(root.left);
            connect(root.right);

            return root;}
    }




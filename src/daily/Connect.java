package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108842230
public class Connect {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node() {
        }
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if(root==null||(root.left==null&&root.right==null)){
            return  root;
        }
        if(root.left!=null&&root.right!=null){
            root.left.next=root.right;
            root.right.next=getrightnext(root);
        }
        if(root.left==null){
            root.right.next=getrightnext(root);
        }
        if(root.right==null){
            root.left.next=getrightnext(root);
        }
        root.right=connect(root.right);
        root.left=connect(root.left);
        return  root;

    }

    public static  Node getrightnext(Node root) {
        while (root.next != null) {
            if (root.next.left != null) {
                return root.next.left;
            }
            if (root.next.right != null) {
                return root.next.right;
            }
            root = root.next;
        }
        return null;
    }
}
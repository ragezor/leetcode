package daily;

import java.util.LinkedList;
import java.util.Queue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109089755
public class Connect2 {

    public  class  Node{
        int val;
        Node left;
        Node right;
        Node next;
    }
    public Node connect(Node root) {
        if(root==null){
            return  root;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for (int i=0;i<size;i++){
                Node node=queue.poll();
                if(i<size-1){
                    node.next=queue.peek();
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return  root;

    }
}

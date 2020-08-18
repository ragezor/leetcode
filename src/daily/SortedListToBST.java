package daily;

public class SortedListToBST {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/108069880
    public TreeNode sortedListToBST(ListNode head) {
        return  build(head,null);

    }

    public TreeNode build(ListNode left,ListNode right){
        if(left==right){
            return  null;
        }

        ListNode mid= getmid(left, right);
        TreeNode root=new TreeNode(mid.val);
        root.left=build(left,mid);
        root.right=build(mid.next,right);
        return  root;

    }


    public ListNode getmid(ListNode left,ListNode right){
        ListNode slow=left;
        ListNode fast=left;
        while(fast!=right&&fast.next!=right){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}

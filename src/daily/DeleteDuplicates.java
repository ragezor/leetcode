package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/115202790
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head== null){
            return  head;
        }
        ListNode dummy=new ListNode(0,head);
        ListNode  cur=dummy;
        while (cur.next!=null&&cur.next.next!=null){
            if(cur.next.val==cur.next.next.val){
                int tem=cur.next.val;

                while (cur.next!=null&&cur.next.val==tem){
                    cur.next=cur.next.next;
                }
            }
            else {
                cur=cur.next;
            }
        }
        return  dummy.next;

    }
}

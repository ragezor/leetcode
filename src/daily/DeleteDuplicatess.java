package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/115249166
public class DeleteDuplicatess {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return  head;

        }
        ListNode  cur=head;
        while (cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next=cur.next.next;
            }
            else {
                cur=cur.next;
            }
        }
        return  head;


    }
}


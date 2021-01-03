package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/112132181
public class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode  large=new ListNode(0);
        ListNode  largehead=large;
        ListNode  small=new ListNode(0);
        ListNode smallhead=small;
        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=small.next;
            }
            else {
                large.next=head;
                large=large.next;
            }
            head=head.next;
        }
        large.next=null;
        small.next=largehead.next;
        return  smallhead.next;



    }
}

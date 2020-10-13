package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109043658
public class SwapPairs {
//    public ListNode swapPairs(ListNode head) {
//        ListNode p = new ListNode(0);
//        p.next = head;
//        ListNode temp = p;
//        while (temp.next != null && temp.next.next != null) {
//            ListNode node1 = temp.next;
//            ListNode node2 = temp.next.next;
//            temp.next = node2;
//            node1.next = node2.next;
//            node2.next = node1;
//            temp = node1;
//        }
//        return p.next;
//
//    }
public ListNode swapPairs(ListNode head) {
    if(head==null||head.next==null){
        return  head;
    }
    ListNode newHead=head.next;
    head.next=swapPairs(newHead.next);
    newHead.next=head;
    return  newHead;
}

}

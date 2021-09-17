//package daily;
////总结地址：https://blog.csdn.net/qq_43491066/article/details/109145599
//
//public class RemoveNthFromEnd {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//        ListNode first=head;
//        ListNode dummy=new ListNode(0, head);
//        dummy.next=head;
//        ListNode second=dummy;
//        for (int i = 0; i <n ; ++i) {
//            first=first.next;
//
//        }
//        while(first!=null){
//            first=first.next;
//            second=second.next;
//        }
//        second.next=second.next.next;
//        return  dummy.next;
//
//
//    }
//
//    public static  void main(String[] args){
//        RemoveNthFromEnd removeNthFromEnd=new RemoveNthFromEnd();
//        ListNode head=new ListNode(1, head);
//        head.next=new ListNode(2, head);
//        head.next.next=new ListNode(3, head);
//        head.next.next.next=new ListNode(4, head);
//        head.next.next.next.next=new ListNode(5, head);
//
//        ListNode ans=removeNthFromEnd.removeNthFromEnd(head,2);
//        while(ans!=null){
//            System.out.println(ans.val);
//            ans=ans.next;
//        }
//
//    }
//}

package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108916148
public class AddTwoNumber {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if(l1==null){
//            return l2;
//        }
//        if(l2==null){
//            return  l1;
//        }
//        int tem=(l1.val+l2.val)%10;
//        int plus=(l1.val+l2.val)/10;
//
//        ListNode res=new ListNode(tem, head);
//        ListNode head=res;
//        while (l1.next!=null&&l2.next!=null){
//            l1=l1.next;
//            l2=l2.next;
//             tem=(l1.val+l2.val+plus)%10;
//             res.next=new ListNode(tem, head);
//             res=res.next;
//            plus=(l1.val+l2.val+plus)/10;
//        }
//        while (l1.next!=null){
//            l1=l1.next;
//            tem=(l1.val+plus)%10;
//            res.next=new ListNode(tem, head);
//            res=res.next;
//            plus=(l1.val+plus)/10;
//        }
//        while (l2.next!=null){
//            l2=l2.next;
//            tem=(l2.val+plus)%10;
//            res.next=new ListNode(tem, head);
//            res=res.next;
//            plus=(l2.val+plus)/10;
//        }
//        if(plus!=0){
//            res.next=new ListNode(plus, head);
//        }
//        return  head;
//
//    }
}

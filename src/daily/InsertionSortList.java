package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109852299
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {

        if(head==null){
            return  head;
        }
        ListNode dummyHead=new ListNode(0, head);
        dummyHead.next=head;
        ListNode last=head, curr=head.next;
        while(curr!=null){
            if(last.val<=curr.val){
                last=last.next;
            }
            else {
                ListNode pre=dummyHead;
                while(pre.next.val<=curr.val){
                    pre=pre.next;
                }

                last.next = curr.next;
                curr.next = pre.next;
                pre.next = curr;
            }
            curr = last.next;
        }
        return dummyHead.next;
    }
}


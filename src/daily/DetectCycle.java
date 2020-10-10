package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108989917
public class DetectCycle {
    ListNode slow;
    ListNode fast;
    public ListNode detectCycle(ListNode head) {
        if(!hasCycle(head)){
            return  null;
        }
        ListNode ptr=head;
        while(ptr!=slow){
            slow=slow.next;
            ptr=ptr.next;
        }
        return  ptr;



    }

    public boolean hasCycle(ListNode head){
        if(head==null){
            return  false;
        }
         slow=head;
         fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return  true;
            }
        }
        return  false;
    }

}

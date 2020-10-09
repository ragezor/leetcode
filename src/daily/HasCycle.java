package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108972014
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return  false;
        }
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return  true;
            }
        }
        return  false;

    }
}

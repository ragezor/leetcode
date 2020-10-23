package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109235000
public class IsPalindrome3 {
    public boolean isPalindrome(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode pre=null;
        ListNode p=slow;
        while (p!=null){
            ListNode tem=p.next;
            p.next=pre;
            pre=p;
            p=tem;
        }
        while(pre!=null){
            if(pre.val==head.val){
                pre=pre.next;
                head=head.next;
            }
            else {
                return  false;
            }
        }
        return  true;

    }

}

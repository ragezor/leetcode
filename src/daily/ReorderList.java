package daily;

public class ReorderList {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/109182397
    public void reorderList(ListNode head) {
        if(head==null){
            return ;
        }
        ListNode mid=findMiddle(head);
        ListNode h1=head;
        ListNode h2=mid.next;
        mid.next=null;
        h2=reverse(h2);
         merge(h1,h2);

    }
    public ListNode findMiddle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return  slow;
    }

    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode tem=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tem;
        }
        return  pre;
    }

    public  void merge(ListNode h1,ListNode h2){
        ListNode tem1;
        ListNode tem2;
        while(h1!=null&&h2!=null){
             tem1=h1.next;
            tem2=h2.next;
            h1.next=h2;
            h1=tem1;
            h2.next=h1;
            h2=tem2;
        }

    }
}

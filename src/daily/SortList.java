package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109891337
public class SortList {
    public ListNode sortList(ListNode head) {
        return  sort(head,null);

    }
    //sort进行递归，划分区间是head到tail
    public ListNode sort(ListNode head,ListNode tail){
        if(head==null){
            return  null;
        }
        if (head.next == tail) {
            head.next=null;
            return  head;
        }
        ListNode slow=head,fast=head;
        //快慢指针找中间节点
        while(fast!=tail){
            slow=slow.next;
            fast=fast.next;
            if(fast!=tail){
                fast=fast.next;
            }
        }
        ListNode mid=slow;
        //分别递归
        ListNode listNode1=sort(head,mid);
        ListNode listNode2=sort(mid,tail);
        //对两个已经有序的子区间进行合并
        ListNode ans=merge(listNode1,listNode2);
        return  ans;
    }


//合并函数
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode temp = dummyHead,temp1=head1,temp2=head2;
        while (temp1!=null&&temp2!=null){
            //两个都有时选小的
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else {
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        //一个为空时直接把头按到主表上
        if(temp1!=null){
            temp.next=temp1;
        }
        if(temp2!=null){
            temp.next=temp2;
        }
        return  dummyHead.next;

    }
}
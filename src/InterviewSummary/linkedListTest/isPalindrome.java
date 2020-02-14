package InterviewSummary.linkedListTest;
/*
*请判断一个链表是否为回文链表。
* 想法
* 自然的想法是找到前半段后半段进行比对 那么就两个难点
怎么找到中间的点
以及怎么将后半段反转进行比对
因为是链表
中间节点自然想到快慢指针
然后将后半段反转即可比对
详见代码
* 总结地址 https://blog.csdn.net/qq_43491066/article/details/104122569
 */
public class isPalindrome {
    public class ListNode {
      int val;
   ListNode next;
    }
        public boolean isPalindrome(ListNode head) {
        //空或者只有一个节点 那就是
        if(head==null||head.next==null){
            return true;
        }
        //快慢指针
        ListNode slow=head;
        ListNode quick=head;
        //现在slow的位置就是中间的那个节点
        while(quick!=null&&quick.next!=null){
            quick=quick.next.next;
            slow=slow.next;
        }
        ListNode pre=null;
        ListNode p=slow;
        //中间节点以后的都反转
        while(p!=null){
            ListNode temp=p.next;
            p.next=pre;
            pre=p;
            p=temp;
        }
        //两遍遍历 碰到不同的就false
        while(pre!=null){
            if(pre.val==head.val){
                pre=pre.next;
                head=head.next;
            }
            else{
                return false;
            }
        }
        return true;
    }

}

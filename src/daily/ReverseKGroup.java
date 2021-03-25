package daily;

class ListNode {
     int val;
      ListNode next;
      ListNode(int x, ListNode head) { val = x; }
  }
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return  null;
        ListNode cur=head;
        int i=k;
        while(i>0&&cur!=null){
            cur=cur.next;
            i--;
        }
        if(i>0) return  head;
        ListNode pre=reverseKGroup(cur,k);
        cur = head;
        i = k;
        while(i>0){
            ListNode tmp = cur.next;
            cur.next= pre;
            pre = cur;
            cur = tmp;
            i--;
        }
        return pre;



    }
}

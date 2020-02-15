package InterviewSummary.linkedListTest;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103526839
public class sortList {

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

        public ListNode sortList(ListNode head) {
            /* 空或者只有一个节点 */
            if (head == null || head.next == null)
                return head;
            ListNode fast = head.next, slow = head;
            while (fast != null && fast.next != null) {//通过快慢指针来取得中间数，很重要的一种方法
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode tmp = slow.next;
            slow.next = null;//隔断
            ListNode left = sortList(head);
            ListNode right = sortList(tmp);
            ListNode h = new ListNode(0);
            ListNode res = h;
            //合并
            while(left!=null&&right!=null){
                if (left.val < right.val) {
                    h.next = left;
                    left = left.next;
                } else {
                    h.next=right;
                    right=right.next;
                }
                h=h.next;
            }
            h.next = left != null ? left : right;
            return res.next;

        }
    }




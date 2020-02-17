package bytedance.linked_tree;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104340139
public class detectCycle {

     class ListNode {
         int val;
          ListNode next;
          ListNode(int x) {
             val = x;
             next = null;
          }
      }


        public ListNode detectCycle(ListNode head) {
            if(head==null||head.next==null){
                return null;
            }
            ListNode slow=head;
            ListNode fast=head;

            while(true){
                if(fast==null||fast.next==null){
                    return null;
                }
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    break;
                }
            }
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;

            }
            return fast;


        }
    }


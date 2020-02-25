package tencent.linked_list;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104495068
public class RotateRight {


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public ListNode rotateRight(ListNode head, int k)
        {
            if(k==0)
                return head;
            if(head==null)
                return head;
            int length=1;
            ListNode cur=head;
            while(cur.next!=null)
            {
                cur=cur.next;
                length++;
            }
            cur.next=head;//已经把链表首尾相接的连上了
            int m=length-k%length;//这个是算法的关键，找到应该在何处断开
            for(int i=0;i<m;i++)
            {
                cur=cur.next;
            }
            ListNode newhead=cur.next;//获得新的链表头节点
            cur.next=null;//断开链表环
            return newhead;
        }
    }


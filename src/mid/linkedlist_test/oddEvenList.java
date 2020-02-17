package mid.linkedlist_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103179510
public class oddEvenList {
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

        public ListNode oddEvenList(ListNode head) {
            if(head==null||head.next==null){//判断为空
                return head;
            }
            ListNode tem=head;//这个链表用来存奇数

            ListNode node=head.next;//这个链表用来存偶数
            ListNode EvenHead=head.next;//这是头节点，存一下
            while(node!=null&&node.next!=null){
                //把奇数剔出来
                head.next=head.next.next;
                head=head.next;
                //把偶数剔出来
                node.next=node.next.next;
                node=node.next;
            }
            //奇数的末尾就是node和偶数的头节点连接起来
            head.next=EvenHead;
            return tem; }

    }






package interviewsummary.linkedlist_test;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/103511219
 */
import  java.util.*;
public class mergeKLists {


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

        public ListNode mergeKLists(ListNode[] lists) {

            PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b)->a.val-b.val);
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null){
                    queue.add(lists[i]);
                }
            }
            if(queue.isEmpty()){
                return null;
            }
            ListNode temp=new ListNode(queue.peek().val);
            ListNode head=temp;

            while(!queue.isEmpty()){
                ListNode p=queue.poll();
                temp.next=p;
                temp=temp.next;
                if(p.next!=null){
                    queue.offer(p.next);
                }
            }

            return head.next;          }

    }




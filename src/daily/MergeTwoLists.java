package daily;

import java.util.Comparator;
import java.util.PriorityQueue;
//总结地址:https://blog.csdn.net/qq_43491066/article/details/105875858
public class MergeTwoLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        //优先队列形成堆
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
//放入堆
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                queue.add(l1);
                l1 = l1.next;
            }
            if (l2 != null) {
                queue.add(l2);
                l2 = l2.next;
            }
        }


        ListNode res = new ListNode(-1);
        ListNode head = res;
        //出堆
        while (!queue.isEmpty()) {
            res.next = queue.poll();
            res = res.next;
        }
        res.next = null;
        return head.next;

    }
//递归，空返回，小的放前边
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return  l1;
        }
        if(l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        l2.next=mergeTwoLists(l1,l2.next);
            return  l2;
        }


    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode l1 = new ListNode(-10);
        l1.next = new ListNode(-9);
        l1.next.next = new ListNode(-6);
        l1.next.next.next = new ListNode(-4);
        l1.next.next.next.next = new ListNode(1);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);


        ListNode l2 = new ListNode(-5);
        l2.next = new ListNode(-3);
        l2.next.next = new ListNode(0);
        l2.next.next.next = new ListNode(7);
        l2.next.next.next.next = new ListNode(8);
        l2.next.next.next.next.next = new ListNode(8);


        ListNode tem = mergeTwoLists.mergeTwoLists(l1, l2);
        while (tem.next != null) {
            System.out.print(tem.val + "->");
            tem = tem.next;
        }
        System.out.print(tem.val);

    }
}

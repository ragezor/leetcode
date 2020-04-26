package daily;
import java.util.Comparator;
import java.util.PriorityQueue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105766446
public class MergeKLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        //空处理
        if(lists==null||lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> heap=new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        //放入堆
        for(ListNode node:lists){
            while (node!=null){
                heap.add(node);
                //每个链表的每个节点都放进去
                node=node.next;
            }
        }
        if(heap.isEmpty()){
            return null;
        }
        //指针
        ListNode tem=new ListNode(-1);
        ListNode head=tem;
        //吐出来
        while(!heap.isEmpty()){
            tem.next=heap.poll();
            tem=tem.next;
        }
        tem.next=null;
        return  head.next;


    }
    public static  void main (String[] args){
        MergeKLists mergeKLists=new MergeKLists();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(5);

        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);

        ListNode l3=new ListNode(2);
        l3.next=new ListNode(6);

        ListNode[] lists={l1,l2,l3};


        ListNode res=mergeKLists.mergeKLists(lists);
        while(res.next!=null){
            System.out.print(res.val+"->");
            res=res.next;
        }
        System.out.print(res.val);

    }
}

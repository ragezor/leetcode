package daily;

import java.util.HashSet;
import java.util.Set;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106968247
public class RemoveDuplicateNodes {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null){
            return  null;
        }
        Set<Integer> set=new HashSet<>();

        ListNode node=head;
        set.add(node.val);
        while(node.next!=null){
           if(set.add(node.next.val)){
               node=node.next;
           }
           else {
               node.next=node.next.next;
           }
        }
        node.next=null;
        return  head;

    }
    public static  void  main(String[] args){
        RemoveDuplicateNodes removeDuplicateNodes=new RemoveDuplicateNodes();
        //[1, 2, 3, 3, 2, 1]
        int [] val={1, 2, 3, 3, 2, 1};
        ListNode head=new ListNode(1);
        ListNode node=head;
        for (int i=1;i<val.length;i++){
            node.next=new ListNode(val[i]);
            node=node.next;
        }



        ListNode res=removeDuplicateNodes.removeDuplicateNodes(head);
         while (res.next!=null){
            System.out.println(res.val);
            res=res.next;
        }
        System.out.println(res.val);
    }

}

package offer;

import java.util.Arrays;
import java.util.Stack;

public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        Stack <Integer> stack=new Stack<>();
        while (head!=null){
            stack.add(head.val);
            head=head.next;
        }
        int len=stack.size();
        int [] res=new int[len];
        int index=0;
        while (!stack.isEmpty()){
            res[index]=stack.pop();
            index++;
        }
        return  res;

    }

    public  static  void main(String[] args){
        ReversePrint reversePrint=new ReversePrint();
        ListNode node=new ListNode(1);
        node.next=new ListNode(3);
        node.next.next=new ListNode(2);
        System.out.println(Arrays.toString(reversePrint.reversePrint(node)));
    }
}

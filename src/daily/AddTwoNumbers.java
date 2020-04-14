package daily;
import  util.ListNode;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105505660
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        //用栈反转，下同
        while (l1!=null){
            stack1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            stack2.push(l2.val);
            l2=l2.next;
        }
        ListNode last=null;
        //进位
        int  carry=0;
        //栈吐出来
        while(!stack1.isEmpty()||!stack2.isEmpty()||carry!=0){
            int sum=carry;
            if(!stack1.isEmpty()){
                sum+=stack1.pop();
            }
            if(!stack2.isEmpty()){
                sum+=stack2.pop();
            }
            //此时位数
            ListNode tem=new ListNode(sum%10);
            //放到现在的前边
            tem.next=last;
            last=tem;
            //新的进位
            carry=sum/10;

        }
        return  last;

    }

    public  static  void main(String [] args){
        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();
        ListNode l1=new ListNode(7);
        ListNode l2=new ListNode(5);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(3);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);



        ListNode head=addTwoNumbers.addTwoNumbers(l1,l2);
        while(head!=null){
            if(head.next==null){
                System.out.print(head.val);
            }
            else {
                System.out.print(head.val + "->");

            }
            head = head.next;
        }
    }
}

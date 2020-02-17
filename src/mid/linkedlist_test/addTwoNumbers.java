package mid.linkedlist_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102789937
public class addTwoNumbers {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int yu=0;//sum/10的余数，也就是放到实际数位的数
            int jin=0;//进位的数
            int sum=0;//每一轮的两个数➕上一轮的进位
            ListNode l3=new ListNode(0);
            ListNode l4=l3;
            if(l1==null){//在代码中考虑情况越细，其实运行越快
                l1=new ListNode(0);
            }
            if(l2==null){
                l2=new ListNode(0);
            }
            while(l1!=null||l2!=null||jin!=0){
                sum=((l1 != null)? l1.val : 0) + ((l2 != null) ? l2.val : 0) + jin;//这是要点，不然会报空指针
                yu=sum%10;
                if(sum>9){
                    jin=1;
                }
                else{
                    jin=0;
                }

                l4.next=new ListNode(yu);
                l1 = (l1 != null) ? l1.next : l1;//这是要点，不然会报空指针
                l2 = (l2 != null) ? l2.next : l2;//这是要点，不然会报空指针
                l4=l4.next;
            }
            return l3.next;
        }
    }


}

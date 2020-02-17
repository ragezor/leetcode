package mid.linkedlist_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102803727
public class getIntersectionNode {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            //都空
            if(headA==null||headB==null){
                return null;
            }

            ListNode pa=headA;
            ListNode pb=headB;
            boolean isPaChange=false;//记录有没有去另外一条链
            boolean isPbChange=false;
            //3.
            while(pa!=null&&pb!=null){
                //找到
                if(pa==pb){
                    return pa;
                }
                //往后
                pa=pa.next;
                pb=pb.next;
                //这就说明 没找到
                if(isPaChange&&isPbChange&&pa==null&&pb==null){
                    break;
                }
                //跳到另一条
                if(pa==null){
                    pa=headB;
                    isPaChange=true;
                }
                if(pb==null){
                    pb=headA;
                    isPbChange=true;
                }
            }

            return null;
        }
    }




package InterviewSummary.linkedListTest;
/*
题干：请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
说明:
链表至少包含两个节点。 链表中所有节点的值都是唯一的。 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
不要从你的函数中返回任何结果。
想法
一看题干 你将只被给定要求被删除的节点
所以遍历再将此节点的前节点连到现在的后一个的常规方法不行
并且此node之前的其实和题无关
所以想到这样一个方法
：将node的值赋为node的next
并且将node连接到next的next
删除next
————————————————
总结地址：https://blog.csdn.net/qq_43491066/article/details/104122685
 */
public class deleteNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }


        public void deleteNode(ListNode node) {
            //后一个节点的值赋到删除
            node.val = node.next.val;
            //摘下next节点
            node.next = node.next.next;
        }
    }
}


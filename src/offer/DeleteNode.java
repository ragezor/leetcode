package offer;

public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        if (head.val == val) {
            return head.next;
        }

        ListNode preNode = head;
        ListNode curNode = head.next;
        while (curNode != null && curNode.val != val) {
            preNode = curNode;
            curNode = curNode.next;
        }

        preNode.next = (curNode==null) ? null : curNode.next;
        return head;
    }

}

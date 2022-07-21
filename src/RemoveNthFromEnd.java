/*
 * Title: Remove Nth Node From End of List
 * 
 * Problem: Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/20/2022
 * 
 * Solution: Run a fast pointer n times so that its n places ahead of the slow pointer. Now when you increment them both at the same time
 * slow will eventually end up at the nth from the end node, and can be removed.
 * Time Complexity: O(n)
 */

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = null;
        ListNode fast = head;
        // if the size is 1
        if (fast.next == null) return null;
        // Get the fast pointer value to n
        for (int i = 1; i <= n;i++) fast = fast.next;
        if (fast == null) return head.next;
        // run fast until it reaches the end of the list, and slow will then            reach (Linked List size) - n.
        while (fast != null) {
            if (slow == null) slow = head;
            else slow = slow.next;
            fast = fast.next;
        }
        if (slow == null) return head.next;
        //remove the node
        slow.next = slow.next.next;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

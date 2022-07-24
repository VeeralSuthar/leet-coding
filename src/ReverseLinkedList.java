/*
 * Title: Reverse A Linked List
 * 
 * Problem: Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/24/2022
 * 
 * Solution: Iterative and recursive solution
 * Time Complexity: Iterative: Recursive: 
 */

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode iterativelyReverseList(ListNode head) {
        ListNode prev = null;
        
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public ListNode recursivelyReverseList(ListNode head) {
        return reverse(head,null);
    } 
    private ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverse(next, head);
    }
    
}

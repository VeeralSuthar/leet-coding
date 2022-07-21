/* Title: Middle of the Linked List
 * 
 * Problem: Given the head of a singly linked list, return the middle node of the linked list.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/18/2022
 * 
 * Solution: First we go through the linked list to get the size of the linked list and save its size in the count variable. Then we just go through
 * the the list until we get to the count/2 index and return that value.
 * Time Complexity: O(n)
 */
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode curs = head;
        
        while (curs != null) {
            curs = curs.next;
            count++;
        }
        
        for (int i = 0; i < (count/2);i++) {
            head = head.next;
        }
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

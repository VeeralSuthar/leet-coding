/*
 * Title: Remove Duplicates for a Linked List II
 * 
 * Problem: Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from 
 * the original list. Return the linked list sorted as well.
 * 
 * Author: Veeral Suthar
 *
 * Date: 08/06/2022
 * 
 * 
 * Solution: used 2 pointers.
 * * * * 
 * Time Complexity: O(N)
 */


public class RemoveDupsFromLL2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode ret = new ListNode(-1);
        ListNode curr = ret;
        ListNode tracker = head; // tracks the last node of the repeating number
        curr.next = tracker;
        
        while (tracker != null) {
            while (tracker.next != null && tracker.val == tracker.next.val) {
                tracker = tracker.next;
            }
            if (curr.next != tracker) {
                curr.next = tracker.next; //remove the dups.
    		    tracker = curr.next;     //reposition the fast pointer.
    	    } else { //no dup, move down both pointer.
    		    curr = curr.next;
    		    tracker = tracker.next;
    	    }
        }
        return ret.next;
    }
}
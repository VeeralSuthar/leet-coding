/* Title: Merge Two Sorted Lists
 * 
 * Problem: You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list. 
 * The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/24/2022
 * 
 * Solution: Recursive approach.
 * Time Complexity: O(m+n). At every recursion call we are adding 1 node.
 */

public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        //whichever is the lowest overall value will act as the head node of the merged list
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

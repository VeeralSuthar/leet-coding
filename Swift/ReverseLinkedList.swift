/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public var val: Int
 *     public var next: ListNode?
 *     public init() { self.val = 0; self.next = nil; }
 *     public init(_ val: Int) { self.val = val; self.next = nil; }
 *     public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
 * }
 */
class ReverseLinkedList {

    // Iteratively reverse the linked list
    func reverseList(_ head: ListNode?) -> ListNode? {
        var prev: ListNode? = nil
        var curr: ListNode? = head
        while curr != nil {
            let temp: ListNode? = curr?.next
            curr?.next = prev
            prev = curr
            curr = temp
        }
        return prev
    }

    // Recusively reverse the linked list
    func recursivelyReverseList(_ head: ListNode?) -> ListNode? {
        
        // Empty List
	    guard let head = head else { return nil }
        // Base Case
	    guard let next = head.next else { return head }

	    let new = recursivelyReverseList(next)
	    next.next = head
	    head.next = nil

	    return new   
    }
}

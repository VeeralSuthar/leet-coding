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
class MiddleOfLinkedList {
    func middleNode(_ head: ListNode?) -> ListNode? {
        var middle: Int = llCount(head)/2
        var ret: ListNode? = head
        for i in 0..<middle {
            ret = ret?.next
        }
        return ret
    }

    // Function to get the count of the linked list. Ideally would be a ListNode class function
    func llCount(_ node: ListNode?) -> Int {
        var count: Int = 1
        var pointer: ListNode? = node

        while (pointer?.next != nil) {
            count += 1
            pointer = pointer?.next
        }
        return count
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public var val: Int
 *     public var next: ListNode?
 *     public init(_ val: Int) {
 *         self.val = val
 *         self.next = nil
 *     }
 * }
 */

class LLCycle2 {
    func detectCycle(_ head: ListNode?) -> ListNode? {
        
        guard head?.next != nil else { return nil }
        var slow: ListNode? = head
        var fast: ListNode? = head
        while (slow?.next != nil || fast?.next?.next != nil) {
            slow = slow?.next
            fast = fast?.next?.next
            guard slow !== fast else { break }
        }
                slow = head
        while slow !== fast {
            slow = slow?.next
            fast = fast?.next
        }
        return slow
    }

    // Uses UnsafeMutableRawPointer to access the raw pointer in memory
    func swiftyDetectCycle(_ head: ListNode?) -> ListNode? {
        var rawPointerSet: Set<UnsafeMutableRawPointer> = []
        var pointer: ListNode? = head

        while pointer != nil {
            let res = rawPointerSet.insert(Unmanaged.passUnretained(pointer!).toOpaque())
            if !res.inserted { return pointer }
            pointer = pointer?.next
       }
       return nil
    }
}
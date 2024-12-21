/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     public var val: Int
 *     public var next: ListNode?
 *     public init() { self.val = 0; self.next = nil; }
 *     public init(_ val: Int) { self.val = val; self.next = nil; }
 *     public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
 * }
*/
class MergeSortedLists {
    func mergeTwoLists(_ list1: ListNode?, _ list2: ListNode?) -> ListNode? {

        // If either list is NIL, return the other one.
        if (list1 == nil || list2 == nil) { return list1 == nil ? list2: list1 }

        // Recurisvely implement sort 
        if (list1!.val <= list2!.val) {
            list1?.next = mergeTwoLists(list1?.next, list2)
            return list1
        } else {
            list2?.next = mergeTwoLists(list1, list2?.next)
            return list2
        }
    }
}

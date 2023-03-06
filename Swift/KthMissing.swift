/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.
*/

class KthMissing {
    func findKthPositive(_ arr: [Int], _ k: Int) -> Int {
        (0...arr.count+k).filter { !arr.contains($0) }[k]
    }
}
class Solution {
    func runningSum(_ nums: [Int]) -> [Int] {
        var ret: [Int] = nums
        for i in 1..<ret.count {
            ret[i] = ret[i] + ret[i-1]
        }
        return ret
    }
}
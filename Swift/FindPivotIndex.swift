class Solution {
    func pivotIndex(_ nums: [Int]) -> Int {
        var right: Int = 0
        var left: Int = 0

        for i in 0..<nums.count {
            right += nums[i]
        }

        for i in 0..<nums.count {
            right -= nums[i]
            if left == right {
                return i 
            }
            left += nums[i]
        }
        return -1
    }
}
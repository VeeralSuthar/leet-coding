class SearchInsertPosition {
    func searchInsert(_ nums: [Int], _ target: Int) -> Int {
        var low: Int = 0
        var high: Int = nums.count-1

        repeat {
            var mid: Int = low + (high-low) / 2
            if (nums[mid] == target) { return mid }
            nums[mid] > target ? (high = mid-1) : (low = mid+1)
        } while (low <= high)
        return low
    }
}
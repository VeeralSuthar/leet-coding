/**
 * The knows API is defined in the parent class VersionControl.
 *     func isBadVersion(_ version: Int) -> Bool{}
 */

class IsBadVersion : VersionControl {
    func firstBadVersion(_ n: Int) -> Int {
        
        var high = n
        var low = 1
        
        repeat {
            var mid = low+(high-low)/2
            isBadVersion(mid) ? (high = mid) : (low = mid+1)
        } while (low < high)
        
        return high
    }
}
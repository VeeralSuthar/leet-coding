/*
 * Title: Search Insert Position
 * 
 * Problem: Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, 
 * return the index where it would be if it were inserted in order.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/13/2022
 * 
 * 
 * Solution: Another variation of a Binary Search. This variation's biggest difference is wants the index of where a value would be even if it
 * doesn't exist in the array. The variation to make to the standard binary search algorithm to fulfill this is to return the low index. I'll show
 * why we use the low index with a test case:
 * 
 * nums = {1,3,5,6}
 * target = 2
 * 
 * First iteration: low = 0, high = 3, mid = 1
 * target (2) < nums[1] (3) so high = mid - 1 = 0
 * Second iteration: low = 0, high = 0, mid = 0
 * target (2) !< nums[0] (1) so low = mid + 1 = 1
 * returns the correct answer. High would return 0, which would make the final order {2,1,3,5,6}.
 * 
 * Time Complexity: O(log(n))
 */


public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (target < nums[mid]) high = mid-1;
            else low = mid+1;
        }
    return low;
    }
}

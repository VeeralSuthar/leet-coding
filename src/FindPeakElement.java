/*
 * Title: Find Peak Element
 * 
 * Problem: A peak element is an element that is strictly greater than its neighbors. Given a 0-indexed integer array nums, find a peak element, 
 * and return its index. If the array contains multiple peaks, return the index to any of the peaks. You may imagine that nums[-1] = nums[n] = -∞. 
 * In other words, an element is always considered to be strictly greater than a neighbor that is outside the array. You must write an algorithm 
 * that runs in O(log n) time.
 * 
 * Author: Veeral Suthar
 *
 * Date: 08/04/2022
 * 
 * 
 * Solution: another little twist on a binary search.
 * Time Complexity: O(log(n))
 */


public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;
        int low = 1;
        int high = nums.length-2;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if (nums[mid] < nums[mid-1]) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}

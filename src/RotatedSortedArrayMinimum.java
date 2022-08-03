/*
 * Title: Find Minimum in Rotated Sorted Array
 * 
 * Problem: Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] 
 * might become:
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times. Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array 
 * [a[n-1], a[0], a[1], a[2], ..., a[n-2]]. Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * You must write an algorithm that runs in O(log n) time.
 * 
 * Author: Veeral Suthar
 *
 * Date: 08/03/22
 * 
 * 
 * Time Complexity: O(log(n)).
 */

public class RotatedSortedArrayMinimum {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        
        while (lo <= hi) {
            int mid = lo+(hi-lo)/2;
            if (mid > 0 && nums[mid] < nums[mid-1]) return nums[mid];  
            if (nums[lo] <= nums[mid] && nums[mid] > nums[hi]) lo = mid+1;
            else hi = mid-1;
        }
        return nums[lo];
    }
}

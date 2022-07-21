/*
 * Title: Binary Search
 * 
 * Problem: Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/13/2022
 * 
 * 
 * Solution: A completely straight forward binary search. The goal is the constantly split the sorted array in half until the middle value is equal
 *           to the target value. Recurision is a logical approach to the binary search method, but
 *           Time Complexity: O(log(n)).
 */


class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = (low+high) / 2;
            if (nums[mid] == target) return mid;
            else if (target < nums[mid]) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}
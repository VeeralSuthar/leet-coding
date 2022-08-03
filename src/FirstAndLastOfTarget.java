/*
 * Title: Find First and Last Position of Element in Sorted Array
 * 
 * Problem: Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. 
 * If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.
 * 
 * Author: Veeral Suthar
 *
 * Date: 08/02/2022
 * 
 * 
 * Solution: quirky binary search
 * * * * 
 * Time Complexity: O(log(n)
*/

public class FirstAndLastOfTarget {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {find(nums,target,true),find(nums,target,false)};
    }
    
    private int find(int[] nums, int target, boolean leftIfTrue) {
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        if (leftIfTrue) {
            while (left <= right) {
                int mid = left+(right-left)/2;
                if (target <= nums[mid]) right = mid-1;
                else left = mid+1;
                if (target == nums[mid]) index = mid;
                }
        } else {
            while (left <= right) {
                int mid = left+(right-left)/2;
                if (target >= nums[mid]) left = mid+1;
                else right = mid-1;
                if (target == nums[mid]) index = mid;
            }
        }
        return index;
    }
}

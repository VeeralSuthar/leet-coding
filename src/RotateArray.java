/*
 * Title: Rotate Array
 * 
 * Problem: Given an array, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/14/2022
 * 
 * Solution: Straight up right array rotate.
 * Time Complexity: O(n*k)
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }   
    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
        }
    }
}

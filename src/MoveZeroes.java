/*
 * Title: Move Zeroes
 * 
 * Problem: Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/15/2022
 * 
 * Solution: My strategy for this problem was to keep a counter of the non-zero values and shifting those values to the front of the array
 * in the process of establishing the count. After that setting the zeros in the end.
 * Time Complexity: O(n)
 */

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        if (nums == null || nums.length == 0) return;
        for (int n : nums) {
            if (n != 0) nums[count++] = n;
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
}

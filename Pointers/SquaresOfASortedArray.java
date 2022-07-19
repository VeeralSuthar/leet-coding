package pointers;
import java.util.Arrays;
/*
 * Title: Squares of a Sorted Array
 * 
 * Problem: Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/14/2022
 * 
 * Solution: My first pass at this problem is shown in the function firstPass(int[] nums). in this sorlution I just squared the array and then used
 * the Arrays.sort function. This method wasn't too satisfying to implement, and the time complexity was O(nlog(n)), since Java's Arrays.sort 
 * utilizes a modification of Quicksort named dual-pivot quicksort, the other an adaptation of MergeSort named Timsort. The next version of the 
 * solution first finds the square of each number and then uses two pointers to sort the array with the index de-incrementing from the end of 
 * the return array since it is to be sorted in acending order.
 * Time Complexity: O(n)
 */

public class SquaresOfASortedArray {

    public int[] firstPass(int[] nums) {
        for (int i = 0; i<nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }


    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int ret[] = new int[nums.length];
        int index = nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        while (left <= right) {
            if (nums[left] > nums[right]) {
                ret[index] = nums[left];
                left++;
                index--;
            } else {
                ret[index] = nums[right];
                right--;
                index--;
            }
        }
        return ret;
    }
}

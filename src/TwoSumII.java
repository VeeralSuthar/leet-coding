/*
 * TITLE: Two Sum II - Input Array is Sorted
 * 
 * PROBLEM: Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that 
 * they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 
 * <= numbers.length. Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of 
 * length 2. The tests are generated such that there is exactly one solution. You may not use the same element twice. Your solution
 * must use only constant extra space.
 * 
 * AUTHOR: Veeral Suthar
 *
 * DATE: 07/20/2022
 * 
 * SOLUTION: Since the array is sorted, the problem is greatly simplified. Two pointers starting from the front and back of the array, 
 * and if the sum of numbers[front index] and numbers[back index] are less than the target, then you want to increase the sum so you 
 * increment the front index, and do the opposite if the sum is greater than. You follow this until sum == target. You'll only need to 
 * iterate through the array once to find this answer.
 * TIME COMPLEXITY: O(n).
 */


public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] ret = new int[2];
        int sum = 0;
        int left = 0;
        int right = numbers.length-1;
        while (left != right) {
            sum = numbers[left] + numbers[right];
            if (sum == target) {
                ret[0] = left+1;
                ret[1] = right+1;
                return ret;
            }
            else if (sum < target) left++;
            else right--;
        }
        return ret;
    }
}

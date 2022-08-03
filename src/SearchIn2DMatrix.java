/*
 * Title: Search in a 2D Matrix
 * 
 * Problem: Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the 
 * following properties:
 *     - Integers in each row are sorted from left to right.
 *     - The first integer of each row is greater than the last integer of the previous row.
 * 
 * Author: Veeral Suthar
 *
 * Date: 08/13/2022
 * 
 * 
 * Solution: using index/column_length to get the row value and index%column_length to get the column value you can somewhat treat the matrix as
 * an array. midIndex represents the middle value of the m x n matrix treated as a 1 x (m*n) matrix.
 *           Time Complexity: O(log(n)).
 */

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high = row*col-1;
        
        while (low <= high) {
            int midIndex = low+(high-low)/2;
            int midValue = matrix[midIndex/col][midIndex%col];
            if (midValue == target) return true;
            else if (target < midValue) high = midIndex-1;
            else low = midIndex+1;
        }
        return false;
    }
}

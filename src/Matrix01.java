/* 
 *
 * Title: 01 Matrix
 * 
 * Problem: Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell. The distance between two adjacent cells is 1.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/24/2022
 * 
 * Solution: Memoized dynamic programming approach. Stored the distance from a 0-cell in the cell, so when the iteration got to an adjacent cell
 * and checked surrond cells, it would already have the distance to the closest 0-cell from its adjacent cell.
 * Time Complexity: O(2 * n * m)
 */

public class Matrix01 {
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        // Largest number of possible steps in the grid
        int max = m+n;
        // Left and Top iteration
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell value is 0, skip it.
                if (mat[i][j] == 0) continue;
                int left = max;
                int top = max;
                if (i-1 >= 0) top = mat[i-1][j];
                if (j-1 >= 0) left = mat[i][j-1];
                mat[i][j] = Math.min(top,left)+1;  
            }
        }
        // Right Bottom iteration
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (mat[i][j] == 0) continue;
                int right = max;
                int bottom = max;
                if (i+1 < m) bottom = mat[i+1][j];
                if (j+1 < n) right = mat[i][j+1];
                mat[i][j] = Math.min(mat[i][j], Math.min(bottom,right)+1);
            }
        }
        return mat;
    }
}
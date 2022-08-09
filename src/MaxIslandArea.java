/* Title: Max Area of Island
 * 
 * Problem: You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.The area 
 * of an island is the number of cells with a value 1 in the island.Return the maximum area of an island in grid. If there is no island, return 0.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/21/2022
 * 
 * Solution: A DFS problem. I used a recursive approach to this problem.
 * Time Complexity: O(n*m)
 */
public class MaxIslandArea {
    
    int m;
    int n;
    public int maxAreaOfIsland(int[][] grid) {
        
        int largestIsland = 0;
        m = grid.length;
        n = grid[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) largestIsland = Math.max(largestIsland,getIslandSize(i,j,grid));
            }
        }
        return largestIsland;
    }
    public int getIslandSize(int sr, int sc, int[][] grid) {
        int island = 0;
        if (sr < 0 || sc < 0 || sr >= m || sc >= n || grid[sr][sc] == 0) return 0;
        grid[sr][sc] = 0;
        island++;
        island += getIslandSize(sr-1,sc,grid);
        island += getIslandSize(sr+1,sc,grid);
        island += getIslandSize(sr,sc-1,grid);
        island += getIslandSize(sr,sc+1,grid);
        return island;
    }  
} 
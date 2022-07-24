import java.util.Queue;
import java.util.LinkedList;
/* 
 * Title: Rotting Oranges
 * 
 * Problem: You are given an m x n grid where each cell can have one of three values:
 * * 0 representing an empty cell,
 * * 1 representing a fresh orange, or
 * * 2 representing a rotten orange.
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten. Return the minimum number of minutes 
 * that must elapse until no cell has a fresh orange. If this is impossible, return -1.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/24/2022
 * 
 * Solution: BFS. 
 * Time Complexity: O(n * m)
 */

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        
        if (grid.length == 0 || grid[0].length == 0 || grid == null) return 0;
        
        // grid row and col length
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> rotten = new LinkedList<>(); // Queue to store the rotten oranges indexes
        int freshCount = 0; // counter for fresh oranges
        int minutes = 0; // counter of how many minutes pass each minute represents a level of the BFS
        int[][] directions = new int[][] {{1,0},{0,1},{-1,0},{0,-1}}; // adjacent directions
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) rotten.offer(new int[] {i,j}); //if orange is rotten, add the index to the queue
                if (grid[i][j] == 1) freshCount++; //Incremement the number of fresh oranges
            }
        }
        while (!rotten.isEmpty() && freshCount > 0) {  
            minutes++;
            int size = rotten.size(); // specify here to reset the size of rotten in the loop
            for (int i = 0; i < size; i++) {
                int[] poll = rotten.poll(); // retrieve and remove the first node of rotten
                for (int[] d : directions) {
                    int x = poll[0] + d[0];
                    int y = poll[1] + d[1];
                    // If out of bounds or not rotten skip the iteration
                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0 || grid[x][y] == 2) continue;
                    grid[x][y] = 2; //mark the fresh orange rotten
                    rotten.offer(new int[] {x,y}); // add the newly rotten orange to the queue
                    freshCount--; //deincrement the number of fresh oranges
                }
            }
        }
        // if there are still fresh oranges left after the full traversal then return -1, else return the minute count
        return freshCount == 0 ? minutes : -1;
    }
}

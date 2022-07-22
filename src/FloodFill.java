/* Title: Middle of the Linked List
 * 
 * Problem: An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image. You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the 
 * pixel image[sr][sc]. To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels 
 * (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color. Return the modified image after performing the flood fill.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/21/2022
 * 
 * Solution: For this solution I used a recursive DFS. 
 *
 * Time Complexity: O(n*m) where n = # of rows and m = # of columns.
 */
 
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Image is already as expected
        if (image[sr][sc] == color) return image;
        fill(image,sr,sc,image[sr][sc],color);
        return image;
    }
    
    private void fill(int[][] image, int sr, int sc, int oldColor, int newColor) {
        
        // Verify if the pixel exists and matches the color (the current pixel color = oldColor has to be the last                  statement)
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor ) return;
           
        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, oldColor, newColor);
        fill(image, sr - 1, sc, oldColor, newColor);
        fill(image, sr, sc + 1, oldColor, newColor);
        fill(image, sr, sc - 1, oldColor, newColor);
    }
}
public class PathWithMaximumGold {
    int max = 0;
    public int getMaximumGold(int[][] grid) {   
        if(grid == null || grid.length == 0) return 0; // edge cases
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j<grid[0].length; j++) {
                if (grid[i][j] != 0) search(grid,i,j,0);
            }
        }
        return max;
    }
    public void search(int[][] grid, int i, int j, int cur) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            max = Math.max(cur,max);
            return;
        }
        int temp = grid[i][j]; //store the gold value temporarily
        grid[i][j] = 0; // set to 0 so we wont visit the cell again
         search(grid,i+1,j,cur+temp);
        search(grid,i-1,j,cur+temp);
        search(grid,i,j+1,cur+temp);
        search(grid,i,j-1,cur+temp);
        grid[i][j] = temp; //reset the gold value of the cell for the next path run
    }
}

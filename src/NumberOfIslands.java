public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i<grid.length;i++) {
            for (int j = 0; j <grid[0].length;j++){
                if (grid[i][j] == '1') {
                    count += 1;
                    island(grid,i,j);
                }
            }
        }
        return count;
    }
    public void island(char[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] == '0') return;
        grid[x][y] = '0';
        island(grid,x+1,y);
        island(grid,x-1,y);
        island(grid,x,y+1);
        island(grid,x,y-1);
    }
}

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] visited = new boolean[isConnected.length]; //Tracks if a city is visited or not.
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                province(isConnected,visited,i);
                count++;
            }
        }
        return count;
    }
    public void province(int[][] grid, boolean[] visited, int i) {
        for (int j = 0; j < grid.length; j++) {
            if (grid[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                province(grid,visited,j);
            }
        }
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    setIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void setIsland(char[][] grid, int row, int column) {
        grid[row][column] = '0';
        if (row-1 >=0 && grid[row-1][column] == '1') {
            setIsland(grid, row-1, column);
        }
        if (row+1 < grid.length && grid[row+1][column] == '1') {
            setIsland(grid, row+1, column);
        }
        if (column-1 >=0 && grid[row][column-1] == '1') {
            setIsland(grid, row, column-1);
        }
        if (column+1 < grid[0].length && grid[row][column+1] == '1') {
            setIsland(grid, row, column+1);
        }
    }
}
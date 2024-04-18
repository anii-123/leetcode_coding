class Solution {
    public int islandPerimeter(int[][] grid) {
    int n = 0;
    int is= 0;

    for (int i = 0; i < grid.length; ++i)
      for (int j = 0; j < grid[0].length; ++j)
        if (grid[i][j] == 1) {
          ++is;
          if (i - 1 >= 0 && grid[i - 1][j] == 1)
            ++n;
          if (j - 1 >= 0 && grid[i][j - 1] == 1)
            ++n;
        }

    return is*  4 - n* 2;
    
    }
}
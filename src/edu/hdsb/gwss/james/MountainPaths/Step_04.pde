/**
 * Search a single column of a 2D array and return the index of the row that
 * contains the smallest value
 *
 * @param grid a 2D array
 * @col the column in the 2D array to process
 * @return the index of smallest value from grid at the given col
 */
public static int indexOfMinInCol(int[][] grid, int col) {
  
  //finds the thing
   int minValue = grid[0][col]; 
   int minIndex = 0;
     for ( int row = 0; row < grid.length; row++ ) {
         if ( grid[row][col] < minValue ) {
               minValue = grid[row][col];
               minIndex = row;
           }
      }
    return minIndex;
}

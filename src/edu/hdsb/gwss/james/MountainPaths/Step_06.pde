/**3
 * Generate all west-to-east paths, find the one with the lowest total
 * elevation change, and return the index of the row that path starts on.
 *
 * @param grid - the 2D array of elevation values
 * @return the index of the row where the lowest elevation-change path
 * starts.
 */
public int indexOfLowestElevPath( int[][] data ) {
int lowest = Integer.MAX_VALUE;
int lowestIndex = 0;
//loops for all, finds lowest
      for(int i = 0; i < height; i++){
            int change = drawLowestElevPath(data,i);
            if(change < lowest){
                lowest = change;
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

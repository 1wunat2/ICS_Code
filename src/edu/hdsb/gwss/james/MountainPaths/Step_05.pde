/**
 * Find the minimum elevation-change route from West-to-East in the given
 * grid, from the given starting row, and draw it using the given graphics
 * context
 *
 * @param data - the 2D array of elevation values
 * @param row - the starting row for traversing to find the min path
 * @return total elevation of the route
 */

public int drawLowestElevPath( int[][] data, int row ) {
  int change = 0;
  int up, fwd, dwn;
  
  for(int col = 0; col < data[0].length - 1; col++){
    //draw rectangle
    noStroke();
    rect(col, row, 1, 1);
    
    //finds the differences of the fwd, row, and dwn, set to max so nothing is larger then it
    fwd = Math.abs(data[row][col + 1] - data[row][col]);
    
    if(row == 0)
      up = Integer.MAX_VALUE;
    else
      up = Math.abs(data[row - 1][col + 1] - data[row][col]);
    
    if (row == data.length - 1)
      dwn = Integer.MAX_VALUE;
    else
      dwn = Math.abs(data[row + 1][col +1] - data[row][col]);
     
     int next = nextStep(up, fwd, dwn);
     
     //changes
     row += next;
     if(next == -1){
       change +=up;
       continue;
    }
    if(next == 0){
      change += fwd;
      continue;
    }
    change += dwn;
  }
  return change;
}

private int nextStep(int up, int fwd, int dwn){
  //cases
  int min = up;
  if (fwd < min)
    min = fwd;
  if (dwn < min)
    min = dwn;
  if (min == fwd)
    return 0;
  if (up == dwn)
    return flip();
  if (min == up)
    return -1;
  return 1;
}

private int flip(){
  //random number generatiors
  int result = (int)(Math.random()*((1-0)+1))+0;
  if (result == 0){
    return 1;
  }else{
    return -1;
  }
}

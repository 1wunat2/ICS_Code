/**
 * Given a 2D array of elevation data create a image of size rows x cols,
 * drawing a 1x1 rectangle (or point) for each value in the array whose color is set to
 * a scaled gray value (0-255). Note: to scale the values in the array to
 * 0-255 you must find the min and max values in the original data first.
 *
 * @param g a Graphics context to use
 * @param grid a 2D array of the data
 */
 public void drawMap(int[][] data) {
    int min=findMin(data);
    int max=findMax(data);
    //draws maps baby
      for(int row = 0; row < height; row++){
        for(int col = 0; col < width; col++){
           int c = (int)(255 * ((float)(data[row][col] - min) /(float) (max - min)));
                rect(col,row,1,1);
                noStroke();
                fill((float)(c),(float)(c),(float)(c));
            }
        }
   
 }

/**
 * MINIMUM VALUE
 *
 * @param data a 2D array from which you want to find the minimum value
 * @return the minimum value in the given 2D Array
 */
public static int findMin( int[][] data ) {
int min = data[0][0];

//Loops to find min
    for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data[row].length; col++) {
        if (data[row][col] < min) {
          min = data[row][col];
        }
      }
    }
    return min;
}

/**
 * MAXIMUM VALUE
 *
 * @param data a 2D array from which you want to find the minimum value
 * @return the minimum value in the given 2D Array
 */
public static int findMax( int[][] data ) {
int max = data[0][0];
//Loops to find max
    for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data[row].length; col++) {
        if (data[row][col] > max) {
          max = data[row][col];
        }
      }
    }
    return max;
}

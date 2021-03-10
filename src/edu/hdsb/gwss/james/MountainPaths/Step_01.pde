/**
 * This method reads a 2D data set from the specified file. The Graphics'
 * industry standard is width by height (width x height), while programmers
 * use rows x cols / (height x width).
 *
 * @param fileName the name of the file
 * @return a 2D array (rows x cols) of the data from the file read
 */
 
import java.util.*;

public static int[][] readData( String fileName ) {
  //objects and variables
Scanner s;
    int[][] data;
    int colCount, rowCount = 1;
    int row = 0, col = 0;

    
    File file = new File(fileName);

    try {
      s = new Scanner(file);
      StringTokenizer st = new StringTokenizer(s.nextLine());

      //Count Column
      colCount = st.countTokens();

      //Goes Through The Lines, Columns - Top to Bottom
      while (s.hasNextLine()) {
        rowCount++;
        s.nextLine();
      }

      //Creates Array With Counted Row and Coloum Values
      data = new int[rowCount][colCount];

      //Resets Scanner, nextLine() removes the line from buffer????
      s.close();
      s = new Scanner(file);
      //Saves data in array
      while (s.hasNextLine()) {
        StringTokenizer line = new StringTokenizer(s.nextLine());
        while (line.hasMoreTokens()) {
          data[row][col] = Integer.parseInt(line.nextToken());
          col++;
        }
        col = 0;
        row++;
      }
      s.close();
    } catch (Exception e) {
      //Exception Stuff
      System.out.println("STEP 01 - Exception");
      e.printStackTrace();
      data = null;
    }

    //Returns the 2D array of data
    return data;
  }

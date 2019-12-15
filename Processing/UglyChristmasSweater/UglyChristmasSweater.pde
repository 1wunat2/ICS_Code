//<>// //<>// //<>// //<>// //<>//
import java.util.*;

//variables
int maxLength = 0, r, counter;


void setup() {

  // WINDOW
  size( 600, 600 );

  // BACKGROUND
  background( 255 );

  // READ FILE
  String[] lines = loadStrings( "\\data\\sweater01.txt" );

  // STEP 1: PARSE FILE
  parseFile( lines );

  //STEP 2: STORE DATA IN 3D ARRAY
  //finding max amount of collumns
  maxLength = dataLength(maxLength, lines);
  int[][][] data = new int[lines.length][maxLength][2];
  coordinate(data, lines);

  //STEP 3: FIND MAX AND MIN VALUE
}

void parseFile( String[] lines ) {

  for (int i = 0; i < lines.length; i++ ) {

    // LINE
    println( lines[i] );
  }
}

int dataLength(int maxLength, String lines[]) {
  //variables
  String[] tempStorage = new String[lines.length];

  for (r = 0; r < lines.length; r++) {
    tempStorage[r] = lines[r];

    for (counter = 0; lines[r].length() > 1; counter++) {
      tempStorage[r] = tempStorage[r].trim();
      tempStorage[r] += " ";
      int index = tempStorage[r].indexOf(" ");
      tempStorage[r] = tempStorage[r].substring(index);
    }
    if (counter > maxLength) {
      maxLength = counter - 1;
    }
  }

  return maxLength;
}

void coordinate(int data[][][], String line[]) {
  for (int r = 0; r < line.length; r++) {
    line[r] = line[r].replaceAll("[(),]", " ");

    for (int c = 0; line[r].length() > 1; c++) {

      for (int i = 0; i < 2; i++) {

        line[r] = line[r].trim();
        line[r] += " ";
        int index = line[r].indexOf(" ");
        String coord = line[r].substring(0, index);
        line[r] = line[r].substring(index);
        int crdnt = Integer.parseInt(coord);
        data[r][c][i] =  crdnt;
      }
    }
  }
}

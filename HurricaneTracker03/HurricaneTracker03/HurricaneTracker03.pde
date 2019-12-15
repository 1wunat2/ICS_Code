/**
 * DAY 03 - Translate & Draw Points
 */

import java.util.*;

// CLASS CONSTANTS
static final int DATA_COLUMNS = 6;
static final int COL_DATE = 0;
static final int COL_TIME = 1;
static final int COL_LAT = 2;
static final int COL_LONG = 3;
static final int COL_WIND = 4;
static final int COL_PRESSURE = 5;

// LATITUDE:  North to South / Up to Down
static final float LAT_MIN = -17.66;
static final float LAT_MAX = 45.00; 
// LONGITUDE: East to West / Left to Right
static final float LONG_MIN = -90.0;
static final float LONG_MAX = 0.0;

// OBJECT VARIABLES
PImage imgBackground;
String[][] data;
double[][] latAndLong;

/**
 * Part C:  Translate Points (Latitude, Longitude) in the 2D String Array --> into new 2D Double Array ( x, y ).
 *
 * HINTS:   1.  Double.parseDouble( .. ) to convert a STRING to DOUBLE
 */
void translatePoints() {

  // PUT TRANSLATED DATA INTO LAT/LONG Array (latAndLong)
  // You must declare the array first

  latAndLong = new double[data.length][2];
  int i = 0;

  for (int r = 0; r < data.length; r++) { //<>//
    i = 0;
    for (int c = COL_LONG; c > COL_TIME; c--) {
      //storing it into the 2d array
      latAndLong[r][i] = Double.parseDouble(data[r][c]);
      
      //translating the point
      if (c == 1) {
        latAndLong[r][i] = latAndLong[r][i] + (-1 * LAT_MIN);
      } else {
        latAndLong[r][i] = latAndLong[r][i] + (-1 * LONG_MIN);
      }
      i++;
    }
  }
}


/**
 * Part D:  Draw Translated Points (or Circles)
 */
void plotPoints() {

  // DRAW ALL TRANSLATED POINTS
  rectMode(CENTER);
  fill(#F70505);
  for (int r = 0; r < latAndLong.length; r++) {
    float x = Float.parseFloat(latAndLong[r][0] + "");
    float y = Float.parseFloat(latAndLong[r][1] + "");
    //displaying point
    rect(x, y, 5, 5);
  }
}





// ************************************************
// *********** DO NOT CHANGE CODE BELOW ***********
// ************************************************

/**
 * SETUP
 */
void setup() {

  // WINDOW SIZE; window size can only be set with values, not variables
  size( 965, 600 );

  // DEFAULT IMAGES
  imgBackground = loadImage("atlantic-basin.png");

  // BACKGROUND
  image(imgBackground, 0, 0, imgBackground.width, imgBackground.height);

  clear();

  // BACKGROUND
  imageMode(CORNERS);
  image(imgBackground, 0, 0, imgBackground.width, imgBackground.height);

  // DAY 02: Parse CSV File
  parseFile( "irma.csv" );

  // DAY 03: Translate Points (Part C)
  translatePoints();

  // DAY 03: Plot Points (Part D)
  plotPoints( );
}

/**
 * Day 02:  Parse CSV file, and store data in to a 2D String Array
 *
 *   - Line 1:    Header:    Date,Time,Lat,Lon,Wind (mph),Pressure
 *   - Line 2-N:  Data:      Aug 30,15:00 GMT,16.4,-30.3,50,1004
 */
void parseFile( String fileName ) {

  // OPEN FILE
  String[] lines = loadStrings( fileName );

  // CREATE ARRAY
  data = new String[ lines.length - 1 ][DATA_COLUMNS];

  // PARSE &  SKIP FIRST LINE
  StringTokenizer st;

  for (int line = 1; line < lines.length; line++) {
    st = new StringTokenizer( lines[line], "," );
    for ( int col = 0; col < DATA_COLUMNS; col++ ) {     
      data[line-1][col] = st.nextToken();
    }
  }
}

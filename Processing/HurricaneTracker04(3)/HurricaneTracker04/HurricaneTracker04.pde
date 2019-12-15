import java.util.*;

// CLASS CONSTANTS
static final int DATA_COLUMNS = 6;
static final int COL_DATE = 0;
static final int COL_TIME = 1;
static final int COL_LAT = 2;
static final int COL_LONG = 3;
static final int COL_WIND = 4;
static final int COL_PRESSURE = 5;

static final float LONG_MIN = -90.0;
static final float LONG_MAX = 0.0;
static final float LAT_MIN = -17.66;
static final float LAT_MAX = 45.00;

// OBJECT VARIABLES
PImage imgHurricane;
PImage imgBackground;
String[][] data;
float[][] translatedLatLongToXY;
float[] windSpeed;
int datum = 0;
float latDifference;
float longDifference;
float xLoc;
float yLoc;

/**
 * PART E & F
 */
void draw() {

  clear();

  // BACKGROUND
  imageMode(CORNERS);
  image(imgBackground, 0, 0, imgBackground.width, imgBackground.height);

  // VARIABLES YOU MIGHT WANT
  int cat, radius, i = 0;
  color colour = 255;

  float xLoc = 0, yLoc = 0;
  float previousXLoc = 0, previousYLoc = 0;

  for ( int row = 0; row < frameCount; row++ ) {

    // HURRICAN CATEGORY & COLOUR
    int speed = (int)windSpeed[i];
    cat = hurricaneCategory( speed );
    colour = hurricaneColour( cat );

    // HURRICANE LOCATION
    stroke( colour );
    strokeWeight( 5 );
    point( translatedLatLongToXY[row][0], translatedLatLongToXY[row][1] );
    xLoc = translatedLatLongToXY[row][0];
    yLoc = translatedLatLongToXY[row][1];

    //WRITING THE CATEGORY AND DETERMINING STROKE WEIGHT
    textSize(10);
    fill(colour);
    if ( speed >= 157 ) {
      text("5", translatedLatLongToXY[row][0] + 5, translatedLatLongToXY[row][1] - 5);
      strokeWeight(6);
    } else if ( speed >= 130 ) {
      text("4", translatedLatLongToXY[row][0] + 5, translatedLatLongToXY[row][1] - 5);
      strokeWeight(5);
    } else if ( speed >= 111 ) {
      text("3", translatedLatLongToXY[row][0] + 5, translatedLatLongToXY[row][1] - 5);
      strokeWeight(4);
    } else if ( speed >= 96 ) {
      text("2", translatedLatLongToXY[row][0] + 5, translatedLatLongToXY[row][1] - 5);
      strokeWeight(3);
    } else if ( speed >= 74 ) {
      text("1", translatedLatLongToXY[row][0] + 5, translatedLatLongToXY[row][1] - 5);
      strokeWeight(2);
    } else {
      text("0", translatedLatLongToXY[row][0] + 5, translatedLatLongToXY[row][1] - 5);
      strokeWeight(1);
    }

    //DRAWING THE LINE
    if (row != 0) {
      previousXLoc = translatedLatLongToXY[row - 1][0];
      previousYLoc = translatedLatLongToXY[row - 1][1];
      line(previousXLoc, previousYLoc, xLoc, yLoc);
    }

    i++;
  }

  //CURRENT HURRICAN LOCATION
  imageMode(CENTER);
  image(imgHurricane, xLoc, yLoc );


  if ( frameCount >= translatedLatLongToXY.length ) {
    exit();
  }
}

int hurricaneCategory( int windSpeed ) {
  int cat = 0;
  if ( windSpeed >= 157 ) {
    cat = 5;
  } else if ( windSpeed >= 130 ) {
    cat = 4;
  } else if ( windSpeed >= 111 ) {
    cat = 3;
  } else if ( windSpeed >= 96 ) {
    cat = 2;
  } else if ( windSpeed >= 74 ) {
    cat = 1;
  }
  return cat;
}

color hurricaneColour( int category ) {
  switch( category ) {
  case 5: 
    return color( #ff0000 ); // RED
  case 4:
    return color( #ffa500 ); // ORANGE
  case 3: 
    return color( #ffff00 ); // YELLOW
  case 2: 
    return color( #00ff00 ); // GREEN
  case 1: 
    return color( #0000ff ); // BLUE
  }
  return color( #ffffff );
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

  // REFRESH RATE
  frameRate( 10 );

  // DEFAULT IMAGES
  imgHurricane = loadImage("hurricane.gif");
  imgBackground = loadImage("atlantic-basin.png");

  // BACKGROUND
  image(imgBackground, 0, 0, imgBackground.width, imgBackground.height);

  // TRANSLATIONS
  latDifference = ( LAT_MAX - LAT_MIN );
  longDifference = ( LONG_MAX - LONG_MIN );

  // PART 1: Parse CSV File
  parseFile( "irma.csv" );
}

/**
 * PART 1:  Parse CSV file, and store data in to a 2D String Array
 * PART 2:  Move Lat & Long into 2D Float Array, move Wind Speed into 1D Array.
 */
void parseFile( String fileName ) {

  // OPEN FILE
  String[] lines = loadStrings( fileName );

  // CREATE ARRAY
  data = new String[ lines.length - 1 ][DATA_COLUMNS];
  translatedLatLongToXY = new float[lines.length - 1][2];
  windSpeed = new float[lines.length - 1];
  println( data.length );

  // PARSE &  SKIP FIRST LINE
  StringTokenizer st;

  for (int line = 1; line < lines.length; line++) {
    st = new StringTokenizer( lines[line], "," );
    for ( int col = 0; col < DATA_COLUMNS; col++ ) {     
      data[line-1][col] = st.nextToken();
    }

    translatedLatLongToXY[line-1][1] = toCartesianY( Float.parseFloat( data[line-1][COL_LAT] ) );
    translatedLatLongToXY[line-1][0] = toCartesianX( Float.parseFloat( data[line-1][COL_LONG] ) );
    windSpeed[line-1] = Float.parseFloat( data[line-1][COL_WIND] );
  }
}

float toCartesianX( float longitude ) {
  // TRANSLATE RIGHT;   -90 --> 0
  return ( ( longitude + Math.abs( LONG_MIN ) ) / longDifference ) * width + 25;
}

float toCartesianY( float latitude ) {
  // TRANSLATE UP;      -17.6 --> 0
  // VERTICAL REFLECTION;
  // 75 px offset
  return height - ( ( latitude + Math.abs( LAT_MIN  ) ) / latDifference ) * height + 75;
}

/*
 * Game Of Life
 * ICS4U.2020.Q1
 */

// CONSTANTS
static final int DIMENSIONS = 40;
static final boolean CELL_DEAD = false;
static final boolean CELL_ALIVE = true;
static final double POPULATION_DENSITY = 0.4;  // 40%

// GLOBAL VARIABLES
int cellWidth;
int offset;
boolean[][] data;
boolean[][] nextGen;

/* SETUP */
void setup() {

  // WINDOWS SIZE
  size( 610, 610 );

  // GAME OF LIFE GRID SIZE
  println( "Grid Size: " + DIMENSIONS + "x" + DIMENSIONS );

  // BACKGROUND
  background( #B2CBFF );

  // FRAME RATE
  frameRate( 2 );

  // RECT MODE; Top Left Corner
  rectMode(CORNER);

  // STORKE COLOR
  stroke( 255 );

  // CELL DIMENSIONS
  cellWidth = (int) ( (width-2*offset) / DIMENSIONS );
  println( "Grid Size: " + DIMENSIONS + "x" + DIMENSIONS );

  offset = ( width - ( cellWidth * DIMENSIONS) ) / 2 ;

  // CELL DATA
  data = new boolean[DIMENSIONS][DIMENSIONS];

  // PLACE RANDOM CELLS
  placeRandomCells( (int) ( POPULATION_DENSITY * DIMENSIONS * DIMENSIONS ) );

  // DRAW CELLS
  drawCells();
}


/* DRAW */
void draw() {

  // NEXT GENERATION
  nextGeneration();

  // DRAW CELLS
  drawCells();
}

/*
 * TODO:  GAME OF LIFE LOGIC; Next Generation
 */
void nextGeneration() {

  // TODO

  data[0][0] = CELL_ALIVE;
  
  
} // END nextGeneration()

/*
 * TODO:  COUNT NEIGHBOURS
 */
public static int countNeigh( int[][] data, int r, int c ) {
  int n = 0;

  // TODO

  return n;
} // END countNeigh()

/*
 * TODO:  PLACE RANDOM CELLS @ START OF GAME
 */
void placeRandomCells( int num ) {

  // TODO
} 


/* 
 * DRAW CELLS based on their state; ALIVE - Green, DEAD/EMPTY - White
 */
void drawCells( ) {
  for ( int row = 0; row < data.length; row++ ) {
    for ( int col = 0; col < data[row].length; col++ ) {
      if ( data[row][col] == CELL_ALIVE ) {
        fill( #37FC1F );
      } else {
        fill( 255 );
      }
      rect( offset + col*cellWidth, offset + row*cellWidth, cellWidth, cellWidth );
    }
  }
} // END drawCells()

/* 
 * FILL ALL CELLS with ONE state; ALIVE & DEAD
 */
void fillCells( boolean state ) {
  for ( int row = 0; row < data.length; row++ ) {
    for ( int col = 0; col < data[row].length; col++ ) {
      data[row][col] = state;
    }
  }
} // END fillCells()

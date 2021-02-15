/*
 * Game Of Life
 * ICS4U.2020.Q1
 */

//IMPORTS
import java.util.Arrays;

// CONSTANTS
static final int DIMENSIONS = 20;
static final boolean CELL_DEAD = false;
static final boolean CELL_ALIVE = true;
static final double POPULATION_DENSITY = 0.6;  // 40%

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
  nextGen = new boolean[DIMENSIONS][DIMENSIONS];

  // PLACE RANDOM CELLS
  //placeRandomCells( (int) ( POPULATION_DENSITY * DIMENSIONS * DIMENSIONS ) );
  placeBeacon();

  // DRAW CELLS
  drawCells();
}


/* DRAW */
void draw() {

  // NEXT GENERATION
  nextGeneration();
  data = nextGen;

  // DRAW CELLS
  drawCells();
}

void placeBeacon() {
  data[6][6] = true;
  data[7][6] = true;
  data[6][7] = true;
  data[8][9] = true;
  data[9][9] = true;
  data[9][8] = true;
}

/*
 * TODO:  GAME OF LIFE LOGIC; Next Generation
 */
void nextGeneration() {
  int n;

  for (int i = 0; i < data.length; i++) {
    for (int j = 0; j < data[i].length; j++) {
      n = countNeigh(i, j);

      if (data[i][j] == false && n == 3) {
        nextGen[i][j] = true;
      } else if (data[i][j] == true) {
        switch (n) {
        case 2:
        case 3:
          nextGen[i][j] = true;
          break;
        default:
          nextGen[i][j] = false;
          break;
        }
      }
    }
  }
  //data[0][0] = CELL_ALIVE;
} // END nextGeneration()

/*
 * TODO:  COUNT NEIGHBOURS
 */
int countNeigh( int r, int c ) {
  int n = 0;
  for (int i = r - 1; i <= r + 1; i++) {
    for (int j = c - 1; j <= c + 1; j++) {
      if (validIndex(i, j) && data[i][j] && !(r == i && c == j)) {
        n++;
      }
    }
  }

  return n;
} // END countNeigh()

/*
 * CHECK IF VALID INDEX
 */
boolean validIndex(int r, int c) {
  if (r < 0 || r >= data.length) {
    return false;
  }
  if (c < 0 || c >= data[0].length) {
    return false;
  }
  return true;
} // END validIndex()

/*
 * TODO:  PLACE RANDOM CELLS @ START OF GAME
 */
void placeRandomCells( int num ) {
  int col, row;
  boolean placed, value = true;

  if (num > Math.ceil(DIMENSIONS * DIMENSIONS / 2)) {
    fillCells(value);
    num = DIMENSIONS * DIMENSIONS - num;
    value = false;
  }

  for (int i = 0; i < num; i++) {
    placed = false;

    while (!placed) {
      col = (int) (Math.random() * ((data.length - 1) + 1));
      row = (int) (Math.random() * ((data.length - 1) + 1));

      if (data[col][row] != value) {
        data[col][row] = value;
        placed = true;
      }
    }
  }
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

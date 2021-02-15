/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u2;

import java.util.Scanner;

/**
 * Game Of Life
 *
 *
 * @author Wm.Muir
 * @version ICS4U.2020.Q1
 */
public class D2_GameOfLife {

    static final boolean DEAD = false;
    static final boolean ALIVE = true;

    public static void main( String[] args ) {

        int cellsToPlace = 100;
        boolean[][] data = new boolean[20][20];
        String again;

        Scanner input = new Scanner( System.in );

        placeRandomCells( data, cellsToPlace );

        do {

            display( data );

            data = nextGen( data );

            System.out.println( "Press ENTER to Continue, E to Exit" );
            again = input.nextLine();

        } while( !"E".equals( again ) );

    }

    public static boolean[][] nextGen( boolean[][] data ) {

        // GAME PLAY!
        // NEXT GENERATION; START DEAD
        boolean[][] nextGeneration = new boolean[20][20];

        int n;
        for( int row = 0; row < data.length; row++ ) {
            for( int col = 0; col < data[row].length; col++ ) {
                // HOW MANY LIVE NEIGH?
                n = liveNeigh( data, row, col );

                // GAME LOGIC!
                // DEAD
                if( data[row][col] == DEAD && n == 3 ) {
                    nextGeneration[row][col] = ALIVE;
                } // ALIVE!
                else if( data[row][col] == ALIVE ) {
                    switch ( n ) {
                        case 2:
                        case 3:
                            nextGeneration[row][col] = true;
                    }
                }
            }
        }

        return nextGeneration;

    }

    public static boolean validIndex( boolean[][] data, int r, int c ) {

        if( r < 0 || r >= data.length ) {
            return false;
        }
        if( c < 0 || c >= data[0].length ) {
            return false;
        }
        return true;

    }

    public static int liveNeigh( boolean[][] data, int i, int j ) {
        int n = 0;

        // LOOP ROWS: ABOVE == i-1, SAME ROW == i, BELOW == i+1
        for( int r = i - 1; r <= i + 1; r++ ) {
            // LOOP COL: LEFT == j-1, SAME COL == j, RIGHT == j+1
            for( int c = j - 1; c <= j + 1; c++ ) {
                // VALID INDEX and NOT ITSELF
                if( validIndex( data, r, c )
                        && data[r][c] == ALIVE && !( i == r && j == c ) ) {
                    n++;

                }
            }
        }
        return n;
    }

    public static void placeRandomCells( boolean[][] data, int cellsToPlace ) {

        int r, c;
        int numPlaced = 0;

        boolean stateToPlace;

        if( (double) cellsToPlace / ( data.length * data[0].length ) > 0.5 ) {
            stateToPlace = DEAD;
            fillData( data, ALIVE );
            cellsToPlace = data.length * data[0].length - cellsToPlace;
        } else {
            stateToPlace = ALIVE;
            fillData( data, DEAD );
        }

        while( numPlaced < cellsToPlace ) {

            r = (int) ( Math.random() * data.length );
            c = (int) ( Math.random() * data[r].length );

            // ONLY PLACE IF, CELL IS DEAD, CELLS PLACED++
            if( data[r][c] == !stateToPlace ) {
                numPlaced++;
                data[r][c] = stateToPlace;
            }
        }

    }

    public static void fillData( boolean[][] data, boolean state ) {
        for( int r = 0; r < data.length; r++ ) {
            for( int c = 0; c < data[r].length; c++ ) {
                data[r][c] = state;
            }
        }
    }

    public static void display( boolean[][] data ) {
        for( int r = 0; r < data.length; r++ ) {
            for( int c = 0; c < data[r].length; c++ ) {
                if( data[r][c] ) {
                    System.out.print( "O" );
                } else {
                    System.out.print( "." );
                }
            }
            System.out.println( "" ); // NEW LINE AFTER EACH ROW
        }
    }

}

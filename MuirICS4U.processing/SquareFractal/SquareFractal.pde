// Fractal - In Class Notes
//
// ICS4U.2020.Q1

int c = 0;
color[] colors = {
  color( 155, 233, 55 ), 
  color( 255, 23, 123 ), 
  color( 44, 255, 12 )
};

void setup() {

  // WHITE CANVAS
  size( 800, 600 );
  background( 255 );

  // CENTER MODE
  rectMode( CENTER );

  // START FRACTAL in the MIDDLE
  squares( width/2, height/2, 300 );
}

void squares( int x, int y, int len ) {

  // BASE CASE;
  if ( len > 20 ) {
    squares( x + len/2, y + len/2, len/2 );
    squares( x + len/2, y - len/2, len/2 );
    squares( x - len/2, y + len/2, len/2 );
    squares( x - len/2, y - len/2, len/2 );
  }

  fill( colors[ (++c) % colors.length ] );
  rect( x, y, len, len );
  
}

Snowman olaf, frosty, dirty;
Reindeer rudolph, sven;
Pacman pacman;


void setup() {

  size( 600, 400 );
  background( 0 );
  noStroke();

  // THREE SNOWMAN OBJECTS
  olaf = new Snowman();
  
  // THREE Reindeer OBJECTS
  rudolph = new Reindeer( );
  sven = new Reindeer( 40, 40 );
  
  //
  pacman = new Pacman( 100, 100 );
  
}

void draw() {
  
  // CLEAR BACKGROUND
  background( 0 );
  
  // SVEN - moves right, grows bigger
  sven.illustrate();
  rudolph.illustrate();
  //pacman.illustrate();

  
  // OLAF - moves right, grows bigger
  olaf.moveRight();
  olaf.grow();
  olaf.illustrate();
  
  pacman.move(2);
 // pacman.grow();
  pacman.drawCharacter();
  
  // FROSTY - melts, and will not appear
  //frosty.melt();
  //frosty.illustrate();
  
  // DIRTY - same spot!
  //dirty.illustrate();
  
}

MsPacman pacman;
Ghost inky, pinky, blinky, clyde;

void setup() {
  size(800, 800);
  ellipseMode(CENTER);
  rectMode(CENTER);
  frameRate(30);
  noStroke();

  pacman = new MsPacman(400, 400);
  inky = new Ghost( 100, 100 );
}
void draw() {
  background(0);
  //n.drawCharacter();
  pacman.drawCharacter();
  inky.drawCharacter();
  pacman.moveRight();
  inky.moveRight();
  //pacman.moveLeft();
  //pacman.moveUp();
  //pacman.moveDown();
}

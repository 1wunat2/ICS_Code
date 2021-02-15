public class Pacman {

  //VARIABLES
  private static final int TOTAL_LIVES = 3;
   protected int size, xLoc, yLoc;
  private int lives, direction;
  private boolean mouthOpen;
  protected float p1, p2;

  //CONSTRUCTORS
  public Pacman() {
    this( width/2, height/2);
  }
  public Pacman(int xLoc, int yLoc) {
    this(40, xLoc, yLoc);
  }
  public Pacman(int size) {
    this(size, width/2, height/2);
  }
  public Pacman(int size, int xLoc, int yLoc) {
    //super(size, xLoc, yLoc);
    this.lives = TOTAL_LIVES;
    this.mouthOpen = true;
    this.direction = 1;
  }

  //GETTERS
  public int getSize() {
    return size;
  }
  public int getxLoc() {
    return xLoc;
  }
  public int getyLoc() {
    return yLoc;
  }
  public int getLives() {
    return lives;
  }
  public boolean isMouthOpen() {
    return mouthOpen;
  }
  public int getDirection() {
    return direction;
  }

  //SETTERS
  public void setSize(int size) {
    this.size = size;
  }
  public void setxLoc(int xLoc) {
    this.xLoc = xLoc;
  }
  public void setyLoc(int yLoc) {
    this.yLoc = yLoc;
  }
  public void setmouthOpen(boolean mouthOpen) {
    this.mouthOpen = mouthOpen;
  }

  public void drawCharacter() {
    println( "DRAW PMAN" );
    fill(#FFF700);
    if (mouthOpen) {
      switch(direction) {
      case 1:
        p1 = radians(30);
        p2 = radians(330);
        break;
      case 2:
        p1 = radians(120);
        p2 = radians(420);
        break;
      case 3:
        p1 = radians(210);
        p2 = radians(510);
        break;
      case 4:
        p1 = radians(300);
        p2 = radians(600);
        break;
      }
      stroke(1);
      println( this.xLoc + " " + this.yLoc + " " + this.size + " " + this.size );
      arc(xLoc, yLoc, size, size, p1, p2 );
    } else {
      circle(xLoc, yLoc, size);
    }
  }

  public void move( int dir ) {
    if ( dir == 1 ) {
      xLoc = xLoc + 1;
      direction = 1;
      mouthOpen = !mouthOpen;
    } else if ( dir == 2 ) {
      yLoc = yLoc + 1;
      direction = 2;
      mouthOpen = !mouthOpen;
    } else if (dir == 3 ) {
      xLoc = xLoc - 1;
      direction = 3;
      mouthOpen = !mouthOpen;
    } else if ( dir == 4 ) {
      yLoc = yLoc - 1;
      direction = 4;
      mouthOpen = !mouthOpen;
    }
  }

}

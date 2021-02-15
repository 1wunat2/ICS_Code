public class Pacman extends PacmanCharacter { //<>// //<>// //<>//

  //CONSTANT VARIABLES
  private final int DEFAULT_XLOC = width/2;
  private final int DEFAULT_YLOC = height/2;
  protected static final int TOTAL_LIVES = 3;
  private static final color c = #FFF700;

  //INSTANCE VARIABLES
  protected int lives, direction;
  protected boolean mouthOpen;
  protected float p1, p2;

  //CONSTRUCTORS
  public Pacman() {
    this( width/2, height/2);
  }
  public Pacman(int xLoc, int yLoc) {
    this(DEFAULT_SIZE, xLoc, yLoc);
  }
  public Pacman(int size) {
    this(size, width/2, height/2);
  }
  public Pacman(int size, int xLoc, int yLoc) {
    super(size, xLoc, yLoc);
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

  //ACTIONS
  public void drawCharacter() {
    //println( "DRAW PMAN" );
    fill(c);
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
      //println( this.xLoc + " " + this.yLoc + " " + this.size + " " + this.size );
      arc(xLoc, yLoc, size, size, p1, p2 );
    } else {
      circle(xLoc, yLoc, size);
    }
  }

  public void moveRight() {
    super.moveRight();
    direction = 1;
    mouthOpen = !mouthOpen;
  }
  public void moveLeft() {
    super.moveLeft();
    direction = 3;
    mouthOpen = !mouthOpen;
  }
  public void moveUp() {
    super.moveUp();
    direction = 4;
    mouthOpen = !mouthOpen;
  }
  public void moveDown() {
    super.moveDown();
    direction = 2;
    mouthOpen = !mouthOpen;
  }
}

public abstract class PacmanCharacter implements PacmanCharacterInterface {

  //VARIABLES
  protected int size, xLoc, yLoc;
  protected static final int DEFAULT_SIZE = 50;

  //CONSTRUCTORS
  public PacmanCharacter() {
    this(DEFAULT_SIZE, width/2, height/2);
  }
  public PacmanCharacter(int size) {
    this(size, width/2, height/2);
  }
  public PacmanCharacter(int xLoc, int yLoc) {
    this( DEFAULT_SIZE, xLoc, yLoc );
  }
  public PacmanCharacter(int size, int xLoc, int yLoc) {
    //println( "HERE!" );
    this.size = size;
    this.xLoc = xLoc;
    this.yLoc = yLoc;
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
  //public abstract int getLives() ;
  //public abstract int getDirection();
  //public abstract boolean isMouthOpen();
  //public abstract void setmouthOpen(boolean mouthOpen);

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

  //ACTIONS
  public void moveRight() {
    xLoc = xLoc + 1;
  }
  public void moveLeft() {
    xLoc = xLoc - 1;
  }
  public void moveUp() {
    yLoc = yLoc - 1;
  }
  public void moveDown() {
    yLoc = yLoc + 1;
  }

  public abstract void drawCharacter();
}

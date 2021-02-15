public class Ghost extends PacmanCharacter {

  private static final color c = #FF0303;

  public Ghost() {
    this( width/2, height/2);
  }
  public Ghost(int xLoc, int yLoc) {
    this(40, xLoc, yLoc);
  }
  public Ghost(int size) {
    this(size, width/2, height/2);
  }
  public Ghost(int size, int xLoc, int yLoc) {
    super(size, xLoc, yLoc);
  }

  public void drawCharacter() {
    fill(255);
    arc(xLoc, yLoc, 2*size, 2*size, PI, 2*PI);
    fill(c);
    circle(xLoc + (size - size/2), yLoc-(size) + (size/3), size/5);
    circle(xLoc - (size - size/2), yLoc-(size) + (size/3), size/5);
  }

  /*
   *THIS CODE IS NOT FOR THIS CLASS
   */
  //public int getLives() {
  //  return 0;
  //}
  //public int getDirection() {
  //  return 0;
  //}
  //public boolean isMouthOpen() {
  //  return false;
  //}
  //public void setmouthOpen(boolean mouthOpen){
  //  //LEAVE EMPTY
  //}
}

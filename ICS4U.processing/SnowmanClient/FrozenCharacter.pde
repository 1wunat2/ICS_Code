
public class FrozenCharacter {

  // INSTANCE VARIABLES
  protected int xLoc;
  protected int yLoc;
  protected int sizeFactor;
  protected color colour;
  

  // CONSTRUCTORS
  public FrozenCharacter() {
    this( 100, 100 );
    println( "Snowman() Called" );
  }

  public FrozenCharacter( int x, int y ) {
    this( x, y, color( 255 ) );
    println( "Snowman( int, int ) Called" );
  }

  public FrozenCharacter( int x, int y, color snowColor ) {
    println( "Snowman( int, int, color ) Called" );
    this.xLoc = x;
    this.yLoc = y;
    this.colour = snowColor;
    this.sizeFactor = 100;
  }
  
  public String toString() {
     return "Snowman{" + 
       "xLoc=" + xLoc + ", yLoc=" + yLoc + 
       ", sizeFactor=" + sizeFactor + 
       ", colour=" + colour + '}';
  }
  
  public int getxLoc() {
        return xLoc;
    }

    public void setxLoc( int xLoc ) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc( int yLoc ) {
        this.yLoc = yLoc;
    }

    public int getSizeFactor() {
        return sizeFactor;
    }

    public void setSizeFactor( int sizeFactor ) {
        this.sizeFactor = sizeFactor;
    }

    public color getColour() {
        return colour;
    }

    public void setColour( color colour ) {
        this.colour = colour;
    }

    
  
  public void moveRight() {
     this.xLoc = this.xLoc + 5; 
  }

  public void grow( ) {
    this.sizeFactor = this.sizeFactor + 1;
  }

}

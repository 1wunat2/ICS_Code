
public class Reindeer extends FrozenCharacter {

  // SPEED
  protected int speed;
  
  public Reindeer(  ) {
    super( );
  }
  
  public Reindeer( int x, int y ) {
    super( x, y );
  }

  public void illustrate( ) {

      // HEAD
      fill( 123, 234, 343 );
      rect( this.xLoc, this.yLoc, sizeFactor / 2, sizeFactor / 2 );

  }
}

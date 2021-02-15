
public class Snowman extends FrozenCharacter {

  protected boolean melted;

  public boolean isMelted() {
    return melted;
  }

  public void setMelted( boolean melted ) {
    this.melted = melted;
  }

  public void melt( ) {
    this.melted = true;
  }

  public void illustrate( ) {

    if ( !this.melted ) {
      // HEAD
      fill( this.colour );
      circle( this.xLoc, this.yLoc, sizeFactor / 2 );

      // EYES
      fill( 0 );
      circle( this.xLoc-this.sizeFactor/10, this.yLoc-this.sizeFactor/10, this.sizeFactor/20 );
      circle( this.xLoc+this.sizeFactor/10, this.yLoc-this.sizeFactor/10, this.sizeFactor/20 );

      // NOSE
      fill( #FF7B39 );
      ellipse( this.xLoc, this.yLoc + this.sizeFactor/20, this.sizeFactor/10, this.sizeFactor/5 );
    }
  }
}

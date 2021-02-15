public interface PacmanCharacterInterface {
  //GETTERS
  public int getSize() ;
  public int getxLoc() ;
  public int getyLoc() ;

  //public int getLives() ;  
  //public int getDirection();
  //public boolean isMouthOpen();

  //SETTERS
  public void setSize(int size);
  public void setxLoc(int xLoc);
  public void setyLoc(int yLoc);

  //public void setmouthOpen(boolean mouthOpen);

  //DRAW
  public void drawCharacter();

  //ACTIONS
  public void moveRight();
  public void moveLeft();
  public void moveUp();
  public void moveDown();
}

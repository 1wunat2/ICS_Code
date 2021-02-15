public class MsPacman extends Pacman {
  public MsPacman() {
    super();
  }
  public MsPacman(int xLoc, int yLoc) {
    super(xLoc, yLoc);
  }
  public MsPacman(int size) {
    super(size);
  }
  public MsPacman(int size, int xLoc, int yLoc) {
    super(size, xLoc, yLoc);
  }

  public void drawCharacter() {
    super.drawCharacter();
    fill(#FF03EF);
    rect(xLoc, yLoc, 10, 10);
  }
}

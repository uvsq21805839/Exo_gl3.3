package uvsq.Exo_gl3;

public class Position {
private int x;
private int y;

public Position(final int X, final int Y) {
  this.x = X;
  this.y = Y;
}

public Position() {
      this.x = 0;
      this.y = 0;
}

public void moveX(final int numberOfCases) {
      this.x += numberOfCases;
}

public void moveY(final int numberOfCases) {
      this.y += numberOfCases;
}
/**
 * @return  la position x.
 */
public int getX() {
      return this.x;
}
/**
 * 
 * @return la position y.
 */
public int getY() {
      return this.y;
}

}
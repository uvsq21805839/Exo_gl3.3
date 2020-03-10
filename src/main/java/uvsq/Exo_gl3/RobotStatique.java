package uvsq.Exo_gl3;


public class RobotStatique {
   
    private Position position;
    
    private Direction direction;
    
    public RobotStatique(final Position pos, final Direction direct) {
           this.position = new Position(pos.getX(), pos.getY());
           this.direction = direct;
    }
    
    public void avance() { }

    public Position getPosition() {
       return position;
}

    public Direction getDirection() {
     return direction;
   }

public void setDirection(final Direction direct) {
    this.direction = direct;
}
}
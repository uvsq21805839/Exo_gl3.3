package uvsq.Exo_gl3;

public class Robot1 extends RobotStatique {
 
public Robot1(final Position pos, final Direction direct) {
   super(pos, direct);

}
/**
 * tourne  1/4 tour.
 */
public void tourne() {
    switch (this.getDirection()) {
    case North:
        this.setDirection(Direction.East);
    case South:
        this.setDirection(Direction.West);
    case East:
        this.setDirection(Direction.North);
    case West:
        this.setDirection(Direction.South);
    default:
}
}
/**
 * avance d une case.
 */
@Override

public void avance() {
    switch (this.getDirection()) {
        case North:
            this.getPosition().moveY(1);
        case South:
            this.getPosition().moveY(-1);
        case East:
            this.getPosition().moveX(1);
        case West:
            this.getPosition().moveX(-1);
        default:

    }
}


}
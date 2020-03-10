package uvsq.Exo_gl3;

import java.util.ArrayList;
 
public class Robots {
     
    private ArrayList<RobotStatique> listRobots;
   
    public Robots() {
    	listRobots = new ArrayList<RobotStatique>();
    }
     
    public void addARobot(final RobotStatique robot) {
      this.listRobots.add(robot);
    }
    
    public void avanceTout() {
       for (RobotStatique robot: listRobots) {
          robot.avance();
      }
    }
}
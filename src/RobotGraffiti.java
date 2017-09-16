import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
Robot K = new Robot();
K.moveTo(200,400);
K.penDown();
K.setPenColor(0, 0, 0);
K.setSpeed(10);
K.move (350);
}
}

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	static Robot bob = new Robot("mini");
	
public static void main(String[] args) {

	bob.moveTo(7, 900);
	bob.setSpeed(999);
	bob.penDown();

	
for (int l = 0; l <= 30; l++) {
	int r1 = new Random().nextInt(400);
	house(r1);
}

	
	
}
static void house (int height) {                                      //  45 30 90  30 45
	int r1 = new Random().nextInt(400);
	int r2 = new Random().nextInt(2);
	bob.setPenColor(0,0,0);
	bob.move(height); 
	bob.turn(45);
	bob.move(30);   //hello roof width
	bob.turn(90);
	bob.move(30);
	bob.turn(45);
	bob.move(height); 
	bob.setPenColor(30,255,30);
	bob.turn(-90);
	bob.move(20);    //hello space distance
	bob.turn(-90);

	
}
static void randomThing() {
	
	int r1 = new Random().nextInt(4);
	
	
}
}

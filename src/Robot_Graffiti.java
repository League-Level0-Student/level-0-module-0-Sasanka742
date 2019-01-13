import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {
	
	public static void main(String[] args) {
		Robot r2 = new Robot();
		r2.setSpeed(200);
		r2.turn(-90);
		r2.move(350);
		r2.penDown();
		//letter s
		r2.turn(180);
		r2.move(50);
		r2.turn(-90);
		r2.move(50);
		r2.turn(-90);
		r2.move(50);
		r2.turn(90);
		r2.move(50);
		r2.turn(90);
		r2.move(50);
		//letter a
		r2.penUp();
		r2.move(30);
		r2.turn(90);
		r2.move(50);
		r2.turn(-90);
		r2.move(50);
		r2.turn(90);
		r2.move(50);
		r2.turn(90);
		r2.penDown();
		for(int i=0;i<4;i++) {
			r2.move(50);
			r2.turn(90);
		}
		r2.turn(-120);
		r2.move(20);
		r2.penUp();
		r2.turn(340);
		r2.move(200);
		
		
		
		
		
		
		
		
		
		
		
	
	}

}

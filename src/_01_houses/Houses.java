package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot robo = new Robot();
	public void run() {
		robo.moveTo(50, 550);
		for (int i = 1; i < 11; i++) {
		drawhouse(i*100, Color.black);
		}
		}
	public void drawhouse(int height, Color color) {
		robo.setPenColor(color);
		robo.penDown();
		robo.move(height);
		if (height>240) {
			drawpointyroof(robo);
		}
		else {
			drawflatroof(robo);
		}
		
		robo.move(height);
		robo.turn(-90);
		robo.setPenColor(Color.green);
		robo.move(15);
		robo.turn(-90);
	}
	public void drawhouse(String size, Color color) {
		if(size.equalsIgnoreCase("small")) {
			drawhouse(60, color);
		}
		else if(size.equalsIgnoreCase("medium")) {
			drawhouse(120, color);
		}
		else if(size.equalsIgnoreCase("large")) {
			drawhouse(180, color);
			
		}	
	}
	public void drawpointyroof(Robot robo) {
		robo.turn(45);
		robo.move(15);
		robo.turn(90);
		robo.move(15);
		robo.turn(45);
	}
	public void drawflatroof(Robot robo) {
		robo.turn(90);
		robo.move(30);
		robo.turn(90);
	}
}

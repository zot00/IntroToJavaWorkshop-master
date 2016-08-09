package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		// START HERE
		Robot Flloyd = new Robot();
		Robot Meatball = new Robot();
	//	int playerY = 
		for (int i = 0; i < 4; i++) {
		Flloyd.penDown();
		Flloyd.move(100);
		Flloyd.turn(90);
		Flloyd.move(100);
		}
		Flloyd.moveTo(20, 30);
		Meatball.moveTo(20, 30);
		
	}
}

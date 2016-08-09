package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot clank = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
clank.setSpeed(10);
		// 5. Set the pen width to 5
clank.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
	clank.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare(4);
			// 8. Turn the robot 90 degrees to the right
			clank.turn(90);
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare(int sides) {
	//	JOptionPane.showMessageDialog(null, "yay! you did it!");
		for (int i = 0; i < sides; i++) {
		clank.penDown();
		clank.move(100);
		clank.turn(90);
		clank.move(100);
		}		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}

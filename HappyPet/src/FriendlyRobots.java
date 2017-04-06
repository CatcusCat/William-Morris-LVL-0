import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/**
 * FriendlyRobots: This recipe creates 2 robots in opposite corners of the canvas, and moves them a random distance
 * towards each other until they overlap.
 * 
 *
 */
public class FriendlyRobots {
	// Starting positions
	int xPosLeft = 30;
	int yPosTop = 30;
	int xPosRight = 1200;
	int yPosBottom = 700;

	int maxNumGames = 30;
	int maxMoves = 200;

	public FriendlyRobots() {

		// 1. Create and initialize 2 robots.
Robot sparky = new Robot();
Robot rob = new Robot();
		// 2. fill in the steps(a, b, and c) in the setupRobot method.

		// 3. call the setupRobot method using your two robots.
setupRobot(sparky, Color.blue);
setupRobot(rob, Color.blue);
		// 4. Move robots back to the top-right and bottom-left corners
		rob.setX(xPosLeft);
		rob.setY(yPosTop);
		sparky.setX(xPosRight);
		sparky.setY(yPosTop);
		// 5. do steps 6-10 repeatedly.
		for (int i = 0; i < 100000; i++) {
			
		
			// 6. use both seek methods below to have the robots find eachother.
			//    Note that you will need to do this for both of your robots.
			seekX(rob, sparky);
			seekX(sparky, rob);
			seekY(rob, sparky);
			seekY(sparky, rob);
			// 7. Use the if statement to check whether robot friends have found each other
			if (foundFriend(rob, sparky) == true) {
				// 8. if the robots have found eachother make them sparkle and dance.
				sparky.turn(720);
				rob.turn(-720);
				// 9. print out the number of times the robots had to move before the found eachother.
				JOptionPane.showMessageDialog(null, "The robots moved " + i + " times");
				// 10. Uncomment the break statement to break out of for loop
				break;
			}
		}
		// 11. use a confirmDialog to ask the user if they want to play again.
		//     repeat the game until the user says no.
		int playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
		
	}

	private void setupRobot(Robot robot, Color robotColor) {
		// a. set the speed of the robot
		robot.setSpeed(10);
		// b. set the pen color
		robot.setPenColor(robotColor);
		// c. put the pen down.
		robot.penDown();
	}

	private void seekX(Robot robot, Robot otherRobot) {
		// Move robot a random X distance towards otherRobot
		if (robot.getX() < otherRobot.getX()) {
			robot.setAngle(90);
			robot.move(new Random().nextInt(100));
		} else if (robot.getX() > otherRobot.getX()) {
			robot.setAngle(-90);
			robot.move(new Random().nextInt(100));
		}
		// Keep robot inside canvas
		if (robot.getX() > xPosRight)
			robot.setX(xPosRight);
		else if (robot.getX() < xPosLeft)
			robot.setX(xPosLeft);
	}

	private void seekY(Robot robot, Robot otherRobot) {
		// Move robot a random Y distance towards otherRobot
		if (robot.getY() < otherRobot.getY()) {
			robot.setAngle(180);
			robot.move(new Random().nextInt(100));
		} else if (robot.getY() > otherRobot.getY()) {
			robot.setAngle(0);
			robot.move(new Random().nextInt(100));
		}
		// Keep robot inside canvas
		if (robot.getY() > yPosBottom)
			robot.setY(yPosBottom);
		else if (robot.getY() < yPosTop)
			robot.setY(yPosTop);
	}

	private Boolean foundFriend(Robot robot1, Robot robot2) {
		// Check whether robots are within 10 pixels of each other
		if (Math.abs(robot1.getX() - robot2.getX()) < 30 && Math.abs(robot1.getY() - robot2.getY()) < 30)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		new FriendlyRobots();
	}
}


// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		Tortoise.setSpeed(6);
		// 3. ask the user what color they would like the tortoise to draw
		for (int i = 0; i < 20; i++) {
			String colorChoice = JOptionPane
					.showInputDialog("What color would you like to use to draw? [Red, Blue, & Green]");
			// 4. use an if/else statement to set the pen color that the user
			// requested
			if (colorChoice.equalsIgnoreCase("red")) {
				Tortoise.setPenColor(PenColors.Reds.Crimson);

			}

			else if (colorChoice.equalsIgnoreCase("blue")) {
				Tortoise.setPenColor(PenColors.Blues.CornflowerBlue);
			}

			else if (colorChoice.equalsIgnoreCase("green")) {
				Tortoise.setPenColor(PenColors.Greens.Green);
			}
			// 5. if the user doesn’t enter anything, choose a random color
			else {
				Tortoise.setPenColor(PenColors.getRandomColor());
			}
			// 6. put a loop around your code so that you keep asking the user
			// for more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one
			// line of code)
			Tortoise.move(100);
			Tortoise.turn(90);
			Tortoise.move(100);
			Tortoise.turn(90);
			Tortoise.move(100);
			Tortoise.turn(90);
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
}
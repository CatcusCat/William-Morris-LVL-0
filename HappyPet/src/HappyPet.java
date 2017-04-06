import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happinessLevel = 0;
	static String petName;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in
		// variable
		petName = JOptionPane.showInputDialog("What would you like to name your cat?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 20; i++) {
			if(happinessLevel >= 21) {
				JOptionPane.showMessageDialog(null, "Your pet loves you.  Oh wait it's just a prank.");
				break;
			}
			// 3. Use showOptionDialog to ask the user what they want to do to
			// make
			// their pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do?", "Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Pet", "Feed", "Clean" }, null);

			// 5. Use user input to call the appropriate method created in step
			// 4.

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.

			// 4. Create methods to handle each of your user selections.
			// Each method should create a pop-up with the pet's response (eg.
			// cat
			// might
			// purr when pet),
			// and INCREMENT the pet's happiness Level.
			if (task == 0) {
				pet();
			} else if (task == 1) {
				feed();
			} else if (task == 2) {
				clean();
			}

		}
	}

	static void pet() {
		JOptionPane.showMessageDialog(null, petName + " purred.");
		happinessLevel = happinessLevel + 5;

	}

	static void feed() {
		JOptionPane.showMessageDialog(null,
				petName + " is meowing for you to PUT THE DISH ON THE FLOOR SO IT CAN EAT!!");
		happinessLevel = happinessLevel + 3;
	}

	static void clean() {
		JOptionPane.showMessageDialog(null, petName + " is excited to use the loo.");
		happinessLevel = happinessLevel + 1;
	}
}

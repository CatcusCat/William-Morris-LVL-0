import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		String numOne = JOptionPane.showInputDialog("Choose your first number.");
		String numTwo = JOptionPane.showInputDialog("Choose your second number.");
		int num1 = Integer.parseInt(numOne);
		int num2 = Integer.parseInt(numTwo);
		// 1. Get 2 numbers from the user and convert them to integer.
		int selection = JOptionPane.showOptionDialog(null, "What operation would you like to preform?",
				"SimpleCalculator", 0, JOptionPane.QUESTION_MESSAGE, null,
				new String[] { "Multiply", "Divide", "Add", "Subtract" }, null);
				// 2. Customize pop-up to support add/subtract/multiply/divide
				// operations.

		// 5. Call the methods created in steps 3 and 4 to perform the
		// appropriate operation
		// based on user request.
		if (selection == 0) {
			multiply(num1, num2);
		}

		else if (selection == 1) {
			divide(num1, num2);
		} else if (selection == 2) {
			add(num1, num2);
		} else if (selection == 3) {
			subtract(num1, num2);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator
		// operations.

	}

	// 3. Create method for addition operation.

	// Method should create pop-up that shows equation and solution, eg. 45 + 25
	// = 70.
	// HINT: use 'static void add(int num1, int num2) { ... }
	public static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, (num1 + num2));
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	public static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, (num1 - num2));
	}

	public static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, (num1 / num2));
	}

	public static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, (num1 * num2));
	}
}

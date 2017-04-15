import javax.swing.JOptionPane;

public class Fibonacci {
	
public static void main(String[] args) {
	
	
	int last = 1;
	int New = first + last;
	
	for (int i = 0; i < 1000; i++) {
		int first = JOptionPane.showMessageDialog(null, New + last);
	}
	}
}

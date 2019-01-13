import javax.swing.JOptionPane;

public class I_know_what_you_did {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you played video games last summer, "+name+". Muhahaha!");
	}
}

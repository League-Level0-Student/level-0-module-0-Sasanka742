import javax.swing.JOptionPane;

public class Everything_is_awesome {
	public static void main(String[] args) {
		String favorite = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, favorite+" is awesome!");
	}
}
